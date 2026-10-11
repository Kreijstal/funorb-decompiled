/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private qh field_nb;
    private jh field_S;
    private int field_b;
    private jh field_g;
    private jh field_bb;
    private qh field_j;
    private String field_P;
    private int field_x;
    private jh field_N;
    private jh field_db;
    private os field_k;
    private String[] field_ab;
    private os field_F;
    private int field_D;
    private ub field_E;
    private int[][] field_G;
    private int field_u;
    private os field_M;
    private int[][] field_q;
    static bi field_R;
    private boolean field_Y;
    private os field_V;
    private boolean field_I;
    private qh field_J;
    static String field_L;
    private qr field_O;
    private jh field_a;
    private int field_w;
    private qh field_cb;
    private bi field_T;
    private boolean field_v;
    private qh field_e;
    private String[][] field_l;
    private os field_m;
    private os field_lb;
    private int[][] field_C;
    static qr field_h;
    private String field_r;
    private int field_U;
    private int field_fb;
    private int field_jb;
    private int[] field_p;
    private int[][] field_Z;
    private pf field_B;
    private int[] field_ob;
    private boolean field_ib;
    jh field_X;
    jh field_d;
    private jh field_mb;
    private os field_K;
    private bi field_eb;
    private boolean[] field_z;
    private jh field_f;
    private int field_H;
    private jh field_gb;
    private km field_s;
    private String field_o;
    private int field_kb;
    private jh field_n;
    static String field_i;
    static jo field_A;
    private pf field_y;
    private jh field_W;
    private int field_Q;
    private jh field_hb;
    private om field_t;
    static int[] field_c;

    final void a(int param0, int param1) {
        boolean stackIn_10_0 = false;
        StringBuilder stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        em var3 = null;
        int var3_int = 0;
        ad var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        jh var5 = null;
        qk var6 = null;
        sd var7 = null;
        String var8 = null;
        int var9 = 0;
        int var4Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_s.field_m == 2 &&
            param1 != 2) {
            var3 = (em) (this.field_e.field_x);
            var4 = 0;
            while (!(var3.field_d.length <= var4)) {
              var5 = var3.field_d[var4];
              var6 = var3.field_i[var4];
              var7 = (sd) (var5.field_h);
              stackOut_9_0 = var5.f(244874369);
              stackIn_27_0 = stackOut_9_0 ? 1 : 0;
              stackIn_10_0 = stackOut_9_0;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_10_0) {
                var5.e((byte) 37);
                if (0 == var7.field_x) {
                  var8 = pe.field_F;
                } else {
                  stackIn_22_0 = new StringBuilder().append(hd.field_j).append(" ");
                  if (var7.field_x != 1) {
                    stackIn_23_1 = re.a(d.field_c, 4371, new String[]{Integer.toString(var7.field_x)});
                  } else {
                    stackIn_23_1 = ad.field_a;
                  }
                  var8 = ((StringBuilder) (Object) stackIn_22_0).append(stackIn_23_1).toString();
                }
                var6.field_o = var8;
                var5.field_o = var8;
              }
              var4++;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_s.field_m = param1;
            stackIn_27_0 = 0;
          }
          var3_int = stackIn_27_0;
          do {
            if (!(var3_int < this.field_s.field_z.field_z.length)) {
              if (param0 > -70) {
                this.field_P = (String) null;
              }
              break;
            }
            this.field_s.field_z.field_z[var3_int] = 0;
            var3_int++;
          } while (var9 == 0);
          var3_ref = (ad) (this.field_k.field_v);
          var3_ref.field_e.a(-2948, (bi) null);
          if (this.field_s.field_z.field_T == -1 &&
            !this.field_s.field_L) {
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder7 = true;
            boolean decompiledFrameRemainder6 = true;
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder0 = true;
            var4Lifetime1 = param1;
            if ((var4Lifetime1 != 0 ||
              var9 != 0) &&
              (decompiledFrameRemainder0 = (var4Lifetime1 != 1)) &&
              (decompiledFrameRemainder3 = (var4Lifetime1 != 2)) &&
              (decompiledFrameRemainder4 = (var4Lifetime1 != 3)) &&
              (decompiledFrameRemainder5 = (4 != var4Lifetime1 ||
              var9 != 0)) &&
              (decompiledFrameRemainder6 = (5 != var4Lifetime1)) &&
              (decompiledFrameRemainder7 = (6 != var4Lifetime1 ||
              var9 != 0)) &&
              (decompiledFrameRemainder2 = (7 == var4Lifetime1))) {
              decompiledFrameRemainder1 = (var9 != 0);
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.a(10, 0, ub.field_Bb);
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, gi.field_b);
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, re.a(wp.field_c, 4371, new String[]{this.field_s.field_c.field_q.field_I, Integer.toString(this.field_s.field_c.field_x)}));
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, ol.field_l);
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, mr.field_c);
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder7) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, li.field_e);
              if (var9 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              this.a(10, 0, i.field_f);
              if (var9 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder2) {
              this.a(10, 0, ml.field_k);
              if (var9 == 0) {
                return;
              }
            }
            this.a(10, 0, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref2), "kq.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        int[][] discarded$0 = null;
        fs stackIn_50_0 = null;
        fs stackIn_50_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var3Lifetime1;
        ln var5Lifetime1;
        ln[] var3Lifetime2;
        ln[] var3Lifetime3;
        ln var5Lifetime2;
        ln var5Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_s.a(param0, 24);
          if (param1 != 4705) {
            discarded$0 = this.j(59);
          }
          var3_int = param0;
          if (var3_int != 0) {
            if (var3_int == 1) {
              this.a(-103, 4);
              var3 = this.field_s.field_P.field_g.field_e;
              var4 = 0;
              while (var3.length > var4) {
                var5 = var3[var4];
                if (var9 != 0) {
                  return;
                }
                if (this.field_s.field_n == var5.field_y &&
                  var5.field_L == 0) {
                  this.field_s.field_z.field_z[var5.field_p] = 2;
                }
                var4++;
              }
              return;
            }
            if (var3_int == 2) {
              this.a(param1 ^ -4613, 5);
              var3Lifetime2 = this.field_s.field_P.field_g.field_e;
              var4Lifetime2 = 0;
              while (var4Lifetime2 < var3Lifetime2.length) {
                var5Lifetime2 = var3Lifetime2[var4Lifetime2];
                if (var9 != 0) {
                  return;
                }
                stackIn_50_0 = var5Lifetime2.field_y;
                stackIn_50_1 = this.field_s.field_n;
                if (stackIn_50_0 != stackIn_50_1 && (null == var5Lifetime2.field_y ||
                  !this.field_s.field_n.field_h[var5Lifetime2.field_y.field_x] ||
                  var9 != 0)) {
                  var6 = var5Lifetime2.field_D;
                  var7 = 0;
                  while (var6.length > var7) {
                    var8 = var6[var7];
                    stackIn_50_0 = this.field_s.field_n;
                    stackIn_50_1 = var8.field_y;
                    if (stackIn_50_0 == stackIn_50_1) {
                      this.field_s.field_z.field_z[var5Lifetime2.field_p] = 2;
                      break;
                    }
                    var7++;
                  }
                }
                var4Lifetime2++;
                continue;
              }
              return;
            }
            if (var3_int != 3) {
              return;
            }
            if (var9 == 0) {
              this.a(-111, 6);
              var3Lifetime3 = this.field_s.field_P.field_g.field_e;
              var4Lifetime3 = 0;
              while (true) {
                if (var4Lifetime3 >= var3Lifetime3.length) {
                  return;
                }
                var5Lifetime3 = var3Lifetime3[var4Lifetime3];
                if (this.field_s.field_n == var5Lifetime3.field_y) {
                  this.field_s.field_z.field_z[var5Lifetime3.field_p] = 2;
                }
                var4Lifetime3++;
              }
            }
          }
          this.a(param1 ^ -4629, 3);
          var3Lifetime1 = this.field_s.field_P.field_g.field_e;
          var4Lifetime1 = 0;
          while (var4Lifetime1 < var3Lifetime1.length) {
            var5Lifetime1 = var3Lifetime1[var4Lifetime1];
            if (var9 != 0) {
              break;
            }
            if (var5Lifetime1.field_y == this.field_s.field_n &&
              !var5Lifetime1.field_u) {
              this.field_s.field_z.field_z[var5Lifetime1.field_p] = 2;
            }
            var4Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "kq.GA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(String param0, int param1) {
        int stackIn_48_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln[] var2 = null;
        int var2_int = 0;
        String var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        ln[] var2Lifetime1;
        String var2_refLifetime1;
        String var2_refLifetime2;
        String var2_refLifetime3;
        String var2_refLifetime4;
        ln var4Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (qj.a(true, (CharSequence) ((Object) "stage"), (CharSequence) ((Object) param0))) {
            var2_int = Integer.parseInt(param0.substring(6));
            no.a(-92, var2_int);
            oq.field_a.a(2);
            return;
          }
          if (param1 != 7) {
            return;
          }
          if (param0.equalsIgnoreCase("zoomtohome")) {
            oq.field_a.field_z.a(39, ho.field_d.field_m.field_q, 200.0f);
            return;
          }
          if (param0.equalsIgnoreCase("closetohome")) {
            oq.field_a.field_z.a(ho.field_d.field_m.field_q, 126);
            return;
          }
          if (param0.equalsIgnoreCase("zoomtowarning")) {
            var2 = oq.field_a.field_P.field_g.field_e;
            var3 = 0;
            while (var2.length > var3) {
              var4 = var2[var3];
              if (var4.field_y == ho.field_d &&
                !oq.field_a.field_V[var4.field_p]) {
                oq.field_a.field_z.a(92, var4, 300.0f);
                return;
              }
              var3++;
              if (var5 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (param0.equalsIgnoreCase("zoomOut")) {
            oq.field_a.field_z.c(false);
            return;
          }
          if (param0.equalsIgnoreCase("zoom12")) {
            oq.field_a.field_z.a(oq.field_a.field_P.field_g.field_e[12], 124);
          }
          boolean decompiledFrameCompleted0 = true;
          if (param0.equalsIgnoreCase("zoomDerelict")) {
            var2Lifetime1 = oq.field_a.field_P.field_g.field_e;
            var3Lifetime1 = 0;
            while (var2Lifetime1.length > var3Lifetime1) {
              var4Lifetime1 = var2Lifetime1[var3Lifetime1];
              stackIn_48_0 = var4Lifetime1.field_B;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_48_0 >= 6) {
                oq.field_a.field_z.a(var4Lifetime1, param1 ^ 121);
                break;
              }
              var3Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_48_0 = param0.equalsIgnoreCase("block") ? 1 : 0;
          }
          if (stackIn_48_0 != 0) {
            is.field_b = true;
            return;
          }
          if (param0.equalsIgnoreCase("capture1")) {
            var2_intLifetime1 = ma.a((CharSequence) ((Object) param0.substring(9)), 2);
            id.field_d = oq.field_a.field_P.field_g.field_e[var2_intLifetime1];
            uq.field_m.a(pa.a(id.field_d, param1 ^ -9), 27275, "capture1");
            return;
          }
          if (param0.equalsIgnoreCase("showtabs")) {
            return;
          }
          if (param0.equalsIgnoreCase("startai")) {
            var2_intLifetime2 = 1;
            while (var2_intLifetime2 < oq.field_a.field_s.length) {
              oq.field_a.field_s[var2_intLifetime2].a(true, -6861);
              var2_intLifetime2++;
              if (var5 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          if (qj.a(true, (CharSequence) ((Object) "enable"), (CharSequence) ((Object) param0))) {
            var2_ref = param0.substring(7).trim();
            if (var2_ref.endsWith("Button")) {
              oq.field_a.field_Y.a(var2_ref, true, param1 - 15023);
            }
            if (var2_ref.equalsIgnoreCase("animationControls")) {
              oq.field_a.field_Y.field_K.field_s = true;
              oq.field_a.field_Y.field_N.g(86);
            }
            return;
          }
          if (qj.a(true, (CharSequence) ((Object) "disable"), (CharSequence) ((Object) param0))) {
            var2_refLifetime1 = param0.substring(8).trim();
            if (var2_refLifetime1.endsWith("Button")) {
              oq.field_a.field_Y.a(var2_refLifetime1, false, param1 ^ -15009);
            }
          }
          if (qj.a(true, (CharSequence) ((Object) "hide"), (CharSequence) ((Object) param0))) {
            var2_refLifetime2 = param0.substring(4).trim();
            oq.field_a.field_Y.a(var2_refLifetime2, false, (byte) 31);
            return;
          }
          if (qj.a(true, (CharSequence) ((Object) "show"), (CharSequence) ((Object) param0))) {
            var2_refLifetime3 = param0.substring(4).trim();
            oq.field_a.field_Y.a(var2_refLifetime3, true, (byte) 31);
            return;
          }
          if (qj.a(true, (CharSequence) ((Object) "highlight"), (CharSequence) ((Object) param0))) {
            var2_refLifetime4 = param0.substring(10).trim();
            if (var2_refLifetime4.equalsIgnoreCase("wormholes")) {
              er.field_g = true;
              return;
            }
            if (var2_refLifetime4.equalsIgnoreCase("borders")) {
              tl.field_u = true;
              return;
            }
            if (var2_refLifetime4.equalsIgnoreCase("garrison")) {
              me.field_j = true;
              return;
            }
            if (var2_refLifetime4.equalsIgnoreCase("resources")) {
              td.field_L = true;
              return;
            }
            if (var2_refLifetime4.equalsIgnoreCase("productionHammer")) {
              se.field_k = true;
              return;
            }
            if (var2_refLifetime4.equalsIgnoreCase("ready")) {
              ph.field_g = true;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          stackIn_120_0 = var2_ref2;
          stackIn_120_1 = new StringBuilder().append("kq.U(");
          if (param0 == null) {
            stackIn_121_2 = "null";
          } else {
            stackIn_121_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_120_0), ((StringBuilder) (Object) stackIn_120_1).append(stackIn_121_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, fs param1) {
        int stackIn_16_0 = 0;
        fe[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        ff[][] stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        lp[] stackIn_27_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_84_0 = 0;
        String stackIn_92_0 = null;
        fs stackIn_115_0 = null;
        int stackIn_122_0 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        ph var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fe var5 = null;
        fs var5_ref = null;
        ff[] var6_ref_ff__ = null;
        int var6 = 0;
        lp var7 = null;
        int var8_int = 0;
        String var8 = null;
        vd var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var8_intLifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 > -10) {
            return;
          }
          if (this.field_s.field_W &&
            kb.field_x < 6) {
            return;
          }
          var3 = (ph) (this.field_J.field_x);
          if (this.field_s.field_n != null &&
            param1 != this.field_s.field_n) {
            stackIn_16_0 = (param1.field_x >= this.field_s.field_n.field_x) ? 0 : 1;
            var4 = stackIn_16_0;
            stackIn_19_0 = var3.field_i;
            if (var4 == 0) {
              stackIn_20_1 = param1.field_x - 1;
            } else {
              stackIn_20_1 = param1.field_x;
            }
            var5 = stackIn_19_0[stackIn_20_1];
            stackIn_23_0 = var3.field_f;
            if (var4 == 0) {
              stackIn_24_1 = param1.field_x;
            } else {
              stackIn_24_1 = 1 + param1.field_x;
            }
            var6_ref_ff__ = stackIn_23_0[stackIn_24_1];
            stackIn_27_0 = var3.field_h;
            if (var4 != 0) {
              stackIn_28_1 = 1 + param1.field_x;
            } else {
              stackIn_28_1 = param1.field_x;
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted0 = true;
            var7 = stackIn_27_0[stackIn_28_1];
            if (0 == (this.field_s.field_P.field_w & 1 << param1.field_x)) {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameRemainder1 = true;
              if (!param1.field_h[this.field_s.field_n.field_x]) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted4 = true;
                boolean decompiledFrameCompleted3 = true;
                if ((1 << this.field_s.field_n.field_x & param1.field_A) == 0) {
                  if (0 == (1 << param1.field_x & this.field_s.field_n.field_A)) {
                    var5.a((byte) 2, 3375155, eb.field_e);
                    var7.field_o = re.a(jg.field_f, 4371, new String[]{param1.field_t});
                    var9 = (vd) (var7.field_l.d(0));
                    while (null != var9) {
                      var9.field_o = re.a(jg.field_f, 4371, new String[]{param1.field_t});
                      var9 = (vd) (var7.field_l.a((byte) -71));
                      if (var11 != 0) {
                        decompiledFrameCompleted4 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted4) {
                      decompiledFrameRemainder0 = (var11 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted4)) {
                    var5.a((byte) -54, 3375155, il.field_hb);
                    var7.field_o = re.a(gn.field_x, 4371, new String[]{param1.field_t});
                    var9 = (vd) (var7.field_l.d(0));
                    while (null != var9) {
                      var9.field_o = re.a(gn.field_x, 4371, new String[]{param1.field_t});
                      var9 = (vd) (var7.field_l.a((byte) -71));
                      if (var11 != 0) {
                        decompiledFrameCompleted3 = false;
                        break;
                      }
                    }
                    if (decompiledFrameCompleted3) {
                      decompiledFrameRemainder0 = (var11 != 0);
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted4) &&
                  (decompiledFrameCompleted3)) {
                  var5.a((byte) -109, 3375155, fb.field_gc);
                  var7.field_o = re.a(mf.field_u, 4371, new String[]{param1.field_t});
                  var9 = (vd) (var7.field_l.d(0));
                  while (var9 != null) {
                    var9.field_o = re.a(mf.field_u, 4371, new String[]{param1.field_t});
                    var9 = (vd) (var7.field_l.a((byte) -71));
                    if (var11 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted2) {
                  var8_int = -1;
                  decompiledFrameRemainder1 = (var11 != 0);
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameCompleted2)) {
                var8_int = this.field_s.field_n.field_k;
                var5.a((byte) -83, 9386040, re.a(jb.field_e, 4371, new String[]{Integer.toString(param1.field_f[this.field_s.field_n.field_x])}));
                var7.field_o = null;
                var9 = (vd) (var7.field_l.d(0));
                while (var9 != null) {
                  var9.field_o = null;
                  var9 = (vd) (var7.field_l.a((byte) -71));
                  if (var11 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var6_ref_ff__[0].a(-2948, ne.a(var8_int, false));
              }
              if (decompiledFrameCompleted2) {
                var9_int = 1;
                while (var6_ref_ff__.length > var9_int) {
                  var10 = -1 + var9_int;
                  if (var11 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (this.field_s.field_n.field_x <= var10) {
                    var10++;
                  }
                  if (var10 >= param1.field_x) {
                    var10++;
                    if (~var10 == ~this.field_s.field_n.field_x) {
                      var10++;
                    }
                  }
                  if (!param1.field_h[var10]) {
                    stackIn_84_0 = -1;
                  } else {
                    stackIn_84_0 = this.field_s.field_P.field_v[var10].field_k;
                  }
                  var8_intLifetime1 = stackIn_84_0;
                  var6_ref_ff__[var9_int].a(-2948, wm.a(var8_intLifetime1, 0));
                  var9_int++;
                }
                if (decompiledFrameCompleted0) {
                  decompiledFrameRemainder2 = (var11 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameCompleted2) &&
              (decompiledFrameCompleted0)) {
              if ((this.field_s.field_P.field_f & 1 << param1.field_x) == 0) {
                stackIn_92_0 = of.field_d;
              } else {
                stackIn_92_0 = he.field_l;
              }
              var8 = stackIn_92_0;
              var5.a((byte) 122, 0, var8);
              var6_ref_ff__[0].a(-2948, ne.a(-1, false));
              var9_int = 1;
              do {
                if (var9_int >= var6_ref_ff__.length) {
                  var7.field_o = null;
                  break;
                }
                var6_ref_ff__[var9_int].a(-2948, wm.a(-1, 0));
                var9_int++;
              } while (var11 == 0);
              var9 = (vd) (var7.field_l.d(0));
              while (null != var9) {
                var9.field_o = null;
                var9 = (vd) (var7.field_l.a((byte) -71));
                if (var11 != 0) {
                  return;
                }
              }
            }
            if (var11 == 0) {
              return;
            }
          }
          var4 = 0;
          while (!(var3.field_f[0].length <= var4)) {
            if (var11 != 0) {
              return;
            }
            if (param1.field_x <= var4) {
              stackIn_115_0 = this.field_s.field_P.field_v[var4 + 1];
            } else {
              stackIn_115_0 = this.field_s.field_P.field_v[var4];
            }
            var5_ref = stackIn_115_0;
            if (param1.field_h[var5_ref.field_x] &&
              (this.field_s.field_P.field_w & 1 << var5_ref.field_x) == 0) {
              stackIn_122_0 = var5_ref.field_k;
            } else {
              stackIn_122_0 = -1;
            }
            var6 = stackIn_122_0;
            if (var4 != 0) {
              var3.field_f[0][var4].a(-2948, wm.a(var6, 0));
            } else {
              var3.field_f[0][var4].a(-2948, ne.a(var6, false));
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_133_0 = var3_ref;
          stackIn_133_1 = new StringBuilder().append("kq.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_134_2 = "null";
          } else {
            stackIn_134_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_133_0), ((StringBuilder) (Object) stackIn_133_1).append(stackIn_134_2).append(')').toString());
        }
    }

    private final void a(String param0, boolean param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0.startsWith("production")) {
            this.field_mb.field_s = param1;
          }
          if (param0.startsWith("projects")) {
            this.field_S.field_s = param1;
          }
          if (param0.startsWith("fleets")) {
            this.field_W.field_s = param1;
          }
          if (param0.startsWith("diplomacy")) {
            this.field_n.field_s = param1;
          }
          if (param2 != -15016) {
            return;
          }
          if (param0.startsWith("victory") &&
            this.field_g != null) {
            this.field_g.field_s = param1;
          }
          if (param0.startsWith("turn")) {
            this.field_bb.field_s = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("kq.BB(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        bi stackIn_48_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        String stackIn_117_0 = null;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_151_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var14 = null;
        int var15 = 0;
        int[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        vd var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33_int = 0;
        String var33 = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_173_0Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20_intLifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22Lifetime1;
        int var22Lifetime2;
        int var24_intLifetime1;
        int var27Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33_intLifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var18Lifetime3;
        int var19Lifetime3;
        int var20_intLifetime2;
        int var21Lifetime4;
        int var22Lifetime3;
        int var31Lifetime2;
        int var32Lifetime2;
        int var34Lifetime2;
        int var35Lifetime2;
        int var19Lifetime2Lifetime1;
        int var34Lifetime1Lifetime1;
        var40 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 32;
          if (param1 < 32) {
            var3_int = param1;
          }
          boolean decompiledFrameRemainder1 = true;
          var4 = re.a(20, 32, var3_int, 550, 0);
          sn.a(640, 101, 480, 192 + (-var3_int + 32 << 6) / 32, 0, 0);
          var5 = (640 - var4) / 2;
          var6 = 80;
          var7 = 360;
          if (fj.field_t.field_h == 2) {
            sn.a(var4, -104, var7, (32 - var3_int << 7) / 32 + 128, var5, var6);
            var8 = qh.a((bi) null, var6, var4, var5, -1, var7);
            bs.a(var8, 93);
            gf.b(3, 3, 0, 0, var4, var7);
            cg.i(0);
            var8.a(var5, var6, (var3_int << 7) / 32);
            decompiledFrameRemainder1 = (var40 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (fj.field_t.field_h != 1) {
              if (fj.field_t.field_h == 0) {
                if (var3_int != 32) {
                  gf.c(var5, var6, var4, var7, 855316, (var3_int << 8) / 32);
                  if (var40 != 0) {
                    gf.d(var5, var6, var4, var7, 855316);
                    sn.a(var4, -117, var7, 128 + (-var3_int + 32 << 7) / 32, var5, var6);
                  }
                } else {
                  gf.d(var5, var6, var4, var7, 855316);
                  if (var40 != 0) {
                    sn.a(var4, -117, var7, 128 + (-var3_int + 32 << 7) / 32, var5, var6);
                  }
                }
              }
            } else {
              sn.a(var4, -117, var7, 128 + (-var3_int + 32 << 7) / 32, var5, var6);
            }
          }
          ga.a(var7, var6, var5, (byte) -60, var4);
          var8_array = new int[4];
          gf.a(var8_array);
          gf.d(var5, var6, var5 + var4, var6 + var7);
          var9 = 0;
          var10 = 0;
          var11 = this.field_s.field_P.field_z ? 1 : 0;
          var12 = 111 % ((param0 + 66) / 34);
          if (var11 != 0 &&
            0 > this.field_s.field_P.field_k) {
            stackIn_29_0 = 1;
          } else {
            stackIn_29_0 = 0;
          }
          var13 = stackIn_29_0;
          if (this.field_s.field_n != null) {
            stackIn_36_0 = (this.field_s.field_n.field_x != this.field_s.field_P.field_k) ? 0 : 1;
            var9 = stackIn_36_0;
            if ((this.field_s.field_P.field_w & 1 << this.field_s.field_n.field_x) == 0 &&
              !this.field_s.field_P.field_x.a((byte) 108, this.field_s.field_n)) {
              stackIn_43_0 = 0;
            } else {
              stackIn_43_0 = 1;
            }
            var10 = stackIn_43_0;
          }
          if (var10 != 0) {
            stackIn_48_0 = dp.field_s;
          } else {
            stackIn_48_0 = ce.field_v;
          }
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameRemainder0 = true;
          var14 = stackIn_48_0;
          var15 = this.field_s.field_P.field_r;
          var16 = this.j(410);
          var17 = var4 - 40;
          if (this.field_Q == 0 ||
            null == var16) {
            var18 = 0;
            while (var18 < 240) {
              var19 = var18 + (var6 + 20);
              var20_int = 20 + var5;
              var21 = -40 + var4;
              stackIn_81_0 = 320;
              stackIn_81_1 = var21;
              if (var40 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
              if (stackIn_81_0 < stackIn_81_1) {
                var21 = 320;
              }
              var22 = 0;
              if (var21 >= 0) {
                am.a(var20_int, var18, var14, var22, var21, var19, (byte) -107);
                gf.a(-1 + var20_int, var19, 16777215);
                gf.a(var20_int + var21, var19, 16777215);
              }
              var18++;
            }
            if (decompiledFrameCompleted4) {
              decompiledFrameRemainder0 = (var40 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted4)) {
            var18Lifetime3 = 0;
            while (var18Lifetime3 < 240) {
              var19Lifetime3 = var18Lifetime3 + 20 + var6;
              var20_intLifetime2 = 20 + var5;
              var21Lifetime4 = -40 + var4;
              stackIn_81_0 = -321;
              stackIn_81_1 = ~var21Lifetime4;
              if (var40 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (stackIn_81_0 > stackIn_81_1) {
                var21Lifetime4 = 320;
              }
              var22Lifetime3 = 0;
              if (var21Lifetime4 >= 0 ||
                var40 != 0) {
                ml.a(var19Lifetime3, var21Lifetime4, var18Lifetime3, var20_intLifetime2, var14, var22Lifetime3, 16403);
                gf.f(var20_intLifetime2, var19Lifetime3, var21Lifetime4, 0, 192);
                gf.a(var20_intLifetime2 - 1, var19Lifetime3, 16777215);
                gf.a(var20_intLifetime2 + var21Lifetime4, var19Lifetime3, 16777215);
              }
              var18Lifetime3++;
            }
          }
          if ((decompiledFrameCompleted4) &&
            (decompiledFrameCompleted3)) {
            stackIn_81_0 = var17;
            stackIn_81_1 = 320;
          }
          if (stackIn_81_0 > stackIn_81_1) {
            var17Lifetime1 = 320;
          }
          boolean decompiledFrameCompleted2 = true;
          if (this.field_Q != 0 &&
            this.field_Q != 25 &&
            var16 != null) {
            var18Lifetime1 = 0;
            while (var18Lifetime1 < 240) {
              var19Lifetime1 = var18Lifetime1 + (var6 + 20);
              var20_intLifetime1 = var5 + 20;
              var21Lifetime1 = -40 + var4;
              stackIn_102_0 = var21Lifetime1;
              stackIn_102_1 = 320;
              if (var40 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_102_0 > stackIn_102_1) {
                var21Lifetime1 = 320;
              }
              var22Lifetime1 = 0;
              if (var21Lifetime1 >= 0) {
                ld.a(var18Lifetime1, var20_intLifetime1, var21Lifetime1, var19Lifetime1, -68, var22Lifetime1, -this.field_Q + 256, var14);
              }
              var18Lifetime1++;
            }
          }
          if (decompiledFrameCompleted2) {
            gf.f(20 + var5 - 1, 20 + var6 - 1, 322, 16777215);
            gf.f(-1 + (20 + var5), 20 + var6 + 240, 322, 16777215);
            stackIn_102_0 = var5 + 320;
            stackIn_102_1 = 125;
          }
          var18Lifetime2 = stackIn_102_0 + stackIn_102_1;
          if (var9 == 0) {
            if (var10 != 0) {
              stackIn_117_0 = (String) (field_L);
            } else {
              if (var13 != 0) {
                stackIn_117_0 = ef.field_c;
              } else {
                if (var11 == 0) {
                  stackIn_117_0 = null;
                } else {
                  stackIn_117_0 = fj.field_o;
                }
              }
            }
          } else {
            stackIn_117_0 = fj.field_o;
          }
          var20 = stackIn_117_0;
          if (this.field_s.field_n == null &&
            var13 == 0) {
            var20 = " ";
          }
          mp.field_b.c(var20, var18Lifetime2, 27 + var6, 16777215, -1);
          var21Lifetime2 = -10 + (40 + var5) + 320;
          var22Lifetime2 = 40 + var6;
          var23 = 4 * this.field_D;
          var17Lifetime2 = -40 + var4;
          var24_int = 0;
          L33: while (true) {
            if (var24_int < 4) {
              this.b(var24_int, var22Lifetime2, var21Lifetime2, 85, var23);
              var23++;
              var22Lifetime2 = var22Lifetime2 + (8 + this.field_ob[var24_int]);
              var24_int++;
              if (var40 == 0) {
                continue;
              }
            } else {
              if (var17Lifetime2 <= 320) {
                break L33;
              }
            }
            var17Lifetime2 = 320;
            break;
          }
          L36: {
            gf.d(20 + var5, var6 + 20, var17Lifetime2 + (var5 + 20), var6 + 20 + 240);
            if (this.field_Q != 0 &&
              var16 != null) {
              var24_intLifetime1 = var16[0].length;
              var25 = 1;
              var26 = 0;
              while (true) {
                stackIn_140_0 = ~var26;
                stackIn_140_1 = ~var15;
                if (stackIn_140_0 > stackIn_140_1) {
                  stackIn_151_0 = 0;
                  if (var40 == 0) {
                    var27 = stackIn_151_0;
                    while (var24_intLifetime1 > var27) {
                      stackIn_140_0 = ~var16[var26][var27];
                      stackIn_140_1 = ~var25;
                      if (stackIn_140_0 < stackIn_140_1) {
                        var25 = var16[var26][var27];
                      }
                      var27++;
                    }
                    var26++;
                    continue;
                  }
                } else {
                  var26 = 320;
                  stackIn_151_0 = 222;
                }
                var27Lifetime1 = stackIn_151_0;
                var21Lifetime3 = var5 + 20;
                var28 = var27Lifetime1 + (20 + var6);
                var29 = this.field_fb - 1 << 10;
                if (this.field_kb != 0) {
                  var29 = -1024 + re.a(this.field_H << 10, 32, this.field_kb, this.field_fb << 10, 0);
                }
                boolean decompiledFrameCompleted1 = true;
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameRemainder2 = true;
                if (this.field_Q != 256) {
                  var30 = 0;
                  while (true) {
                    stackIn_156_0 = var30;
                    if (stackIn_156_0 < var15) {
                      var19Lifetime2 = this.field_s.field_P.field_v[var30].field_s;
                      var31 = var21Lifetime3;
                      var32 = -(var16[var30][0] * var27Lifetime1 / var25) + var28;
                      var34 = var32;
                      stackIn_188_0 = 1;
                      if (var40 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      var35 = stackIn_188_0;
                      while (var35 < var24_intLifetime1) {
                        var36 = var26 * var35 / (var24_intLifetime1 - 1) + var21Lifetime3;
                        var37 = var16[var30][var35];
                        var33_int = -(var27Lifetime1 * var37 / var25) + var28;
                        stackIn_156_0 = 0;
                        var38 = stackIn_156_0;
                        while (var38 < (var36 - var31)) {
                          var39 = re.a(var32, -var31 + var36, var38, var33_int, 0);
                          gf.g(var31 - (-var38 + 1), var34, var31 + var38, var39, var19Lifetime2, this.field_Q);
                          var34 = var39;
                          var38++;
                        }
                        var31 = var36;
                        var32 = var33_int;
                        var35++;
                      }
                      var30++;
                      continue;
                    }
                    break;
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder2 = (var40 != 0);
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameCompleted1)) {
                  var30 = 0;
                  while (true) {
                    stackIn_173_0 = var15;
                    if (stackIn_173_0 <= var30) {
                      break;
                    }
                    var19Lifetime2Lifetime1 = this.field_s.field_P.field_v[var30].field_s;
                    var31Lifetime2 = var21Lifetime3;
                    var32Lifetime2 = var28 - var27Lifetime1 * var16[var30][0] / var25;
                    var34Lifetime2 = var32Lifetime2;
                    stackIn_188_0 = 1;
                    if (var40 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    var35Lifetime2 = stackIn_188_0;
                    while (var35Lifetime2 < var24_intLifetime1) {
                      var36Lifetime1 = var21Lifetime3 + (var35Lifetime2 * var26 << 10) / var29;
                      var37Lifetime1 = var16[var30][var35Lifetime2];
                      var33_intLifetime1 = -(var37Lifetime1 * var27Lifetime1 / var25) + var28;
                      stackIn_173_0Lifetime1 = 0;
                      var38Lifetime1 = stackIn_173_0Lifetime1;
                      while (var38Lifetime1 < (var36Lifetime1 - var31Lifetime2)) {
                        var39Lifetime1 = re.a(var32Lifetime2, var36Lifetime1 - var31Lifetime2, var38Lifetime1, var33_intLifetime1, 0);
                        gf.g(-1 + var31Lifetime2 + var38Lifetime1, var34Lifetime2, var38Lifetime1 + var31Lifetime2, var39Lifetime1, var19Lifetime2Lifetime1);
                        var34Lifetime2 = var39Lifetime1;
                        var38Lifetime1++;
                      }
                      var31Lifetime2 = var36Lifetime1;
                      var32Lifetime2 = var33_intLifetime1;
                      var35Lifetime2++;
                    }
                    var30++;
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  var30 = (var24_intLifetime1 + 7) / 8;
                  stackIn_188_0 = 0;
                }
                if (stackIn_188_0 == var30) {
                  var30 = 1;
                }
                var31Lifetime1 = 0;
                while (var31Lifetime1 < var24_intLifetime1) {
                  var32Lifetime1 = var21Lifetime3 + var26 * var31Lifetime1 / (-1 + var24_intLifetime1);
                  stackIn_206_0 = 0;
                  stackIn_206_1 = var31Lifetime1 % var30;
                  if (var40 != 0) {
                    break L36;
                  }
                  if (stackIn_206_0 == stackIn_206_1) {
                    var33 = Integer.toString(var31Lifetime1);
                    var34Lifetime1 = rs.field_Cb.c(var33);
                    var35Lifetime1 = -(var34Lifetime1 >> 1) + var32Lifetime1;
                    if (var31Lifetime1 != 0) {
                      if (var24_intLifetime1 - 1 == var31Lifetime1) {
                        var35Lifetime1 = -var34Lifetime1 + var35Lifetime1;
                      }
                    } else {
                      var35Lifetime1 = var21Lifetime3 + var34Lifetime1 / 2;
                    }
                    rs.field_Cb.d(Integer.toString(var31Lifetime1), var35Lifetime1, 20 + var6 + (var27Lifetime1 + rs.field_Cb.field_J), 16777215, -1);
                    var34Lifetime1Lifetime1 = 0;
                  }
                  gf.a(var32Lifetime1, 20 + var6, var27Lifetime1, 789516);
                  var31Lifetime1++;
                }
                break;
              }
            }
            stackIn_206_0 = var5;
            stackIn_206_1 = var6;
          }
          gf.d(stackIn_206_0, stackIn_206_1, var5 + var4, var7 + var6);
          if (this.field_s.field_P.field_z ||
            this.field_s.field_n != null &&
            (1 << this.field_s.field_n.field_x & this.field_s.field_P.field_w) != 0) {
            rs.field_Cb.c(uo.field_d, var5 + 20 + 160, var6 + (var7 - 74), 16777215, -1);
          }
          var24 = (vd) (this.field_B.d(0));
          do {
            if (var24 == null) {
              gf.b(var8_array);
              break;
            }
            var24.a(127);
            var24 = (vd) (this.field_B.a((byte) -71));
          } while (var40 == 0);
          if (this.field_r != null &&
            this.field_jb > 60) {
            this.a(false, this.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "kq.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var6_int = this.field_s.field_P.field_r;
          var7 = this.field_G[param4][-1 + var6_int];
          var8 = this.field_G[param4][var6_int - 2];
          if (null != this.field_s.field_n &&
            ~this.field_s.field_n.field_x != ~var7) {
            var8 = this.field_s.field_n.field_x;
          }
          var9 = this.field_ob[param0];
          if (param3 < 43) {
            this.b(-128);
          }
          ga.a(var9, param1, param2, (byte) -63, 190);
          rs.field_Cb.d(jo.field_g[param4], 10 + param2, param1 + rs.field_Cb.field_J, 16777215, -1);
          var10 = 210;
          var11 = var10 / (6 + var6_int);
          var12 = 2 * var11 + 12;
          var13 = -(var11 * 8) + var10;
          var14 = var9 - 27;
          if (this.field_p[param0] == 0) {
            this.a(var7, 2, param4, param2 + 10, rs.field_Cb.field_J + param1 + (var14 >> 1));
            this.a(var8, 2, param4, param2 + 10, param1 - (-rs.field_Cb.field_J - var14));
            if (var21 == 0) {
              return;
            }
          }
          var15 = kf.a(this.field_G[param4], 117);
          var16 = 0;
          while (var6_int > var16) {
            var17 = (var6_int * var14 - (var15[var16] * var14 >> 1)) / var6_int;
            var18 = (var6_int - var15[var16]) * var14 / var6_int;
            var19 = (-var12 + this.field_ob[param0] << 8) / var13;
            if (var21 != 0) {
              return;
            }
            if (~var16 == ~var7) {
              var17 = var14 >> 1;
              var19 = 256;
            }
            if (var16 == var8) {
              var17 = var14;
              var19 = 256;
            }
            var20 = rs.field_Cb.field_J + param1 + re.a(var17, 32, this.field_p[param0], var18, 0);
            this.a(param4, var20, var16, var19, (byte) 58, 10 + param2);
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "kq.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_bb != null) {
            this.field_bb.field_p = false;
          }
          this.field_e.field_s = false;
          if (this.field_j != null) {
            this.field_j.field_s = false;
          }
          this.field_J.field_s = false;
          this.field_cb.field_s = false;
          if (param0 != -4956) {
            this.field_B = (pf) null;
          }
          if (null != this.field_nb) {
            this.field_nb.field_s = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.T(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        fs var7 = null;
        int var8 = 0;
        if (param4 != 58) {
          return;
        }
        try {
          var7 = this.field_s.field_P.field_v[param2];
          var8 = var7.field_s;
          rs.field_Cb.c(this.field_l[param0][param2], param5 + 27, param1, var8, -1, param3);
          rs.field_Cb.d(eh.field_I[this.field_q[param0][param2]], 37 + param5, param1, var8, -1, param3);
          rs.field_Cb.d(var7.field_t, param5 + 67, param1, var8, -1, param3);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.FB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(byte param0) {
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Integer var10_ref_Integer = null;
        int var11_int = 0;
        String var11 = null;
        jh var12 = null;
        int var13 = 0;
        int var10Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = this.field_b;
          var3 = 32;
          if (var2_int < 32) {
            var3 = var2_int;
          }
          var4 = re.a(20, 32, var3, 550, 0);
          var5 = (-var4 + 640) / 2;
          var6 = 80;
          var7 = -10 + (320 + var5 + 40);
          var8 = var6 + 51;
          var9 = 0;
          L2: while (true) {
            if (4 > var9) {
              var10 = this.field_ob[var9];
              stackIn_40_0 = ~var7;
              stackIn_40_1 = ~pd.field_k;
              if (var13 != 0) {
                break L2;
              }
              if (stackIn_40_0 < stackIn_40_1 ||
                !(var8 <= bb.field_b) ||
                !(190 + var7 > pd.field_k) ||
                !(bb.field_b <= var8 + var10) ||
                var13 != 0) {
                var8 = var8 + (var10 + 8);
                var9++;
                continue;
              }
            }
            wj.a(this.field_B, (byte) -112);
            if (dn.field_h != null) {
              var10_ref_Integer = (Integer) (dn.field_h.field_h);
              var11_int = var10_ref_Integer.intValue();
              this.a(var11_int, (byte) -116);
              if (this.field_hb.f(244874369)) {
                this.field_hb.e((byte) 124);
              }
              if (this.field_gb.f(244874369)) {
                this.field_gb.e((byte) 81);
              }
              if (this.field_db.f(244874369)) {
                this.field_db.e((byte) 111);
              }
              if (this.field_a.f(244874369)) {
                this.field_a.e((byte) 9);
              }
              var12 = (jh) (dn.field_h);
              var12.e((byte) 102);
            }
            stackIn_40_0 = 4;
            stackIn_40_1 = var9;
            break;
          }
          if (stackIn_40_0 != stackIn_40_1) {
            this.field_w = var9;
            var10Lifetime1 = this.field_w + this.field_D * 4;
            var11 = bk.field_b[var10Lifetime1];
            if (var11 == this.field_r) {
              this.field_jb = this.field_jb + 1;
              if (var13 != 0) {
                this.field_r = bk.field_b[var10Lifetime1];
                this.field_jb = 0;
              }
            } else {
              this.field_r = bk.field_b[var10Lifetime1];
              this.field_jb = 0;
            }
          }
          if (stackIn_40_0 == stackIn_40_1 ||
            var13 != 0) {
            this.field_r = null;
            this.field_jb = 0;
          }
          if (param0 >= -26) {
            this.a(102, 27, (byte) -57, -80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.H(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        fs var6 = this.field_s.field_P.field_v[param0];
        if (param1 != 2) {
          return;
        }
        try {
          var7 = var6.field_s;
          rs.field_Cb.b(this.field_l[param2][param0], param3 + 27, param4, var7, -1);
          rs.field_Cb.d(eh.field_I[this.field_q[param2][param0]], param3 + 37, param4, var7, -1);
          rs.field_Cb.d(var6.field_t, 67 + param3, param4, var7, -1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(String param0, boolean param1, byte param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0.startsWith("production")) {
            this.field_e.field_s = param1;
          }
          if (param2 != 31) {
            return;
          }
          if (param0.startsWith("projects")) {
            this.field_j.field_s = param1;
          }
          if (param0.startsWith("fleets")) {
            this.field_cb.field_s = param1;
          }
          if (param0.startsWith("diplomacy")) {
            this.field_J.field_s = param1;
          }
          if (param0.startsWith("victory") &&
            null != this.field_nb) {
            this.field_nb.field_s = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("kq.L(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        rh var2 = null;
        int var3 = 0;
        lp var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_j.field_z.e(0);
          this.field_j.field_A = false;
          this.field_S.d(false);
          var2 = (rh) (this.field_j.field_x);
          if (param0 != 428) {
            this.a(95, (sd) null, true);
          }
          var3 = 0;
          while (4 > var3) {
            var4 = e.a(this.field_s.field_n.field_u[var3], (byte) -68, var3, var2);
            var4.a((byte) 62, this.field_j.field_z.field_k, this.field_j.field_z.field_y + this.field_j.field_z.field_t);
            this.field_j.field_z.a(var4, 8);
            if (var5 != 0) {
              return;
            }
            if (5 <= this.field_s.field_n.field_u[var3]) {
              this.field_j.field_A = true;
              this.field_S.g(param0 ^ 464);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kq.HB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[2];
          rs.field_Cb.a(var5, param3 + 5, param1 + 5, param0 - 10, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
          var6 = vg.field_t.field_z * 2 + rs.field_Cb.c("= " + vs.field_a);
          gf.a((param0 - var6) / 2 + (param3 - 10), 15 + (param1 + rs.field_Cb.field_J), var6 + 20, 10 + vg.field_t.field_w * 3, 5, 0, 128);
          var7 = 29 + (rs.field_Cb.field_J + param1);
          var8 = vg.field_t.field_z + rs.field_Cb.c("= " + re.a(hg.field_s, 4371, new String[]{Integer.toString(3)}));
          ek.field_z.f((-ek.field_z.field_z + vg.field_t.field_z) / 2 + (param0 - var8) / 2 + param3, var7);
          vg.field_t.f((-var8 + param0) / 2 + param3, var7 - 9);
          gf.b(em.field_c[0] + (param3 + (vg.field_t.field_z + (param0 - var8)) / 2 << 4), ul.field_Db[0] + (var7 + ek.field_z.field_w / 2 << 4), 50, 7, h.field_s);
          gf.b((param3 + (vg.field_t.field_z + param0 - var8) / 2 << 4) + em.field_c[2], (ek.field_z.field_w / 2 + var7 << 4) + ul.field_Db[2], 50, 7, h.field_s);
          gf.b(em.field_c[3] + ((vg.field_t.field_z + (-var8 + param0)) / 2 + param3 << 4), (ek.field_z.field_w / 2 + var7 << 4) + ul.field_Db[3], 50, 7, h.field_s);
          rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[]{Integer.toString(3)}), vg.field_t.field_z + param3 + ((-var8 + param0) / 2 + 5), vg.field_t.field_w / 2 + var7 - 4, 16777215, -1);
          var7 = var7 + vg.field_t.field_w;
          ek.field_z.f(param3 + ((-var8 + param0) / 2 + (-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
          vg.field_t.f((param0 - var8) / 2 + param3, var7 - 9);
          int var9 = 87 % ((-25 - param2) / 51);
          gf.b((param3 + (vg.field_t.field_z + (-var8 + param0)) / 2 << 4) + em.field_c[0], ul.field_Db[0] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
          gf.b(((vg.field_t.field_z - var8 + param0) / 2 + param3 << 4) + em.field_c[1], ul.field_Db[1] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
          rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[]{Integer.toString(2)}), 5 + vg.field_t.field_z + ((param0 - var8) / 2 + param3), -4 + (var7 + vg.field_t.field_w / 2), 16777215, -1);
          var7 = var7 + vg.field_t.field_w;
          ek.field_z.f(-5 + (param3 + (-var6 + param0) / 2 + (-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
          vg.field_t.f((-var6 + param0) / 2 + param3 - 5, var7 - 9);
          gf.b(em.field_c[0] + (-5 + ((vg.field_t.field_z + (param0 - var6)) / 2 + param3) << 4), ul.field_Db[0] + (var7 + ek.field_z.field_w / 2 << 4), 50, 7, h.field_s);
          ek.field_z.f(-5 + (vg.field_t.field_z + (-var6 + param0) / 2 + param3) + (-ek.field_z.field_z + vg.field_t.field_z) / 2, var7);
          vg.field_t.f(param3 + (-var6 + param0) / 2 + (vg.field_t.field_z - 5), var7 - 9);
          rs.field_Cb.d("= " + vs.field_a, 2 * vg.field_t.field_z + (-var6 + param0) / 2 + param3, vg.field_t.field_w / 2 + (-4 + var7), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        String var5 = null;
        int var6 = 0;
        try {
          var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[1];
          rs.field_Cb.a(var5, 5 + param0, param2 + 5, -10 + param3, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
          var6 = qe.field_j.field_z + rs.field_Cb.c("= " + vs.field_a);
          gf.a(-5 + (param3 - var6) / 2 + param0, 20 + rs.field_Cb.field_J + param2, var6 + 15, qe.field_j.field_w + 10, 5, 0, 128);
          qe.field_j.f(param0 + (param3 - var6) / 2, rs.field_Cb.field_J + (param2 + 20));
          rs.field_Cb.d("= " + vs.field_a, (param3 - var6) / 2 + (param0 + qe.field_j.field_z), 25 + rs.field_Cb.field_J + (qe.field_j.field_w / 2 + param2), 16777215, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int[] array$0 = null;
        int stackIn_25_0 = 0;
        int stackIn_44_0 = 0;
        int[] stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        dc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        fs[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        fs var9 = null;
        int[][] var10 = null;
        um var10_ref = null;
        int var11_int = 0;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var8Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = this.field_s.field_P;
          var4 = var3.field_r;
          var5 = 1 + var3.field_O - this.field_s.field_q;
          if (this.field_D != param0) {
            if (this.field_kb == 0) {
              this.field_Z = this.field_C;
              if (var15 != 0) {
                this.field_Z = this.j(410);
              }
            } else {
              this.field_Z = this.j(410);
            }
            this.field_kb = 1;
            this.field_D = param0;
            if (var15 != 0) {
              this.field_Z = this.field_C;
            }
          } else {
            this.field_Z = this.field_C;
          }
          var6 = 8 / ((-73 - param1) / 42);
          if (100 < var5) {
            var5 = 100;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_Z != null &&
            var5 != this.field_Z[0].length) {
            var7_int = this.field_Z[0].length;
            stackIn_25_0 = (var5 <= var7_int) ? var5 : var7_int;
            var8 = stackIn_25_0;
            var9_int = -var5 + var7_int;
            if (var9_int < 0) {
              var9_int = 0;
            }
            var10 = new int[var4][];
            var11_int = 0;
            while (var11_int < var4) {
              array$0 = new int[var5];
              var10[var11_int] = array$0;
              ps.a(this.field_Z[var11_int], var9_int, var10[var11_int], 0, var8);
              stackIn_44_0 = var7_int;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var12_int = stackIn_44_0;
              while (var5 > var12_int) {
                var10[var11_int][var12_int] = this.field_Z[var11_int][-1 + var7_int];
                var12_int++;
              }
              var11_int++;
            }
            if (decompiledFrameCompleted0) {
              this.field_kb = 1;
              this.field_Z = var10;
              this.field_H = var7_int;
              if (var15 != 0) {
                this.field_H = var5;
              }
            }
          } else {
            this.field_H = var5;
          }
          if (decompiledFrameCompleted0) {
            this.field_fb = var5;
            stackIn_44_0 = 1;
          }
          if (stackIn_44_0 < var5) {
            this.field_C = new int[var4][];
            var7 = var3.field_v;
            var8Lifetime1 = 0;
            while (var7.length > var8Lifetime1) {
              var9 = var7[var8Lifetime1];
              var10_ref = var9.field_q;
              if (var15 != 0) {
                return;
              }
              if (this.field_D == 1) {
                stackIn_58_0 = var10_ref.field_f;
              } else {
                if (this.field_D == 2) {
                  stackIn_58_0 = var10_ref.field_h;
                } else {
                  stackIn_58_0 = var10_ref.field_g;
                }
              }
              var11 = stackIn_58_0;
              var12 = new int[var5];
              var13 = 0;
              while (var13 < var5) {
                var14 = (1 + var13 + var3.field_O + (100 - var5)) % 100;
                var12[var13] = var11[var14] << 10;
                var13++;
              }
              this.field_C[var9.field_x] = var12;
              var8Lifetime1++;
            }
            if (var15 == 0) {
              return;
            }
          }
          this.field_C = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "kq.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = (rh) (this.field_j.field_x);
          if (var3.field_b[param0] != null) {
            var3.field_b[param0].a((byte) -126, ii.field_s);
          }
          var4 = var3.field_c[param0];
          if (param1 != 2) {
            this.a((byte) 43);
          }
          var4.field_o = jd.field_h;
          var5 = (vd) (var4.field_l.d(param1 - 2));
          while (null != var5) {
            if (var6 != 0) {
              return;
            }
            if (var5.field_o != null) {
              var5.field_o = jd.field_h;
            }
            var5 = (vd) (var4.field_l.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kq.AB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_A = null;
          field_i = null;
          field_R = null;
          field_h = null;
          if (param0 != 320) {
            field_L = (String) null;
          }
          field_L = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kq.IA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        ln[] var3_ref_ln__ = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        fs[] var4_array = null;
        ln var5_ref_ln = null;
        fs var5_ref_fs = null;
        int var5 = 0;
        sd var6 = null;
        int var6_int = 0;
        fs var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        lp var9 = null;
        int var10 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_cb.field_z.e(param0 ^ 0);
          var2 = new int[this.field_s.field_P.field_r];
          var3_ref_ln__ = this.field_s.field_P.field_g.field_e;
          var4_int = 0;
          while (var4_int < var3_ref_ln__.length) {
            var5_ref_ln = var3_ref_ln__[var4_int];
            if (var5_ref_ln.field_y != null) {
              var2[var5_ref_ln.field_y.field_x] = var2[var5_ref_ln.field_y.field_x] + var5_ref_ln.field_x;
            }
            var4_int++;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          var3_ref_fs__ = this.field_s.field_P.field_v;
          var4_intLifetime1 = 0;
          while (true) {
            stackIn_9_0 = ~var3_ref_fs__.length;
            stackIn_9_1 = ~var4_intLifetime1;
            if (stackIn_9_0 < stackIn_9_1) {
              var5_ref_fs = var3_ref_fs__[var4_intLifetime1];
              stackOut_10_0 = this.field_s.field_P.field_o.field_i;
              stackIn_29_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_0 = stackOut_10_0;
              if (var10 == 0) {
                if (!stackIn_11_0) {
                  var6 = (sd) (var5_ref_fs.field_i.d(0));
                  while (null != var6) {
                    stackIn_9_0 = ~var6.field_r;
                    stackIn_9_1 = -1;
                    if (stackIn_9_0 < stackIn_9_1) {
                      var2[var5_ref_fs.field_x] = var2[var5_ref_fs.field_x] + var6.field_r;
                    }
                    var6 = (sd) (var5_ref_fs.field_i.a((byte) -71));
                  }
                } else {
                  if (0 < var5_ref_fs.field_m.field_r) {
                    var2[var5_ref_fs.field_x] = var2[var5_ref_fs.field_x] + var5_ref_fs.field_m.field_r;
                  }
                }
                var4_intLifetime1++;
                continue;
              }
            } else {
              stackIn_29_0 = 0;
            }
            var3 = stackIn_29_0;
            var4 = var2;
            var5 = 0;
            while (var4.length > var5) {
              var6_int = var4[var5];
              if (var6_int > var3) {
                var3 = var6_int;
              }
              var5++;
              if (var10 == 0) {
                continue;
              }
              break;
            }
            var4_array = this.field_s.field_P.field_v;
            var5Lifetime1 = param0;
            while (var4_array.length > var5Lifetime1) {
              var6_ref = var4_array[var5Lifetime1];
              var7 = var2[var6_ref.field_x];
              var8 = var6_ref.field_v.field_o / 2 + (-var6_ref.field_v.field_o + 182) * var7 / var3;
              var9 = sl.a(var7, -30577, var6_ref, var8);
              var9.a((byte) 39, this.field_cb.field_z.field_k, this.field_cb.field_z.field_y + this.field_cb.field_z.field_t);
              this.field_cb.field_z.a(var9, 8);
              var5Lifetime1++;
              if (var10 != 0) {
                return;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.EB(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = (rh) (this.field_j.field_x);
          if (null != var3.field_b[param0]) {
            var3.field_b[param0].a((byte) -88, mf.field_v);
          }
          if (param1 <= 126) {
            this.a(-90);
          }
          var4 = var3.field_c[param0];
          var4.field_o = mm.field_q;
          var5 = (vd) (var4.field_l.d(0));
          while (var5 != null) {
            if (var6 != 0) {
              return;
            }
            if (var5.field_o != null) {
              var5.field_o = mm.field_q;
            }
            var5 = (vd) (var4.field_l.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kq.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(fs[] param0, int param1) {
        int[] array$0 = null;
        int[] array$1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        boolean[] var4 = null;
        int var5 = 0;
        fs[] var6 = null;
        int[][] var6_array = null;
        int var7_int = 0;
        int[][] var7 = null;
        fs var8_ref_fs = null;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = new String[param1 + param0.length];
          var4 = new boolean[param0.length + 1];
          var5 = 0;
          do {
            if (var5 >= this.field_ab.length - 1) {
              var3[-1 + var3.length] = this.field_ab[-1 + this.field_ab.length];
              var4[var4.length - 1] = this.field_z[this.field_z.length - 1];
              this.field_ab = var3;
              this.field_z = var4;
              this.e(param1 - 1);
              var5 = this.field_cb.field_i;
              this.field_cb.a(true, this.field_cb.field_z.field_y + 28, this.field_cb.field_m);
              this.field_cb.field_z.a(true, this.field_cb.field_z.field_y + 10, this.field_cb.field_z.field_m);
              this.field_cb.d(-this.field_cb.field_i + var5, 0, 0);
              this.f(param1 - 15908);
              this.i(6);
              break;
            }
            var3[var5] = this.field_ab[var5];
            var4[var5] = this.field_z[var5];
            var5++;
          } while (var9 == 0);
          var6 = this.field_s.field_P.field_v;
          var7_int = 0;
          do {
            if (var6.length <= var7_int) {
              this.field_J.a(true, this.field_J.field_z.field_y + 28, this.field_J.field_m);
              this.field_J.field_z.a(true, 10 + this.field_J.field_z.field_y, this.field_J.field_z.field_m);
              break;
            }
            var8_ref_fs = var6[var7_int];
            this.a((byte) -113, var8_ref_fs);
            var7_int++;
          } while (var9 == 0);
          var6_array = new int[param0.length][];
          var7 = new int[param0.length][];
          if (null != this.field_C) {
            var8 = 0;
            while (true) {
              if (var8 < this.field_C.length) {
                var6_array[var8] = this.field_C[var8];
                var8++;
                if (var9 == 0) {
                  continue;
                }
              } else {
                array$0 = new int[var6_array[0].length];
                var6_array[-1 + param0.length] = array$0;
              }
              break;
            }
            this.field_C = var6_array;
          }
          if (null != this.field_Z) {
            var8Lifetime1 = 0;
            while (true) {
              if (var8Lifetime1 < this.field_Z.length) {
                var7[var8Lifetime1] = this.field_Z[var8Lifetime1];
                var8Lifetime1++;
                if (var9 == 0) {
                  continue;
                }
              } else {
                array$1 = new int[var7[0].length];
                var7[-1 + param0.length] = array$1;
              }
              break;
            }
            this.field_Z = var7;
          }
          if (kb.field_x == 7) {
            this.field_s.field_P.field_x = (me) ((Object) new qg(param0));
            this.field_s.field_P.field_x.a((byte) -24, this.field_s.field_P, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_43_0 = var3_ref;
          stackIn_43_1 = new StringBuilder().append("kq.GB(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void g(int param0) {
        if (!sq.a(false)) {
          return;
        }
        try {
          gm.a(false, 63, param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.DB(" + param0 + ')');
        }
    }

    final void l(int param0) {
        boolean stackIn_38_0 = false;
        int stackIn_45_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_115_0 = 0;
        int stackIn_122_0 = 0;
        String stackIn_140_0 = null;
        String stackIn_163_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0;
        boolean stackOut_107_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        vd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var2_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_s.field_W) {
            mq.a((byte) -44);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_s.field_f &&
            !this.field_s.field_P.field_z) {
            gf.a(h.field_F.field_z * 3 + 521, 4, rk.field_j.field_z, -2 + rs.field_Cb.field_J, 2, 0, 128);
            var2_int = (this.field_s.field_S + 49) / 50;
            if (this.field_s.field_S < 0) {
              rs.field_Cb.c(this.a(false, Math.abs(var2_int)), 521 + h.field_F.field_z * 3 + rk.field_j.field_z / 2, rs.field_Cb.field_J * 3 / 4 + 3, 16711680, -1);
            }
            if (mb.field_o[this.field_s.field_P.field_J] <= (3 * this.field_s.field_S)) {
              rs.field_Cb.c(this.a(false, Math.abs(var2_int)), rk.field_j.field_z / 2 + 3 * h.field_F.field_z + 521, rs.field_Cb.field_J * 3 / 4 + 3, 16777215, -1);
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if (decompiledFrameRemainder0) {
              var3_int = this.field_s.field_S % 50;
              if (30 > var3_int) {
                if ((!(var3_int >= 20)) &&
                  (!(var3_int < 10))) {
                  rs.field_Cb.c(this.a(false, Math.abs(var2_int)), h.field_F.field_z * 3 + 521 + rk.field_j.field_z / 2, 3 * rs.field_Cb.field_J / 4 + 3, 3974311, -1);
                }
              } else {
                rs.field_Cb.c(this.a(false, Math.abs(var2_int)), h.field_F.field_z * 3 + 521 + rk.field_j.field_z / 2, 3 * rs.field_Cb.field_J / 4 + 3, 3974311, -1);
              }
            }
          }
          var2_intLifetime1 = 0 / ((param0 - 78) / 41);
          if (this.field_s.field_W &&
            ph.field_g) {
            kb.field_w.f(this.field_bb.field_k - 10, this.field_bb.field_t - 10);
          }
          var3 = (vd) (this.field_y.f(3725));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var3 == null))) {
            stackOut_37_0 = var3 instanceof qh;
            stackIn_45_0 = stackOut_37_0 ? 1 : 0;
            stackIn_38_0 = stackOut_37_0;
            if (var12 == 0) {
              if (!stackIn_38_0) {
                var3.a(121);
              }
              var3 = (vd) (this.field_y.b(-125));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_45_0 = -14145;
          }
          vn.d(stackIn_45_0);
          if (null != this.field_O) {
            this.field_O.b(false, 96);
          }
          if (this.field_U != -1) {
            var4 = this.field_x;
            var5 = 5 + (this.field_k.field_i + this.field_k.field_t);
            gf.a(this.field_k.field_k + 1, var5, this.field_T.field_z + 10, rs.field_Cb.field_J, 5, 0);
            gf.f(this.field_k.field_k, -1 + var5, 12 + this.field_T.field_z, rs.field_Cb.field_J + 2, 6, 2052949);
            sa.a(var4 * 5, this.field_k.field_k + 6, (byte) 116, 32, this.field_T, var5 - 4);
            if (this.field_ib) {
              var6 = this.field_x - 125;
              if (var6 > 0) {
                var7 = (var6 << 12) / 250;
                var7 = var7 & 511;
                if (256 < var7) {
                  var7 = 512 - var7;
                }
                this.field_eb.c(6 + this.field_k.field_k, var5 - 4, var7);
              }
            }
          }
          var4Lifetime1 = cl.field_n % 64;
          if (24 < var4Lifetime1 &&
            var4Lifetime1 <= 40) {
            var4Lifetime1 = 24;
          }
          if (var4Lifetime1 > 40) {
            var4Lifetime1 = 64 - var4Lifetime1;
          }
          var4Lifetime1 = 10 * var4Lifetime1;
          var5Lifetime1 = ui.a(16777215, 16711680, -125, var4Lifetime1);
          if (this.field_e.field_A &&
            this.field_mb.field_s) {
            jq.field_b.b(this.field_mb.field_k, this.field_mb.field_t, var5Lifetime1);
          }
          if (null != this.field_j &&
            this.field_j.field_A &&
            this.field_S.field_s) {
            ci.field_p.b(this.field_S.field_k, this.field_S.field_t, var5Lifetime1);
          }
          if (this.field_cb.field_A &&
            this.field_W.field_s) {
            us.field_a.b(this.field_W.field_k, this.field_W.field_t, var5Lifetime1);
          }
          if (this.field_J.field_A &&
            this.field_n.field_s) {
            fl.field_b.b(this.field_n.field_k, this.field_n.field_t, var5Lifetime1);
          }
          if (null != this.field_nb &&
            this.field_nb.field_A &&
            this.field_g.field_s) {
            je.field_f.b(this.field_g.field_k, this.field_g.field_t, var5Lifetime1);
          }
          var3 = (vd) (this.field_y.f(3725));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            stackOut_107_0 = var3 instanceof qh;
            stackIn_115_0 = stackOut_107_0 ? 1 : 0;
            stackIn_108_0 = stackOut_107_0;
            if (var12 == 0) {
              if (stackIn_108_0) {
                var3.a(123);
              }
              var3 = (vd) (this.field_y.b(-127));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_115_0 = 0;
          }
          var6Lifetime1 = stackIn_115_0;
          var7Lifetime1 = 0;
          var8 = null;
          var9 = 0;
          var10 = 16777215;
          if (this.field_s.field_P.field_z) {
            stackIn_122_0 = (this.field_s.field_P.field_k >= 0) ? 0 : 1;
            var6Lifetime2 = stackIn_122_0;
            if (this.field_s.field_n != null && ((1 << this.field_s.field_n.field_x & this.field_s.field_P.field_w) != 0 ||
              this.field_s.field_P.field_x.a((byte) 69, this.field_s.field_n))) {
              var7Lifetime1 = 1;
            }
            if (var7Lifetime1 != 0) {
              stackIn_140_0 = (String) (field_L);
            } else {
              if (var6Lifetime2 != 0) {
                stackIn_140_0 = m.field_v;
              } else {
                stackIn_140_0 = fj.field_o;
              }
            }
            var8 = stackIn_140_0;
            if (this.field_s.field_n == null &&
              var6Lifetime2 == 0) {
              var8 = re.a(vp.field_t, 4371, new String[]{this.field_s.field_P.field_v[this.field_s.field_P.field_k].field_t});
            }
          }
          if (this.field_s.field_n != null &&
            (this.field_s.field_P.field_w & 1 << this.field_s.field_n.field_x) != 0 &&
            this.field_I) {
            var9 = 1;
            var8 = field_L;
          }
          if (null != var8) {
            mp.field_b.a((String) (var8), 320, 240, var10, -1, qd.field_f);
            var11 = rs.field_Cb.field_J + 245;
            if (var8 == m.field_v) {
              if (this.field_s.field_P.field_w != 0) {
                stackIn_163_0 = oh.field_g;
              } else {
                stackIn_163_0 = ad.field_b;
              }
              var8 = stackIn_163_0;
              rs.field_Cb.a((String) (var8), 320, var11, var10, -1, qd.field_f);
              var11 = var11 + (3 + rs.field_Cb.field_J);
            }
            rs.field_Cb.a(er.field_p, 320, var11, var10, -1, qd.field_f);
            if (var9 != 0) {
              var11 = var11 + (rs.field_Cb.field_J + 3);
              rs.field_Cb.a(vn.field_i, 320, var11, var10, -1, qd.field_f);
            }
          }
          if (this.field_u != 0) {
            this.k(5512);
          }
          if (this.field_b != 0) {
            this.a((byte) 11, this.field_b);
          }
          if (qa.field_w != null &&
            qa.field_w.field_o != null) {
            this.a(false, qa.field_w.field_o);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.M(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (qa.field_t > 0 &&
            on.field_b) {
            gf.h(0, 0, gf.field_b, tg.field_c.field_N);
            so.field_v.b(param1, -66);
          }
          if (param0 != -57) {
            return;
          }
          if (0 >= bc.field_b &&
            ee.field_k <= 0) {
            return;
          }
          if (ti.field_e) {
            gf.h(0, 0, gf.field_b, tg.field_c.field_N);
            ed.field_d.b(param1, -83);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        try {
          var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[0];
          int var6 = 107 / ((10 - param2) / 56);
          rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_28_0 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.startsWith("production")) {
            stackIn_2_0 = this.field_e.field_s;
            return stackIn_2_0;
          }
          if (param0.startsWith("projects")) {
            stackIn_7_0 = this.field_j.field_s;
            return stackIn_7_0;
          }
          if (param0.startsWith("fleets")) {
            stackIn_12_0 = this.field_cb.field_s;
            return stackIn_12_0;
          }
          if (param1 > -112) {
            this.field_K = (os) null;
          }
          if (param0.startsWith("diplomacy")) {
            stackIn_20_0 = this.field_J.field_s;
            return stackIn_20_0;
          }
          if (param0.startsWith("victory") &&
            this.field_nb != null) {
            stackIn_28_0 = this.field_nb.field_s;
            return stackIn_28_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("kq.R(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(byte param0) {
        jh dupTemp$0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_16_1 = null;
        RuntimeException decompiledCaughtException = null;
        em var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sd var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = (em) (this.field_e.field_x);
          if (param0 != 43) {
            return;
          }
          var3 = 0;
          while (var3 < var2.field_i.length) {
            var4 = (sd) (var2.field_i[var3].field_h);
            var2.field_i[var3].a((byte) -122, Integer.toString(var4.field_x));
            if (var6 != 0) {
              return;
            }
            if (var4.field_x == 0) {
              var5 = pe.field_F;
            } else {
              stackIn_15_0 = new StringBuilder().append(il.field_lb).append(" ");
              if (var4.field_x != 1) {
                stackIn_16_1 = re.a(d.field_c, 4371, new String[]{Integer.toString(var4.field_x)});
              } else {
                stackIn_16_1 = ad.field_a;
              }
              var5 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_16_1).toString();
            }
            dupTemp$0 = var2.field_d[var3];
            dupTemp$0.field_o = var5;
            var2.field_i[var3].field_o = var5;
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.I(" + param0 + ')');
        }
    }

    final void a(byte param0, km param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_s = param1;
          this.i(6);
          if (param0 != -33) {
            this.field_z = (boolean[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kq.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        try {
          var4 = (ad) (this.field_k.field_v);
          if (param0 != 10) {
            this.field_v = false;
          }
          if (400 > rs.field_Cb.c(param2)) {
            var4.field_f.a(param1, param2, 16777215);
            var4.field_f.a((byte) 64, 15, -(3 * rs.field_Cb.field_J / 4) + (this.field_k.field_t + this.field_k.field_i / 2 - 1));
            if (!ShatteredPlansClient.field_F) {
              return;
            }
          }
          var5 = param2.indexOf(" ", param2.length() / 2);
          var6 = param2.substring(0, var5) + "<br>" + param2.substring(var5 + 1);
          var4.field_f.a(param1, var6, 16777215);
          var4.field_f.a((byte) 50, 15, -(rs.field_Cb.field_J * 5 / 4) + (this.field_k.field_t + this.field_k.field_i / 2 - 1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("kq.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u = 0;
          var2_int = 94 % ((param0 + 45) / 39);
          if (this.field_N.f(244874369) &&
            this.field_s.field_Q != null) {
            this.field_s.field_z.a(0, this.field_s.field_Q.field_a, false);
            this.field_X.g(114);
            this.field_X.field_o = ip.field_h;
            if (!ShatteredPlansClient.field_F) {
              return;
            }
          }
          this.field_s.field_z.a(-1, new pf(), false);
          this.field_s.a(2);
          this.field_X.d(false);
          this.field_X.field_o = da.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kq.G(" + param0 + ')');
        }
    }

    final void h(int param0) {
        boolean stackIn_16_1 = false;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_55_0 = 0;
        boolean stackIn_62_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3 = null;
        fs[] var4_ref_fs__ = null;
        int var4 = 0;
        int var5 = 0;
        fs var6_ref_fs = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_39_0Lifetime1;
        int var5Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_s.field_W) {
            ma.j(param0 ^ -25141);
          }
          if (oq.field_j == 84) {
            this.field_s.field_z.e(param0 - 18640);
            this.field_s.a(2);
          }
          boolean decompiledFrameCompleted0 = true;
          if (oq.field_j == 83) {
            if (this.field_s.field_P.field_r == 1) {
              return;
            }
            stackIn_16_1 = !(this.field_Y);
            this.field_Y = stackIn_16_1;
            if (this.field_Y &&
              null != this.field_s.field_n &&
              (this.field_s.field_P.field_w & 1 << this.field_s.field_n.field_x) != 0) {
              this.field_I = false;
            }
            var2_int = this.field_s.field_P.field_r;
            this.field_l = new String[16][var2_int];
            this.field_G = new int[16][];
            var3 = new int[16][var2_int];
            var4_ref_fs__ = this.field_s.field_P.field_v;
            var5 = 0;
            L6: while (true) {
              if (var5 < var4_ref_fs__.length) {
                var6_ref_fs = var4_ref_fs__[var5];
                var7_ref_int__ = var6_ref_fs.field_q.b((byte) -111);
                var8 = var6_ref_fs.field_q.a(121);
                stackIn_37_0 = 0;
                if (var10 != 0) {
                  break L6;
                }
                var9 = stackIn_37_0;
                while (var9 < 16) {
                  var3[var9][var6_ref_fs.field_x] = var7_ref_int__[var9];
                  this.field_l[var9][var6_ref_fs.field_x] = var8[var9];
                  var9++;
                }
                var5++;
                continue L6;
              }
              this.field_q = new int[16][var2_int];
              stackIn_37_0 = 0;
              break;
            }
            var4 = stackIn_37_0;
            while (true) {
              stackIn_39_0 = ~var4;
              if (stackIn_39_0 <= -17) {
                break;
              }
              this.field_G[var4] = nf.a(var3[var4], 3718);
              stackIn_55_0 = 0;
              if (var10 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var5Lifetime1 = stackIn_55_0;
              L14: while (true) {
                stackIn_43_0 = var2_int;
                stackIn_43_1 = var5Lifetime1;
                if (stackIn_43_0 > stackIn_43_1) {
                  var6 = 0;
                  stackIn_39_0Lifetime1 = 0;
                  var7 = stackIn_39_0Lifetime1;
                  while (var7 < var2_int) {
                    stackIn_43_0 = ~var3[var4][var7];
                    stackIn_43_1 = ~var3[var4][var5Lifetime1];
                    if (stackIn_43_0 >= stackIn_43_1) {
                      var6++;
                    }
                    var7++;
                  }
                  this.field_q[var4][var5Lifetime1] = var2_int - var6;
                  var5Lifetime1++;
                  continue L14;
                }
                break;
              }
              var4++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_55_0 = -67;
          }
          if (stackIn_55_0 == ~oq.field_j) {
            stackIn_62_0 = !(ge.field_n);
            ge.field_n = stackIn_62_0;
            this.field_f.e((byte) 20);
          }
          if (param0 != -1) {
            kq.c(56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.KA(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            this.field_x = 36;
          }
          if (this.field_s.field_W) {
            stackIn_5_0 = 480;
            return stackIn_5_0;
          }
          if (!this.field_s.field_f) {
            stackIn_10_0 = this.field_O.field_db;
            return stackIn_10_0;
          }
          stackIn_8_0 = tg.field_c.field_db;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.A(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          de.field_j = 0;
          if (this.field_N.f(244874369)) {
            de.field_j = de.field_j | 32;
          }
          var2_int = -45 / ((param0 - 14) / 38);
          if (this.field_d.f(244874369)) {
            de.field_j = de.field_j | 64;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.F(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        String var8 = null;
        me var9 = null;
        int var10 = 0;
        bi var11 = null;
        om var12 = null;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 32;
          if (32 <= this.field_u) {
            if (this.field_u > 59968) {
              var2_int = 60000 - this.field_u;
              if (var16 != 0) {
                var2_int = this.field_u;
              }
            }
          } else {
            var2_int = this.field_u;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = re.a(21, 32, var2_int, 450, 0);
          sn.a(640, -84, 480, (-var2_int + 32 << 6) / 32 + 192, 0, 0);
          var4 = (640 - var3) / 2;
          var5 = 80;
          var6 = 250;
          ei.a(true, var6, var3, -12394, var5, var4, 3974311);
          var7 = new int[4];
          gf.a(var7);
          gf.d(var4 + rs.field_Cb.field_J / 2, var5, -(rs.field_Cb.field_J / 2) + var4 + var3, var5 + var6);
          var9 = this.field_s.field_P.field_x;
          if (var9 instanceof ui) {
            var8 = la.field_n;
            decompiledFrameRemainder0 = (var16 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (var9 instanceof nh) {
              var8 = ue.field_c;
              if (var16 != 0) {
                if (!(var9 instanceof hp)) {
                  var8 = lm.field_a;
                  var8 = cf.field_I;
                } else {
                  var8 = cf.field_I;
                }
              }
            } else {
              if (!(var9 instanceof hp)) {
                var8 = lm.field_a;
                if (var16 != 0) {
                  var8 = cf.field_I;
                }
              } else {
                var8 = cf.field_I;
              }
            }
          }
          var8 = var8 + "   ";
          if (!this.field_s.field_P.field_o.field_l) {
            var8 = var8 + og.field_a;
            if (var16 != 0) {
              var8 = var8 + tp.field_k;
            }
          } else {
            var8 = var8 + tp.field_k;
          }
          rs.field_Cb.d(var8.toUpperCase(), 10 + var4, rs.field_Cb.field_J + var5, 16777215, -1);
          ij.a(0, -rs.field_Cb.field_J + 450 + 1, true, var4 + rs.field_Cb.field_J / 2, 10 + hb.field_b[0].field_w, rs.field_Cb.field_J + var5 + 5);
          var10 = 0;
          if (null != this.field_s.field_n) {
            var10 = this.field_s.field_n.field_x;
          }
          var11 = new bi(hb.field_b[0].field_w, -rs.field_Cb.field_J + 450 - (10 + hb.field_b[0].field_z / 2));
          ra.a(param0 ^ -5630);
          var11.e();
          gf.i(0, 0, var11.field_z, var11.field_w, this.field_s.field_P.field_v[var10].field_k, 0);
          cg.i(param0 ^ param0);
          var11.f();
          var11.a(5 + (rs.field_Cb.field_J / 2 + var4), rs.field_Cb.field_J + var5 + 10, 64);
          var12 = new om(hb.field_b[0].field_z, hb.field_b[0].field_w);
          var13_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(hb.field_b[var10].field_B.length > var13_int)))) {
            if (var16 == 0) {
              if ((-16777216 & hb.field_b[var10].field_B[var13_int]) != 0) {
                var12.field_B[var13_int] = -16777216;
              } else {
                var12.field_B[var13_int] = 0;
              }
              var13_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var12.f(5 + (var4 + rs.field_Cb.field_J / 2) + (var11.field_z - hb.field_b[0].field_z / 2), 10 + var5 + rs.field_Cb.field_J);
            hb.field_b[var10].a(-(hb.field_b[0].field_z / 2) + (var11.field_z + rs.field_Cb.field_J / 2) + (var4 + 5), rs.field_Cb.field_J + (var5 + 10), 64);
          }
          var13 = re.a(eo.field_hb, 4371, new String[]{Integer.toString(1 + this.field_s.field_P.field_O)});
          var14 = 10 + hb.field_b[0].field_w + (var5 + (20 + mp.field_b.field_J));
          mp.field_b.c(var13, 320, var14, 16777215, -1);
          var15 = -32 + this.field_u;
          if (var15 > 0) {
            boolean decompiledSharedTail0 = !(var15 >= 32);
            if (!decompiledSharedTail0) {
              rs.field_Cb.c(this.field_P, 320, var14 + rs.field_Cb.field_J + 3, 2458760, -1);
              decompiledSharedTail0 = (var16 != 0);
            }
            if (decompiledSharedTail0) {
              rs.field_Cb.a(this.field_P, 320, 3 + var14 + rs.field_Cb.field_J, 2458760, -1, var15 * 8);
            }
          }
          if (var9 instanceof jj) {
            this.a(var4 + (rs.field_Cb.field_J / 2 + 5), 439 - rs.field_Cb.field_J, (byte) 122, var5 + rs.field_Cb.field_J);
          }
          if (var9 instanceof ui) {
            this.c(rs.field_Cb.field_J / 2 + (var4 + 5), -1, rs.field_Cb.field_J + var5, -11 + (450 - rs.field_Cb.field_J));
          }
          if (var9 instanceof nh) {
            this.b(-rs.field_Cb.field_J + 450 - 11, rs.field_Cb.field_J + var5, 27, rs.field_Cb.field_J / 2 + (var4 + 5));
          }
          if (var9 instanceof hp) {
            this.a(5 + rs.field_Cb.field_J / 2 + var4, -rs.field_Cb.field_J + 439, -117, rs.field_Cb.field_J + var5);
          }
          gf.b(var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.DA(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
          if (param0 != 28164) {
            kq.a((byte) -86, true);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.VA(" + param0 + ')');
        }
    }

    private final int[][] j(int param0) {
        int[][] stackIn_5_0 = null;
        int[][] stackIn_17_0 = null;
        int[][] stackIn_22_0 = null;
        int[][] stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == this.field_C) {
            stackIn_5_0 = (int[][]) null;
            return stackIn_5_0;
          }
          if (null == this.field_Z ||
            this.field_Z[0] == null) {
            this.field_kb = 0;
            this.field_Z = this.field_C;
            this.field_H = this.field_fb;
          }
          if (this.field_C[0].length != this.field_Z[0].length) {
            stackIn_17_0 = (int[][]) null;
            return stackIn_17_0;
          }
          if (0 == this.field_kb) {
            stackIn_22_0 = this.field_Z;
            return stackIn_22_0;
          }
          if (param0 != 410) {
            this.field_l = (String[][]) null;
          }
          var2_int = this.field_s.field_P.field_r;
          var3 = this.field_C[0].length;
          var4 = new int[var2_int][];
          var5 = 0;
          L3: while (true) {
            if (var2_int > var5) {
              var6 = this.field_Z[var5];
              stackIn_38_0 = this.field_C;
              if (var10 != 0) {
                break L3;
              }
              var7 = stackIn_38_0[var5];
              var8 = new int[var3];
              var9 = 0;
              while (var3 > var9) {
                var8[var9] = re.a(var6[var9], 32, this.field_kb, var7[var9], nc.a(param0, 410));
                var9++;
              }
              var4[var5] = var8;
              var5++;
              continue L3;
            }
            stackIn_38_0 = var4;
            break;
          }
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.OA(" + param0 + ')');
        }
    }

    final void i(byte param0) {
        RuntimeException runtimeException = null;
        vd var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = (vd) (this.field_y.d(0));
          if (param0 != -47) {
            return;
          }
          while (null != var2) {
            var2.c(false);
            var2 = (vd) (this.field_y.a((byte) -71));
            if (var3 != 0) {
              return;
            }
          }
          this.field_j = null;
          this.field_N = null;
          this.field_e = null;
          this.field_J = null;
          this.field_g = null;
          this.field_cb = null;
          this.field_n = null;
          this.field_d = null;
          this.field_S = null;
          this.field_nb = null;
          this.field_W = null;
          this.field_k = null;
          this.field_bb = null;
          this.field_X = null;
          this.field_mb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kq.O(" + param0 + ')');
        }
    }

    final static java.applet.Applet f(byte param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        kf stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hb.field_a != null) {
            stackIn_2_0 = hb.field_a;
            return stackIn_2_0;
          }
          if (param0 < 123) {
            field_A = (jo) null;
          }
          stackIn_7_0 = ts.field_G;
          return (java.applet.Applet) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kq.C(" + param0 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        fs[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fs var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.f(-15907);
          if (null != this.field_j) {
            this.a(428);
          }
          var2 = this.field_s.field_P.field_v;
          var3 = 0;
          if (param0 < 32) {
            this.a(27, 32, 20, -85, 71);
          }
          do {
            if (var3 >= var2.length) {
              this.field_J.field_A = false;
              this.field_n.d(false);
              this.e(0);
              break;
            }
            var4 = var2[var3];
            this.a((byte) -53, var4);
            var3++;
          } while (var5 == 0);
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_hb.f(244874369)) {
            if (this.field_gb.f(244874369)) {
              this.a(1, (byte) -128);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_db.f(244874369)) {
                this.a(2, (byte) 21);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_a.f(244874369))) {
                this.a(3, (byte) 29);
                if (var5 != 0) {
                  this.a(0, (byte) 1);
                }
              }
            }
          } else {
            this.a(0, (byte) 1);
          }
          if (this.field_s.field_W) {
            pe.k(112);
            this.a((byte) -109);
            if (var5 == 0) {
              return;
            }
          }
          vc.a((byte) -39, mp.field_e.length);
          this.field_P = this.field_s.field_P.a((byte) -50);
          this.field_u = 1;
          qk.a(ub.field_yb, 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.UA(" + param0 + ')');
        }
    }

    final boolean a(boolean param0, byte param1) {
        int stackIn_34_0 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_92_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_152_0 = 0;
        boolean stackIn_160_0 = false;
        int stackIn_161_0 = 0;
        tr stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        pf stackIn_175_2 = null;
        tr stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        pf stackIn_188_2 = null;
        int stackIn_190_0 = 0;
        tr stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        pf stackIn_204_2 = null;
        tr stackIn_210_0 = null;
        int stackIn_210_1 = 0;
        pf stackIn_211_2 = null;
        int stackIn_213_0 = 0;
        int stackIn_224_0 = 0;
        boolean stackIn_232_0 = false;
        boolean stackIn_256_0 = false;
        int stackIn_289_0 = 0;
        int stackIn_296_0 = 0;
        int stackIn_304_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_231_0;
        boolean stackOut_255_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        vd var4_ref_vd = null;
        em var4_ref_em = null;
        rh var4_ref_rh = null;
        ph var4_ref_ph = null;
        qh var4_ref_qh = null;
        int var4 = 0;
        qh var5 = null;
        int var5_int = 0;
        lp[] var5_array = null;
        lp var6_ref_lp = null;
        int var6 = 0;
        sd var7 = null;
        lp var7_ref = null;
        fs var8 = null;
        int var9 = 0;
        int var5_intLifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_b != 0) {
            this.c((byte) -56);
            return true;
          }
          if (this.field_u != 0) {
            if (je.field_d != 0) {
              boolean decompiledSharedTail3 = !(32 > this.field_u);
              if (!decompiledSharedTail3) {
                this.field_u = -this.field_u + 60000;
                qk.a(sf.field_g, 121);
                decompiledSharedTail3 = (var9 != 0);
              }
              if ((decompiledSharedTail3) &&
                (59968 > this.field_u)) {
                this.field_u = 59968;
                qk.a(sf.field_g, 111);
              }
            }
            return true;
          }
          boolean decompiledFrameRemainder2 = true;
          if (null == qa.field_w &&
            bb.field_b < tg.field_c.field_db && (null == this.field_O ||
            !(bb.field_b >= this.field_O.field_db))) {
            stackIn_34_0 = 0;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_34_0 = 1;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted3 = true;
          var3_int = stackIn_34_0;
          wj.a(this.field_y, (byte) -99);
          if (wl.field_f != null) {
            var4_ref_vd = (vd) (this.field_y.d(0));
            while (null != var4_ref_vd) {
              stackIn_73_0 = var4_ref_vd instanceof qh;
              if (var9 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (!stackIn_73_0) {
                var4_ref_vd = (vd) (this.field_y.a((byte) -71));
                continue;
              }
              var5 = (qh) (var4_ref_vd);
              if (var5.field_s &&
                var5.a((byte) 43, wl.field_f)) {
                this.a(62, var5);
                var5.field_A = false;
                if (var5 == this.field_e) {
                  this.field_mb.d(false);
                }
                if (var5 == this.field_j) {
                  this.field_S.d(false);
                }
                if (this.field_J == var5) {
                  this.field_n.d(false);
                }
                if (var5 == this.field_cb) {
                  this.field_W.d(false);
                }
                if (var5 != this.field_nb) {
                  break;
                }
                this.field_g.d(false);
                break;
              }
              var4_ref_vd = (vd) (this.field_y.a((byte) -71));
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameRemainder1 = (null != dn.field_h))) {
            stackIn_73_0 = dn.field_h.field_h instanceof qh;
          }
          if (decompiledFrameRemainder1) {
            if (stackIn_73_0) {
              var4_ref_qh = (qh) (dn.field_h.field_h);
              var4_ref_qh.field_s = false;
              if (var4_ref_qh == this.field_e) {
                this.field_mb.field_o = t.field_b;
                this.field_mb.d(false);
              }
              if (this.field_j == var4_ref_qh) {
                this.field_S.field_o = n.field_j;
                this.field_S.d(false);
              }
              if (this.field_J == var4_ref_qh) {
                this.field_n.field_o = rk.field_o;
                this.field_n.d(false);
              }
              if (this.field_cb == var4_ref_qh) {
                this.field_W.field_o = wm.field_a;
                this.field_W.d(false);
              }
              if (var4_ref_qh == this.field_nb) {
                this.field_g.field_o = hi.field_d;
                this.field_g.d(false);
              }
              var4_ref_qh.field_A = false;
              stackIn_92_0 = var3_int;
              return stackIn_92_0 != 0;
            }
            if (dn.field_h == this.field_mb) {
              if (!this.field_e.field_s) {
                this.a(93, this.field_e);
                this.field_mb.field_o = ep.field_b;
                this.field_e.field_s = true;
                if (var9 != 0) {
                  this.field_e.field_s = false;
                  this.field_mb.field_o = t.field_b;
                }
              } else {
                this.field_e.field_s = false;
                this.field_mb.field_o = t.field_b;
              }
              this.field_e.field_A = false;
              this.field_mb.d(false);
              stackIn_103_0 = var3_int;
              return stackIn_103_0 != 0;
            }
            if (this.field_S == dn.field_h) {
              boolean decompiledSharedTail2 = !(this.field_j.field_s);
              if (!decompiledSharedTail2) {
                this.field_S.field_o = n.field_j;
                this.field_j.field_s = false;
                decompiledSharedTail2 = (var9 != 0);
              }
              if (decompiledSharedTail2) {
                this.a(-120, this.field_j);
                this.field_S.field_o = ue.field_b;
                this.field_j.field_s = true;
              }
              this.field_j.field_A = false;
              this.field_S.d(false);
              stackIn_114_0 = var3_int;
              return stackIn_114_0 != 0;
            }
            if (dn.field_h == this.field_n) {
              boolean decompiledSharedTail1 = !(this.field_J.field_s);
              if (!decompiledSharedTail1) {
                this.field_n.field_o = rk.field_o;
                this.field_J.field_s = false;
                decompiledSharedTail1 = (var9 != 0);
              }
              if (decompiledSharedTail1) {
                this.a(113, this.field_J);
                this.field_n.field_o = te.field_b;
                this.field_J.field_s = true;
              }
              this.field_J.field_A = false;
              this.field_n.d(false);
              stackIn_125_0 = var3_int;
              return stackIn_125_0 != 0;
            }
            if (this.field_W == dn.field_h) {
              if (!this.field_cb.field_s) {
                this.a(-113, this.field_cb);
                this.field_W.field_o = lc.field_d;
                this.field_cb.field_s = true;
                if (var9 != 0) {
                  this.field_cb.field_s = false;
                  this.field_W.field_o = wm.field_a;
                }
              } else {
                this.field_cb.field_s = false;
                this.field_W.field_o = wm.field_a;
              }
              this.field_cb.field_A = false;
              this.field_W.d(false);
              stackIn_136_0 = var3_int;
              return stackIn_136_0 != 0;
            }
            if (dn.field_h == this.field_g) {
              if (!this.field_nb.field_s) {
                this.a(40, this.field_nb);
                this.field_nb.field_s = true;
                this.field_g.field_o = hi.field_d;
                if (var9 != 0) {
                  this.field_nb.field_s = false;
                  this.field_g.field_o = hi.field_d;
                }
              } else {
                this.field_nb.field_s = false;
                this.field_g.field_o = hi.field_d;
              }
              this.field_nb.field_A = false;
              this.field_g.d(false);
              stackIn_147_0 = var3_int;
              return stackIn_147_0 != 0;
            }
            if (dn.field_h == this.field_bb) {
              this.g((byte) 121);
              stackIn_152_0 = var3_int;
              return stackIn_152_0 != 0;
            }
            if (this.field_f == dn.field_h) {
              stackIn_160_0 = !(ge.field_n);
              ge.field_n = stackIn_160_0;
              this.field_f.e((byte) 33);
              stackIn_161_0 = var3_int;
              return stackIn_161_0 != 0;
            }
            if (this.field_N == dn.field_h) {
              boolean decompiledFrameRemainder0 = true;
              this.field_N.e((byte) 37);
              if (this.field_N.f(244874369)) {
                this.field_N.field_o = fi.field_i;
                decompiledFrameRemainder0 = (this.field_s.field_Q != null);
                if (decompiledFrameRemainder0) {
                  stackIn_174_0 = this.field_s.field_z;
                  stackIn_174_1 = 0;
                  if (null != this.field_s.field_Q) {
                    stackIn_175_2 = this.field_s.field_Q.field_a;
                  } else {
                    stackIn_175_2 = null;
                  }
                  ((tr) (Object) stackIn_174_0).a(stackIn_174_1, stackIn_175_2, false);
                  decompiledFrameRemainder0 = !(this.field_X.f(244874369));
                  if (decompiledFrameRemainder0) {
                    this.field_X.e((byte) 8);
                    this.field_X.field_o = ip.field_h;
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                this.field_N.field_o = fl.field_e;
                if (this.field_X.f(244874369)) {
                  this.field_X.e((byte) 88);
                  this.field_X.field_o = da.field_f;
                }
                stackIn_187_0 = this.field_s.field_z;
                stackIn_187_1 = -1;
                if (null != this.field_s.field_Q) {
                  stackIn_188_2 = this.field_s.field_Q.field_a;
                } else {
                  stackIn_188_2 = null;
                }
                ((tr) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_188_2, false);
                this.field_s.a(2);
              }
              this.m(101);
              stackIn_190_0 = var3_int;
              return stackIn_190_0 != 0;
            }
            if (dn.field_h == this.field_X) {
              if (null != this.field_s.field_Q) {
                this.field_X.e((byte) 97);
              }
              boolean decompiledSharedTail0 = !(this.field_X.f(244874369));
              if (!decompiledSharedTail0) {
                this.field_X.field_o = ip.field_h;
                stackIn_203_0 = this.field_s.field_z;
                stackIn_203_1 = 0;
                if (null != this.field_s.field_Q) {
                  stackIn_204_2 = this.field_s.field_Q.field_a;
                } else {
                  stackIn_204_2 = null;
                }
                ((tr) (Object) stackIn_203_0).a(stackIn_203_1, stackIn_204_2, false);
                decompiledSharedTail0 = (var9 != 0);
              }
              if (decompiledSharedTail0) {
                this.field_X.field_o = da.field_f;
                stackIn_210_0 = this.field_s.field_z;
                stackIn_210_1 = -1;
                if (null == this.field_s.field_Q) {
                  stackIn_211_2 = null;
                } else {
                  stackIn_211_2 = this.field_s.field_Q.field_a;
                }
                ((tr) (Object) stackIn_210_0).a(stackIn_210_1, stackIn_211_2, false);
                this.field_s.a(2);
              }
              stackIn_213_0 = var3_int;
              return stackIn_213_0 != 0;
            }
            if (dn.field_h == this.field_d) {
              this.field_d.e((byte) 73);
              if (this.field_d.f(244874369)) {
                this.field_d.field_o = de.field_k;
                if (var9 != 0) {
                  this.field_d.field_o = ec.field_t;
                }
              } else {
                this.field_d.field_o = ec.field_t;
              }
              this.m(108);
              stackIn_224_0 = var3_int;
              return stackIn_224_0 != 0;
            }
            if (null != this.field_s.field_n &&
              this.field_e.field_s) {
              var4_ref_em = (em) (this.field_e.field_x);
              var5_int = 0;
              while (!(var5_int >= var4_ref_em.field_f.length)) {
                var6_ref_lp = var4_ref_em.field_f[var5_int];
                var7 = (sd) (var6_ref_lp.field_h);
                stackOut_231_0 = var6_ref_lp.a((byte) -10, dn.field_h);
                stackIn_289_0 = stackOut_231_0 ? 1 : 0;
                stackIn_232_0 = stackOut_231_0;
                if (var9 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                boolean decompiledFrameRemainder3 = true;
                if (stackIn_232_0) {
                  if (2 != this.field_s.field_m ||
                    this.field_s.field_c != var7) {
                    if (!(var7.field_x <= 0)) {
                      this.a(-2, var7, false);
                    }
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    this.a(-125, 0);
                  }
                }
                var5_int++;
              }
            }
            if (decompiledFrameCompleted2) {
              if (this.field_s.field_n != null &&
                this.field_j.field_s) {
                var4_ref_rh = (rh) (this.field_j.field_x);
                var5_intLifetime1 = 0;
                while (!(var4_ref_rh.field_c.length <= var5_intLifetime1)) {
                  stackOut_255_0 = var4_ref_rh.field_c[var5_intLifetime1].a((byte) 24, dn.field_h);
                  stackIn_289_0 = stackOut_255_0 ? 1 : 0;
                  stackIn_256_0 = stackOut_255_0;
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_256_0 &&
                    this.field_s.field_n.field_u[var5_intLifetime1] == 5) {
                    this.d(var5_intLifetime1, 4705);
                  }
                  var5_intLifetime1++;
                }
              }
              if ((decompiledFrameCompleted1) && (this.field_s.field_n != null &&
                this.field_J.field_s)) {
                var4_ref_ph = (ph) (this.field_J.field_x);
                var5_array = var4_ref_ph.field_h;
                var6 = 0;
                while (var6 < var5_array.length) {
                  var7_ref = var5_array[var6];
                  var8 = (fs) (var7_ref.field_h);
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if ((var8 != this.field_s.field_n ||
                    var9 != 0) &&
                    (var7_ref.a((byte) -118, dn.field_h) &&
                    !this.field_s.field_n.field_h[var8.field_x])) {
                    this.field_s.a(var8, (byte) 54);
                  }
                  var6++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_289_0 = param1;
          }
          if ((decompiledFrameCompleted0) &&
            (stackIn_289_0 < 43)) {
            this.field_y = (pf) null;
          }
          stackIn_296_0 = (var3_int != 0) ? 0 : 1;
          if (stackIn_296_0 == 1 &&
            this.field_s.field_W) {
            var4 = ks.a(param0, true) ? 1 : 0;
            if (var4 != 0) {
              return true;
            }
          }
          stackIn_304_0 = var3_int;
          return stackIn_304_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "kq.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, String param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 10 + pd.field_k;
          var4 = bb.field_b + 20;
          var5 = rs.field_Cb.c(param1);
          if (13 + var4 > 480) {
            var3_int = pd.field_k;
            var4 = -15 + bb.field_b;
          }
          if (10 + (var5 + var3_int) > 639) {
            var3_int = -1 - var5 + 630;
          }
          gf.a(var3_int, var4, var5 + 10, 13, 5, 0, 192);
          gf.f(-1 + var3_int, var4 - 1, var5 + 12, 15, 6, 3974311);
          rs.field_Cb.d(param1, 6 + var3_int, 3 + (var4 + rs.field_Cb.field_J / 2), 16777215, -1);
          if (param0) {
            this.field_ob = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("kq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        ph var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        lp var3 = null;
        lp var4_ref_lp = null;
        int var4 = 0;
        lp var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_s.field_W &&
            6 > kb.field_x) {
            return;
          }
          this.field_J.field_z.e(param0 ^ param0);
          var2 = new ph(this.field_s.field_P.field_r);
          this.field_J.field_x = (jk) ((Object) var2);
          if (this.field_s.field_n == null) {
            var3_int = 0;
            while (var3_int < this.field_s.field_P.field_r) {
              var4_ref_lp = nl.a(var2, this.field_s.field_P.field_v, 2, this.field_s.field_P.field_v[var3_int]);
              var4_ref_lp.a((byte) 65, this.field_J.field_z.field_k, this.field_J.field_z.field_t + this.field_J.field_z.field_y);
              this.field_J.field_z.a(var4_ref_lp, param0 + 2);
              var3_int++;
              if (var6 != 0) {
                return;
              }
            }
            if (var6 == 0) {
              return;
            }
          }
          var3 = nl.a(var2, this.field_s.field_P.field_v, 2, this.field_s.field_n);
          var3.a((byte) 125, this.field_J.field_z.field_k, this.field_J.field_z.field_t + this.field_J.field_z.field_y);
          this.field_J.field_z.a(var3, 8);
          var4 = 0;
          while (!(this.field_s.field_P.field_r <= var4)) {
            if (var6 != 0) {
              return;
            }
            if (this.field_s.field_P.field_v[var4] != this.field_s.field_n ||
              var6 != 0) {
              var5 = lr.a(var2, this.field_s.field_n, (byte) 21, this.field_s.field_P.field_v[var4], this.field_s.field_P.field_v);
              var5.a((byte) 83, this.field_J.field_z.field_k, this.field_J.field_z.field_t + this.field_J.field_z.field_y);
              this.field_J.field_z.a(var5, 8);
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.W(" + param0 + ')');
        }
    }

    final void h(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ad var2 = null;
        fs[] var2_array = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        dc var3 = null;
        fs var4_ref_fs = null;
        int var4 = 0;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var5Lifetime1Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_s.field_L ||
            this.field_bb == null) {
            var2 = (ad) (this.field_k.field_v);
            var2.field_e.a(-2948, (bi) null);
            boolean decompiledSharedTail1 = (this.field_s.field_N != 1);
            if (!decompiledSharedTail1) {
              this.a(10, 0, il.field_Y);
              decompiledSharedTail1 = (var7 != 0);
            }
            if (decompiledSharedTail1) {
              this.a(10, 0, re.a(gs.field_m, 4371, new String[]{Integer.toString(this.field_s.field_N)}));
            }
            if (var7 != 0) {
              this.field_bb.d(false);
            }
          } else {
            this.field_bb.d(false);
          }
          var2_array = this.field_s.field_P.field_v;
          var3_int = 0;
          do {
            if (var3_int >= var2_array.length) {
              if (!this.field_s.field_f &&
                !this.field_s.field_W) {
                this.b(15);
              }
              rh.b((byte) -127);
              this.field_V.a((byte) 68, this.field_V.field_k, this.d((byte) 14) - this.field_V.field_i / 2);
              this.field_K.a((byte) 45, this.field_K.field_k, this.field_V.field_t);
              break;
            }
            var4_ref_fs = var2_array[var3_int];
            this.a((byte) -13, var4_ref_fs);
            var3_int++;
          } while (var7 == 0);
          var2_int = -63 / ((67 - param0) / 41);
          var3 = this.field_s.field_P;
          var4 = 0;
          var5 = 0;
          L10: while (true) {
            if (var3.field_r > var5) {
              stackIn_125_0 = ~var5;
              stackIn_125_1 = ~this.field_s.field_h;
              if (var7 == 0) {
                L13: {
                  if (stackIn_125_0 != stackIn_125_1) {
                    var6_ref = var3.field_I[var5];
                    if ((1 << var5 & this.field_s.field_i) == 0) {
                      if (0 == (var3.field_e & 1 << var5)) {
                        if ((var3.field_f & 1 << var5) != 0) {
                          var6_ref = re.a(ek.field_y, 4371, new String[]{(String) (var6_ref)});
                          break L13;
                        }
                        if ((this.field_s.field_P.field_w & 1 << var5) != 0) {
                          var6_ref = null;
                          break L13;
                        }
                        if (!var3.field_z &&
                          (var3.field_y & 1 << var5) != 0) {
                          var6_ref = re.a(ob.field_i, 4371, new String[]{(String) (var6_ref)});
                          break L13;
                        } else {
                          var6_ref = null;
                          break L13;
                        }
                      }
                      if (!this.field_s.field_M) {
                        var6_ref = re.a(bb.field_d, 4371, new String[]{(String) (var6_ref)});
                      } else {
                        var6_ref = re.a(vm.field_Fb, 4371, new String[]{(String) (var6_ref)});
                      }
                    } else {
                      if ((var3.field_f & 1 << var5) != 0) {
                        var6_ref = re.a(lg.field_f, 4371, new String[]{(String) (var6_ref)});
                      } else {
                        var6_ref = re.a(bj.field_M, 4371, new String[]{(String) (var6_ref)});
                      }
                    }
                    break L13;
                  }
                  if ((1 << var5 & var3.field_e) != 0) {
                    if (!this.field_s.field_M) {
                      var6_ref = f.field_B;
                    } else {
                      var6_ref = ae.field_d;
                    }
                    break L13;
                  }
                  if (0 != (var3.field_f & 1 << var5)) {
                    var6_ref = uh.field_e;
                  } else {
                    if ((1 << var5 & this.field_s.field_P.field_w) != 0) {
                      var6_ref = lp.field_A;
                    } else {
                      if (var3.field_z ||
                        (1 << var5 & var3.field_y) == 0) {
                        var6_ref = null;
                      } else {
                        var6_ref = pl.field_b;
                      }
                    }
                  }
                }
                if (null != var6_ref &&
                  !((String) (var6_ref)).equals(this.field_ab[var5])) {
                  this.field_z[var5] = true;
                }
                this.field_ab[var5] = (String) (var6_ref);
                stackIn_95_0 = var4;
                if (null == var6_ref) {
                  stackIn_96_1 = 0;
                } else {
                  stackIn_96_1 = 1;
                }
                var4 = stackIn_95_0 | stackIn_96_1;
                var5++;
                continue;
              }
            } else {
              boolean decompiledSharedTail0 = (null != this.field_s.field_n &&
                this.field_s.field_n.field_A != 0);
              if (!decompiledSharedTail0) {
                this.field_ab[var3.field_r] = null;
                decompiledSharedTail0 = (var7 != 0);
              }
              if (decompiledSharedTail0) {
                var4 = 1;
                if (this.field_ab[var3.field_r] != ul.field_Ab) {
                  this.field_ab[var3.field_r] = ul.field_Ab;
                  this.field_z[var3.field_r] = true;
                  this.field_J.field_A = true;
                  this.field_n.g(86);
                }
              }
              if (var4 != 0) {
                var5 = 250;
                if (this.field_ib) {
                  var5 = 5 * var5 >> 2;
                }
                fieldTemp$0 = this.field_x + 1;
                this.field_x = this.field_x + 1;
                if (var5 <= fieldTemp$0) {
                  while (true) {
                    fieldTemp$1 = this.field_U + 1;
                    this.field_U = this.field_U + 1;
                    if (~fieldTemp$1 == ~this.field_ab.length) {
                      this.field_U = 0;
                    }
                    if (null == this.field_ab[this.field_U]) {
                      continue;
                    }
                    break;
                  }
                  this.field_x = 0;
                  this.field_o = this.field_ab[this.field_U];
                  this.field_ib = this.field_z[this.field_U];
                  this.field_z[this.field_U] = false;
                  var6 = rs.field_Cb.c(this.field_o);
                  this.field_T = new bi(var6, rs.field_Cb.field_q + rs.field_Cb.field_J);
                  bs.a(this.field_T, 92);
                  gf.b();
                  rs.field_Cb.b(this.field_o, this.field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                  this.field_eb = this.field_T.g();
                  this.field_eb.e();
                  gf.b();
                  rs.field_Cb.b(this.field_o, this.field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                  gf.b(1, 1, 0, 0, this.field_eb.field_z, this.field_eb.field_w);
                  cg.i(0);
                }
              }
              if (var4 == 0 ||
                var7 != 0) {
                this.field_x = 250;
                this.field_U = -1;
              }
              if (this.field_u == 0) {
                break L10;
              }
              fieldTemp$2 = this.field_u + 1;
              this.field_u = this.field_u + 1;
              stackIn_125_0 = fieldTemp$2;
              stackIn_125_1 = 60000;
            }
            if (stackIn_125_0 == stackIn_125_1) {
              this.a((byte) 33);
            }
            if (this.field_u == 59968) {
              qk.a(sf.field_g, 122);
            }
            break;
          }
          if (this.field_Y) {
            if (32 > this.field_b) {
              this.field_b = this.field_b + 1;
              if (var7 != 0 &&
                this.field_b > 0) {
                this.field_b = this.field_b - 1;
              }
            }
          } else {
            if (this.field_b > 0) {
              this.field_b = this.field_b - 1;
            }
          }
          if (this.field_b != 0) {
            this.p(3);
          }
          if (this.field_s.field_W) {
            gi.a(false);
            ra.a(-127);
            fj.field_r.e();
            gf.d(0, 0, fj.field_r.field_z, fj.field_r.field_w, 0);
            if (se.field_k) {
              aq.field_i.f(10, 10);
              var5Lifetime1 = ui.a(0, 16777215, -96, qd.field_f);
              fj.field_r.f(var5Lifetime1);
              fj.field_r.f(var5Lifetime1);
              fj.field_r.e();
              gf.b(5, 5, 0, 0, fj.field_r.field_z, fj.field_r.field_w);
            }
            kb.field_w.e();
            gf.d(0, 0, kb.field_w.field_z, kb.field_w.field_w, 0);
            if (ph.field_g) {
              rk.field_j.f(10, 10);
              var5Lifetime1Lifetime1 = ui.a(0, 16777215, -103, qd.field_f);
              kb.field_w.f(var5Lifetime1Lifetime1);
              kb.field_w.f(var5Lifetime1Lifetime1);
              kb.field_w.e();
              gf.b(2, 2, 0, 0, kb.field_w.field_z, kb.field_w.field_w);
              var6Lifetime1 = 0;
              while (!(var6Lifetime1 >= kb.field_w.field_B.length)) {
                kb.field_w.field_B[var6Lifetime1] = 16777215 + we.a(kb.field_w.field_B[var6Lifetime1] << 8, -16777216);
                var6Lifetime1++;
                if (var7 != 0) {
                  return;
                }
              }
            }
            cg.i(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.EA(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        int stackIn_40_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_69_0Lifetime1;
        int stackIn_69_1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var11Lifetime1;
        int var5Lifetime2;
        int var11Lifetime1Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_kb != 0) {
            fieldTemp$0 = this.field_kb + 1;
            this.field_kb = this.field_kb + 1;
            if (fieldTemp$0 >= 32) {
              this.field_Z = this.field_C;
              this.field_H = this.field_fb;
              this.field_kb = 0;
            }
          }
          if (3 == this.field_D ||
            null == this.field_C) {
            fieldTemp$1 = this.field_Q - 8;
            this.field_Q = this.field_Q - 8;
            if (fieldTemp$1 < 0) {
              this.field_Q = 0;
              if (var13 != 0) {
                fieldTemp$2 = this.field_Q + 8;
                this.field_Q = this.field_Q + 8;
                if (fieldTemp$2 > 256) {
                  this.field_Q = 256;
                }
              }
            }
          } else {
            fieldTemp$2 = this.field_Q + 8;
            this.field_Q = this.field_Q + 8;
            if (fieldTemp$2 > 256) {
              this.field_Q = 256;
            }
          }
          dupTemp$3 = this.field_p[this.field_w] + 1;
          this.field_p[this.field_w] = dupTemp$3;
          if (32 < dupTemp$3) {
            this.field_p[this.field_w] = 32;
          }
          var2_int = 32 - this.field_p[this.field_w];
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (4 <= var3))) {
            stackIn_40_0 = ~var3;
            if (var13 == 0) {
              if (stackIn_40_0 != ~this.field_w &&
                var2_int < this.field_p[var3]) {
                this.field_p[var3] = this.field_p[var3] - 1;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var3 = this.field_s.field_P.field_r;
            stackIn_40_0 = 210;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted2 = true;
          var4 = stackIn_40_0;
          if (var3 == 2) {
            var5 = 0;
            while (var5 < 4) {
              var6 = var4 / (4 - var5);
              this.field_ob[var5] = 12 + var6;
              var4 = var4 - var6;
              var5++;
              if (var13 != 0) {
                return;
              }
            }
          }
          if (var3 != 2 ||
            var13 != 0) {
            var5Lifetime2 = var4 / (6 + var3);
            var6Lifetime1 = 12 + 2 * var5Lifetime2;
            var7 = -(8 * var5Lifetime2) + var4;
            this.field_ob[this.field_w] = var6Lifetime1 + var7;
            var8 = re.a(0, 32, this.field_p[this.field_w], var7, 0);
            var7 = var7 - var8;
            var9 = new int[4];
            var10 = 0;
            var11 = 0;
            while (4 > var11) {
              stackIn_69_0 = this.field_w;
              stackIn_69_1 = var11;
              if (var13 != 0) {
                if (stackIn_69_0 > stackIn_69_1) {
                  stackIn_80_0 = var11;
                  stackIn_80_1 = this.field_w;
                  decompiledFrameCompleted3 = false;
                  break;
                }
                decompiledFrameCompleted2 = false;
                break;
              }
              if (stackIn_69_0 != stackIn_69_1) {
                var12 = re.a(0, 32, this.field_p[var11], 1024, 0);
                var9[var11] = var12;
                var10 = var10 + var12;
              }
              var11++;
            }
            if ((decompiledFrameCompleted3) &&
              (decompiledFrameCompleted2)) {
              if (var10 != 0) {
                var11Lifetime1 = 0;
                while (var11Lifetime1 < 4) {
                  stackIn_80_0 = var11Lifetime1;
                  stackIn_80_1 = this.field_w;
                  if (var13 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_80_0 != stackIn_80_1) {
                    this.field_ob[var11Lifetime1] = var7 * var9[var11Lifetime1] / var10 + var6Lifetime1;
                    this.field_ob[this.field_w] = this.field_ob[this.field_w] - var7 * var9[var11Lifetime1] / var10;
                  }
                  var11Lifetime1++;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (var10 == 0 ||
                var13 != 0)) {
                var11Lifetime1Lifetime1 = 0;
                while (true) {
                  stackIn_69_0Lifetime1 = ~var11Lifetime1Lifetime1;
                  stackIn_69_1Lifetime1 = -5;
                  if (stackIn_69_0Lifetime1 <= stackIn_69_1Lifetime1) {
                    break;
                  }
                  stackIn_80_0 = var11Lifetime1Lifetime1;
                  stackIn_80_1 = this.field_w;
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_80_0 != stackIn_80_1) {
                    this.field_ob[var11Lifetime1Lifetime1] = var6Lifetime1 + var7 / 3;
                    this.field_ob[this.field_w] = this.field_ob[this.field_w] - var7 / 3;
                  }
                  var11Lifetime1Lifetime1++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_80_0 = 20;
            stackIn_80_1 = 32;
          }
          var5Lifetime1 = re.a(stackIn_80_0, stackIn_80_1, this.field_b, 550, param0 - 3);
          this.field_F.a((byte) 85, 20 + (640 - var5Lifetime1) / 2, this.field_hb.field_t);
          this.field_lb.a((byte) 45, 5 + (this.field_hb.field_m + (-var5Lifetime1 + 640) / 2) + 20, this.field_gb.field_t);
          this.field_m.a((byte) 107, 2 * (this.field_hb.field_m + 5) + (640 - var5Lifetime1) / 2 + 20, this.field_db.field_t);
          this.field_M.a((byte) 101, (640 - var5Lifetime1) / 2 + 20 + (this.field_hb.field_m + 5) * param0, this.field_a.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.RA(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_40_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        nf var8_ref_nf = null;
        int var8 = 0;
        int var9 = 0;
        nf var9_ref_nf = null;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = ed.field_f * ed.field_f;
          var3 = var2_int - fl.field_h * fl.field_h;
          var4 = 360 + 120 * var3 / var2_int;
          this.field_O.a(640, 120, (byte) 112, var4, 0);
          this.field_E.field_xb.field_M.a(0);
          var5 = 0;
          var6 = 0;
          var7 = -1 + da.field_g;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var7 < 0))) {
            var8_ref_nf = wm.field_d[var7];
            stackIn_21_0 = ~kp.field_i;
            if (var11 == 0) {
              stackIn_10_0 = (stackIn_21_0 >= ~var5) ? 0 : 1;
              var9 = stackIn_10_0;
              if (var9 == 0) {
                var8_ref_nf.field_j = null;
              } else {
                if (null == var8_ref_nf.field_j) {
                  var10 = var8_ref_nf.field_g;
                  var8_ref_nf.field_j = new qr(0L, gn.field_w, var8_ref_nf.field_k);
                  var8_ref_nf.field_j.field_jb = ((16711422 & gn.field_w.field_jb) >> 1) + var10 - (var10 >> 1 & 8355711);
                  var6 += 15;
                  var8_ref_nf.field_j.field_nb = ho.field_f;
                  var8_ref_nf.field_j.field_x = var10;
                  var8_ref_nf.field_j.field_qb = (8355711 & gn.field_w.field_qb >> 1) + (-((var10 & 16711422) >> 1) + var10);
                }
                var5++;
              }
              var7--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            var7 = 0;
            stackIn_21_0 = 0;
          }
          var8 = stackIn_21_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < da.field_g)))) {
            var9_ref_nf = wm.field_d[var8];
            if (var11 == 0) {
              if (null != var9_ref_nf.field_j) {
                this.field_E.field_xb.a(4, var9_ref_nf.field_j);
                var9_ref_nf.field_j.a(var9_ref_nf.field_j.e(false), 15, (byte) 79, var7, tg.field_a);
                var7 += 15;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var8 = -var7 + var6 + this.field_E.field_xb.field_gb + this.field_E.field_xb.field_mb;
            this.field_E.field_xb.field_mb = this.field_E.field_xb.field_mb - var8;
            this.field_E.field_xb.field_db = this.field_E.field_xb.field_db + var8;
            this.field_E.field_xb.field_mb = var7;
            this.field_E.field_xb.field_gb = var7 - this.field_E.field_xb.field_mb;
          }
          var9Lifetime1 = this.field_E.field_zb.field_mb - this.field_E.field_xb.field_mb - this.field_E.field_xb.field_gb;
          if (this.field_v) {
            this.field_E.field_xb.field_w = var9Lifetime1 - this.field_E.field_xb.field_db;
          }
          this.field_E.a(30 * so.field_o, true, (byte) -115, param0);
          stackIn_40_1 = (var9Lifetime1 == this.field_E.field_xb.field_db + this.field_E.field_xb.field_w);
          this.field_v = stackIn_40_1;
          this.field_O.a(true, -20429);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kq.MA(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = uq.field_k;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(kr.field_f.length > var3_int)))) {
            var5 = ss.field_a[var3_int];
            stackIn_16_0 = -1;
            stackIn_16_1 = ~var5;
            if (var8 == 0) {
              if (stackIn_16_0 >= stackIn_16_1) {
                var6 = vm.a(kr.field_f[var3_int], 0, true);
                var7 = cn.field_w - (var6 >> 1);
                var4 = var4 + sm.field_b;
                if (ek.a(id.field_b + (ar.field_i << 1), param0, var7 - tr.field_Lb, (byte) -99, var4, (tr.field_Lb << 1) + var6, param1)) {
                  stackIn_11_0 = var5;
                  return stackIn_11_0;
                }
                var4 = var4 + (id.field_b + (ar.field_i << 1) + sm.field_b);
              } else {
                var4 = var4 + e.field_d;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = param2;
            stackIn_16_1 = 16777215;
          }
          if (stackIn_16_0 != stackIn_16_1) {
            field_L = (String) null;
          }
          stackIn_20_0 = -1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "kq.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, qh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_y.a(param1, 0);
          var3_int = -87 % ((param0 + 52) / 61);
          this.field_y.a(this.field_K, 0);
          this.field_y.a(this.field_V, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kq.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final String a(boolean param0, int param1) {
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        StringBuilder var4 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1 / 60;
          param1 = param1 % 60;
          var4 = new StringBuilder(5);
          discarded$20 = var4.append((char)(48 + var3_int / 10));
          discarded$21 = var4.append((char)(48 + var3_int % 10));
          discarded$22 = var4.append(':');
          discarded$23 = var4.append((char)(param1 / 10 + 48));
          discarded$24 = var4.append((char)(param1 % 10 + 48));
          if (param0) {
            kq.b((String) null, 61);
          }
          stackIn_4_0 = var4.toString();
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "kq.S(" + param0 + ',' + param1 + ')');
        }
    }

    final bh b(byte param0) {
        pf stackIn_8_0;
        int stackIn_8_1;
        bh stackIn_8_2;
        bh stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        bh stackIn_9_2;
        bh stackIn_9_3;
        int stackIn_9_6;
        pf stackIn_16_0;
        int stackIn_16_1;
        bh stackIn_16_2;
        bh stackIn_16_3;
        bh stackIn_17_2;
        bh stackIn_17_3;
        int stackIn_17_4;
        pf stackIn_24_0;
        int stackIn_24_1;
        bh stackIn_24_2;
        bh stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        bh stackIn_25_2;
        bh stackIn_25_3;
        int stackIn_25_7;
        pf stackIn_32_0;
        int stackIn_32_1;
        bh stackIn_32_2;
        bh stackIn_32_3;
        int stackIn_32_4;
        bh stackIn_33_2;
        bh stackIn_33_3;
        int stackIn_33_5;
        bh stackIn_37_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_2 = 0;
        Object stackIn_45_0 = null;
        bh stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_36_0;
        bh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bh var4 = null;
        pf var5 = null;
        int var6 = 0;
        Object var7 = null;
        bh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = new bh(0, 50, 640, 430);
          var3 = -79 % ((-6 - param0) / 50);
          if (!this.field_s.field_W) {
            stackIn_47_0 = new bh(0, 50, 640, 430);
            return stackIn_47_0;
          }
          var4 = new bh(e.field_f, fk.field_k, ei.field_e, kl.field_o);
          var5 = new pf();
          if (var2.field_l < var4.field_l) {
            stackIn_8_0 = var5;
            stackIn_8_1 = -113;
            stackIn_8_2 = null;
            stackIn_8_3 = null;
            stackIn_8_4 = var2.field_l;
            stackIn_8_5 = var2.field_q;
            if (var4.field_l > var2.field_o) {
              stackIn_9_2 = null;
              stackIn_9_3 = null;
              stackIn_9_6 = var2.field_o;
            } else {
              stackIn_9_2 = null;
              stackIn_9_3 = null;
              stackIn_9_6 = var4.field_l;
            }
            ((pf) (Object) stackIn_8_0).a((byte) stackIn_8_1, new bh(stackIn_8_4, stackIn_8_5, stackIn_9_6, var2.field_i));
          }
          if (var4.field_o < var2.field_o) {
            stackIn_16_0 = var5;
            stackIn_16_1 = -113;
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            if (var4.field_o >= var2.field_l) {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_4 = var4.field_o;
            } else {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_4 = var2.field_l;
            }
            ((pf) (Object) stackIn_16_0).a((byte) stackIn_16_1, new bh(stackIn_17_4, var2.field_q, var2.field_o, var2.field_i));
          }
          if (var4.field_q > var2.field_q) {
            stackIn_24_0 = var5;
            stackIn_24_1 = -113;
            stackIn_24_2 = null;
            stackIn_24_3 = null;
            stackIn_24_4 = var2.field_l;
            stackIn_24_5 = var2.field_q;
            stackIn_24_6 = var2.field_o;
            if (var2.field_i < var4.field_q) {
              stackIn_25_2 = null;
              stackIn_25_3 = null;
              stackIn_25_7 = var2.field_i;
            } else {
              stackIn_25_2 = null;
              stackIn_25_3 = null;
              stackIn_25_7 = var4.field_q;
            }
            ((pf) (Object) stackIn_24_0).a((byte) stackIn_24_1, new bh(stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_25_7));
          }
          if (var2.field_i > var4.field_i) {
            stackIn_32_0 = var5;
            stackIn_32_1 = -113;
            stackIn_32_2 = null;
            stackIn_32_3 = null;
            stackIn_32_4 = var2.field_l;
            if (var2.field_q <= var4.field_i) {
              stackIn_33_2 = null;
              stackIn_33_3 = null;
              stackIn_33_5 = var4.field_i;
            } else {
              stackIn_33_2 = null;
              stackIn_33_3 = null;
              stackIn_33_5 = var2.field_q;
            }
            ((pf) (Object) stackIn_32_0).a((byte) stackIn_32_1, new bh(stackIn_32_4, stackIn_33_5, var2.field_o, var2.field_i));
          }
          var6 = 0;
          var7 = null;
          var8 = (bh) (var5.d(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8))) {
            var9 = -var8.field_l + var8.field_o;
            stackOut_36_0 = var8;
            stackIn_45_0 = stackOut_36_0;
            stackIn_37_0 = stackOut_36_0;
            if (var12 == 0) {
              var10 = -stackIn_37_0.field_q + var8.field_i;
              stackIn_40_0 = var10;
              stackIn_40_1 = var9;
              if (var9 >= var10) {
                stackIn_41_2 = var10;
              } else {
                stackIn_41_2 = var9;
              }
              var11 = stackIn_40_0 * (stackIn_40_1 * stackIn_41_2);
              if (var11 > var6) {
                var7 = var8;
                var6 = var11;
              }
              var8 = (bh) (var5.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_45_0 = var7;
          }
          return (bh) (stackIn_45_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.PA(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        em var2 = null;
        RuntimeException var2_ref = null;
        lp var3_ref_lp = null;
        sd var3_ref_sd = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        lp var4_ref_lp = null;
        int var4 = 0;
        lp var5 = null;
        fs var5_ref = null;
        lp var6 = null;
        sd var6_ref = null;
        lp var7 = null;
        lp var8 = null;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder1 = true;
          this.field_e.field_z.e(param0 + 15907);
          var2 = (em) (this.field_e.field_x);
          if (null != this.field_s.field_n &&
            (1 << this.field_s.field_n.field_x & this.field_s.field_P.field_w) == 0) {
            if (this.field_s.field_P.field_o.field_i) {
              var2.field_d = new jh[1];
              var2.field_f = new lp[1];
              var2.field_i = new qk[1];
              var3_ref_lp = rc.a((byte) 119, this.field_s.field_n.field_m, var2, true);
              var3_ref_lp.a((byte) 108, this.field_e.field_z.field_k, this.field_e.field_z.field_y + this.field_e.field_z.field_t);
              this.field_e.field_z.a(var3_ref_lp, 8);
              if (this.field_s.field_n.field_m.field_x <= 0) {
                this.field_e.field_A = false;
                this.field_mb.d(false);
                if (var9 != 0) {
                  this.field_e.field_A = true;
                  this.field_mb.g(88);
                }
              } else {
                this.field_e.field_A = true;
                this.field_mb.g(88);
              }
              decompiledFrameRemainder1 = (var9 != 0);
            }
            if (decompiledFrameRemainder1) {
              var2.field_d = new jh[this.field_s.field_n.field_i.e(0)];
              var2.field_f = new lp[this.field_s.field_n.field_i.e(0)];
              var2.field_i = new qk[this.field_s.field_n.field_i.e(0)];
              this.field_e.field_A = false;
              this.field_mb.d(false);
              var3_ref_sd = (sd) (this.field_s.field_n.field_i.d(0));
              if (var3_ref_sd != null) {
                var4_ref_lp = rc.a((byte) 120, var3_ref_sd, var2, true);
                var4_ref_lp.a((byte) 52, this.field_e.field_z.field_k, this.field_e.field_z.field_t + this.field_e.field_z.field_y);
                this.field_e.field_z.a(var4_ref_lp, 8);
                if (var3_ref_sd.field_x > 0) {
                  this.field_e.field_A = true;
                  this.field_mb.g(param0 ^ -15994);
                }
                var3_ref_sd = (sd) (this.field_s.field_n.field_i.a((byte) -71));
                while (var3_ref_sd != null) {
                  var5 = rc.a((byte) 123, var3_ref_sd, var2, false);
                  var5.a((byte) 126, this.field_e.field_z.field_k, this.field_e.field_z.field_t + this.field_e.field_z.field_y);
                  this.field_e.field_z.a(var5, param0 + 15915);
                  stackIn_40_0 = ~var3_ref_sd.field_x;
                  stackIn_40_1 = -1;
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_40_0 < stackIn_40_1) {
                    this.field_e.field_A = true;
                    this.field_mb.g(95);
                  }
                  var3_ref_sd = (sd) (this.field_s.field_n.field_i.a((byte) -71));
                }
              }
            }
          }
          if (decompiledFrameCompleted1) {
            if (null != this.field_s.field_n && (!this.field_s.field_W ||
              !(kb.field_x < 5))) {
              this.field_e.field_z.a(hc.a(this.field_e.field_z.field_k, 126, this.field_e.field_z.field_y + this.field_e.field_z.field_t), 8);
            }
            stackIn_40_0 = param0;
            stackIn_40_1 = -15907;
          }
          if (stackIn_40_0 != stackIn_40_1) {
            this.b((byte) 96);
          }
          var3_ref_fs__ = this.field_s.field_P.field_v;
          var4 = 0;
          while (var4 < var3_ref_fs__.length) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            var5_ref = var3_ref_fs__[var4];
            if (var5_ref != this.field_s.field_n &&
              (this.field_s.field_P.field_w & 1 << var5_ref.field_x) == 0) {
              if (this.field_s.field_P.field_o.field_i) {
                var6 = an.a((byte) -76, true, var5_ref.field_m);
                var6.a((byte) 113, this.field_e.field_z.field_k, this.field_e.field_z.field_y + this.field_e.field_z.field_t);
                this.field_e.field_z.a(var6, param0 ^ -15915);
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                var6_ref = (sd) (var5_ref.field_i.d(0));
                if (var6_ref != null) {
                  var7 = an.a((byte) -76, true, var6_ref);
                  var7.a((byte) 52, this.field_e.field_z.field_k, this.field_e.field_z.field_y + this.field_e.field_z.field_t);
                  this.field_e.field_z.a(var7, 8);
                  var6_ref = (sd) (var5_ref.field_i.a((byte) -71));
                  while (null != var6_ref) {
                    var8 = an.a((byte) -76, false, var6_ref);
                    var8.a((byte) 51, this.field_e.field_z.field_k, this.field_e.field_z.field_y + this.field_e.field_z.field_t);
                    this.field_e.field_z.a(var8, param0 ^ -15915);
                    var6_ref = (sd) (var5_ref.field_i.a((byte) -71));
                    if (var9 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var4++;
            }
            if (var9 == 0) {
              continue;
            }
            break;
          }
          var3 = 3 + this.field_e.field_z.field_y + 20;
          if (var3 > 363) {
            var3 = 363;
          }
          this.field_e.a(true, var3, this.field_e.field_m);
          this.field_e.field_z.a(true, -18 + (var3 - 10), this.field_e.field_z.field_m);
          var2.field_e.a(true, -10 + (-15 + (var3 - 3)), var2.field_e.field_m);
          if (var3 < 363) {
            var2.field_e.field_p = false;
            if (var9 == 0) {
              return;
            }
          }
          var2.field_e.field_p = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.QA(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ad var2 = null;
        RuntimeException var2_ref = null;
        sd var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_s.field_z.e(-18641);
          this.field_s.a(2);
          if (this.field_s.field_n == null) {
            return;
          }
          if (param0 < 93) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var2 = (ad) (this.field_k.field_v);
          if (var2.field_e.d((byte) 34) &&
            this.field_s.field_m != 2) {
            if (!this.field_s.field_P.field_o.field_i) {
              var3 = (sd) (this.field_s.field_n.field_i.d(0));
              while (null != var3) {
                stackIn_28_0 = -1;
                stackIn_28_1 = ~var3.field_x;
                if (var4 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_28_0 > stackIn_28_1) {
                  this.a(-2, var3, true);
                  return;
                }
                var3 = (sd) (this.field_s.field_n.field_i.a((byte) -71));
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (this.field_s.field_n.field_m.field_x > 0)) {
              this.a(-2, this.field_s.field_n.field_m, true);
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_s.m(124);
            this.field_bb.g(81);
            var2.field_e.a(-2948, (bi) null);
            stackIn_28_0 = this.field_s.field_N;
            stackIn_28_1 = 1;
          }
          if (stackIn_28_0 != stackIn_28_1) {
            this.a(10, 0, re.a(gs.field_m, 4371, new String[]{Integer.toString(this.field_s.field_N)}));
            if (var4 == 0) {
              return;
            }
          }
          this.a(10, 0, il.field_Y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "kq.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[3];
          rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
          var6 = 20 + param3 + rs.field_Cb.field_J + 9;
          var7 = 64 + rs.field_Cb.c("= " + re.a(sq.field_p, 4371, new String[]{Integer.toString(2)}));
          rk.field_k.b((-var7 + param1) / 2 + param0, -24 + var6, 64, 64);
          rs.field_Cb.d(re.a(hg.field_s, 4371, new String[]{Integer.toString(2)}), param0 - (-((param1 - var7) / 2) - 75), var6 + 7, 16777215, -1);
          rs.field_Cb.d("=", param0 + (param1 - var7) / 2 + 64, 13 + var6, 16777215, -1);
          rs.field_Cb.d(re.a(sq.field_p, 4371, new String[]{Integer.toString(2)}), 75 + ((param1 - var7) / 2 + param0), 19 + var6, 16777215, -1);
          var6 += 44;
          ti.field_h.b((-var7 + param1) / 2 + param0, var6 - 24, 64, 64);
          rs.field_Cb.d(re.a(hg.field_s, 4371, new String[]{Integer.toString(2)}), 75 + ((-var7 + param1) / 2 + param0), 7 + var6, 16777215, -1);
          int var8 = 27 / ((param2 + 51) / 59);
          rs.field_Cb.d("=", (-var7 + param1) / 2 + (param0 + 64), 13 + var6, 16777215, -1);
          rs.field_Cb.d(re.a(sq.field_p, 4371, new String[]{Integer.toString(2)}), 75 + (param1 - var7) / 2 + param0, var6 + 19, 16777215, -1);
          var6 += 52;
          cp.field_t.b(param0 + (param1 - var7) / 2, var6 - 24, 64, 64);
          rs.field_Cb.d(re.a(hg.field_s, 4371, new String[]{Integer.toString(5)}), 75 + ((-var7 + param1) / 2 + param0), var6 + 7, 16777215, -1);
          rs.field_Cb.d("=", 64 + param0 + (-var7 + param1) / 2, 13 + var6, 16777215, -1);
          rs.field_Cb.d(re.a(sq.field_p, 4371, new String[]{Integer.toString(5)}), param0 - (-((-var7 + param1) / 2) - 75), 19 + var6, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kq.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, fs[] param1, int[] param2, int[] param3, fs[] param4, qk[] param5, byte param6, int param7) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        lp var9 = null;
        RuntimeException var9_ref = null;
        lp var10 = null;
        int var11 = 0;
        lp var12 = null;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param6 != -47) {
            return;
          }
          var9 = this.field_nb.field_z;
          var9.e(0);
          var10 = mf.a(param5, true);
          var10.a((byte) 61, var9.field_k, var9.field_y + var9.field_t);
          var9.a(var10, 8);
          var11 = 0;
          L2: while (true) {
            if (param1.length > var11) {
              var12 = fb.a(param7, param0, 28, param3[var11], param1[var11], param2[var11], param4, this.field_s.field_P);
              var12.a((byte) 38, var9.field_k, var9.field_t + var9.field_y);
              var9.a(var12, param6 ^ -39);
              var11++;
              if (var13 == 0) {
                continue;
              }
            } else {
              if (param7 > 0 &&
                3 >= param7) {
                break L2;
              }
              this.field_nb.field_A = false;
              this.field_g.d(false);
            }
            if (var13 == 0) {
              return;
            }
            break;
          }
          this.field_nb.field_A = true;
          this.field_g.g(108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_22_0 = var9_ref;
          stackIn_22_1 = new StringBuilder().append("kq.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param5 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(int param0, sd param1, boolean param2) {
        StringBuilder stackIn_17_0 = null;
        String stackIn_18_1 = null;
        StringBuilder stackIn_30_0 = null;
        String stackIn_31_1 = null;
        boolean stackIn_36_0 = false;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        em var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        ad var5 = null;
        ln var5_ref = null;
        jh var6 = null;
        qk var7 = null;
        sd var8 = null;
        String var9 = null;
        int var10 = 0;
        String var9Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_s.field_c = param1;
          this.a(-83, 2);
          var4 = (em) (this.field_e.field_x);
          if (param0 != -2) {
            this.field_x = 60;
          }
          var5_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var4.field_d.length > var5_int)))) {
            var6 = var4.field_d[var5_int];
            var7 = var4.field_i[var5_int];
            var8 = (sd) (var6.field_h);
            stackIn_36_0 = var6.f(param0 + 244874371);
            if (var10 == 0) {
              if (stackIn_36_0) {
                var6.e((byte) 72);
                if (var8.field_x != 0) {
                  stackIn_17_0 = new StringBuilder().append(hd.field_j).append(" ");
                  if (var8.field_x != 1) {
                    stackIn_18_1 = re.a(d.field_c, 4371, new String[]{Integer.toString(var8.field_x)});
                  } else {
                    stackIn_18_1 = ad.field_a;
                  }
                  var9 = ((StringBuilder) (Object) stackIn_17_0).append(stackIn_18_1).toString();
                } else {
                  var9 = pe.field_F;
                }
                var7.field_o = var9;
                var6.field_o = var9;
              }
              if (param1 == var6.field_h) {
                var6.e((byte) 26);
                if (var8.field_x != 0) {
                  stackIn_30_0 = new StringBuilder().append(il.field_lb).append(" ");
                  if (var8.field_x != 1) {
                    stackIn_31_1 = re.a(d.field_c, 4371, new String[]{Integer.toString(var8.field_x)});
                  } else {
                    stackIn_31_1 = ad.field_a;
                  }
                  var9Lifetime1 = ((StringBuilder) (Object) stackIn_30_0).append(stackIn_31_1).toString();
                } else {
                  var9Lifetime1 = pe.field_F;
                }
                var7.field_o = var9Lifetime1;
                var6.field_o = var9Lifetime1;
              }
              var5_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_36_0 = param2;
          }
          if (stackIn_36_0) {
            var5 = (ad) (this.field_k.field_v);
            var5.field_e.a(-2948, this.field_t);
            var5.field_f.a((byte) 122, 55, var5.field_f.field_t);
            if (this.field_s.field_W) {
              fl.a(0, "unplaced");
            }
          }
          var5_ref = param1.j(18229);
          while (null != var5_ref) {
            this.field_s.field_z.field_z[var5_ref.field_p] = 2;
            var5_ref = param1.h(-23410);
            if (var10 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_50_0 = var4_ref;
          stackIn_50_1 = new StringBuilder().append("kq.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param2).append(')').toString());
        }
    }

    kq(km param0) {
        int var2_int = 0;
        int var3 = 0;
        int var6 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        qr var3_ref_qr = null;
        fs var4 = null;
        qr var4_ref = null;
        int var5 = 0;
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_v = true;
        try {
          fj.field_r = new bi(20 + aq.field_i.field_o, aq.field_i.field_p + 20);
          kb.field_w = new om(rk.field_j.field_o + 20, rk.field_j.field_p + 20);
          this.field_I = true;
          this.field_s = param0;
          this.field_y = new pf();
          this.field_e = ch.a((byte) 112);
          this.field_y.a((byte) -113, this.field_e);
          if (this.field_s.field_n != null) {
            this.field_j = ij.b((byte) 127);
            this.field_y.a((byte) -113, this.field_j);
          }
          this.field_J = mg.d(28, this.field_s.field_P.field_r);
          this.i(6);
          this.field_y.a((byte) -113, this.field_J);
          this.field_cb = gl.a(this.field_s.field_P.field_r, -1);
          this.field_y.a((byte) -113, this.field_cb);
          var2_int = this.field_s.field_P.field_x.b(false);
          if (var2_int > 0) {
            this.field_nb = in.a(var2_int, true);
            this.field_y.a((byte) -113, this.field_nb);
          }
          this.field_k = ol.a((byte) 69);
          this.field_y.a((byte) -113, this.field_k);
          if (null != this.field_s.field_n) {
            this.field_S = new jh(511, 25, h.field_F.field_z, h.field_F.field_w, -1, h.field_F, (String) null, 0, -1, ak.field_x, (String) null, 0);
            this.field_S.field_o = n.field_j;
            this.field_y.a((byte) -113, this.field_S);
          }
          this.field_n = new jh(h.field_F.field_z / 2 + 512, 5, fm.field_e.field_z, fm.field_e.field_w, -1, fm.field_e, (String) null, 0, -1, bd.field_D, (String) null, 0);
          this.field_n.field_o = rk.field_o;
          this.field_y.a((byte) -113, this.field_n);
          this.field_W = new jh(513 + h.field_F.field_z, 25, k.field_d.field_z, k.field_d.field_w, -1, k.field_d, (String) null, 0, -1, cs.field_h, (String) null, 0);
          this.field_W.field_o = wm.field_a;
          this.field_y.a((byte) -113, this.field_W);
          this.field_mb = new jh(fm.field_e.field_z + 514 + h.field_F.field_z / 2, 5, tm.field_r.field_z, tm.field_r.field_w, -1, tm.field_r, (String) null, 0, -1, je.field_b, (String) null, 0);
          this.field_mb.field_o = t.field_b;
          this.field_y.a((byte) -113, this.field_mb);
          if (this.field_nb != null) {
            this.field_g = new jh(k.field_d.field_z + h.field_F.field_z + 515, 25, wl.field_d.field_z, wl.field_d.field_w, -1, wl.field_d, (String) null, 0, -1, nr.field_k, (String) null, 0);
            this.field_g.field_o = hi.field_d;
            this.field_y.a((byte) -113, this.field_g);
          }
          if (this.field_s.field_n != null) {
            this.field_bb = new jh(521 + h.field_F.field_z * 3, 20, rk.field_j.field_z, rk.field_j.field_w, -1, rk.field_j, (String) null, 0, -1, ei.field_a, (String) null, 0);
            this.field_bb.field_o = oj.field_Bb;
            this.field_y.a((byte) -113, this.field_bb);
          }
          this.field_K = new os(590, 480 - rs.field_Cb.field_J, 60, 2 * rs.field_Cb.field_J);
          this.field_y.a(this.field_K, 0);
          this.field_N = new jh(595, 480 - nr.field_r[3].field_w, nr.field_r[3].field_z, nr.field_r[3].field_w, -1, nr.field_r[3], (String) null, 0, -1, nr.field_r[0], (String) null, 0);
          if ((32 & de.field_j) != 0) {
            this.field_N.e((byte) 9);
            this.field_N.field_o = fi.field_i;
            if (var6 != 0) {
              this.field_N.field_o = fl.field_e;
            }
          } else {
            this.field_N.field_o = fl.field_e;
          }
          this.field_X = new jh(610, -nr.field_r[1].field_w + 480, nr.field_r[1].field_z, nr.field_r[1].field_w, -1, nr.field_r[1], (String) null, 0, -1, nr.field_r[4], (String) null, 0);
          this.field_X.field_o = da.field_f;
          this.field_d = new jh(625, 480 - nr.field_r[5].field_w, nr.field_r[5].field_z, nr.field_r[5].field_w, -1, nr.field_r[5], (String) null, 0, -1, nr.field_r[2], (String) null, 0);
          if ((de.field_j & 64) == 0) {
            this.field_d.field_o = ec.field_t;
            if (var6 != 0) {
              this.field_d.e((byte) 23);
              this.field_d.field_o = de.field_k;
            }
          } else {
            this.field_d.e((byte) 23);
            this.field_d.field_o = de.field_k;
          }
          this.field_K.a(this.field_N, 8);
          this.field_K.a(this.field_X, 8);
          this.field_K.a(this.field_d, 8);
          this.field_V = new os(3, 480, 10 + rs.field_Cb.c(fk.field_l), 2 * rs.field_Cb.field_J);
          this.field_f = new jh(3, 480, this.field_V.field_m, rs.field_Cb.field_J - 4, -1, (bi) null, fk.field_l, 16777215, -1, (bi) null, db.field_d, 16777215);
          this.field_V.a(this.field_f, 8);
          this.field_y.a(this.field_V, 0);
          this.field_t = new om(go.field_L.field_o, go.field_L.field_p);
          ra.a(-128);
          this.field_t.e();
          go.field_L.d(0, 0, 16711680);
          var3 = 0;
          L11: while (true) {
            if (this.field_t.field_B.length > var3) {
              stackIn_45_0 = 0;
              stackIn_45_1 = this.field_t.field_B[var3];
              if (var6 != 0) {
                if (stackIn_45_0 > stackIn_45_1) {
                  var4 = this.field_s.field_P.field_v[var3];
                  jr.a("playercol" + var3, 1904, re.a("<col=<%0>>", 4371, new String[]{Integer.toString(var4.field_s, 16)}));
                  jr.a("player" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(var4.field_s, 16), var4.field_t}));
                  jr.a("playerhome" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(var4.field_s, 16), var4.field_m.field_q.field_I}));
                  var3++;
                  return;
                }
                break L11;
              }
              if (stackIn_45_0 != stackIn_45_1) {
                gf.c(var3 % this.field_t.field_z, var3 / this.field_t.field_z, 16711680, 128);
                this.field_t.field_B[var3] = ee.a(this.field_t.field_B[var3], -16777216);
              }
              var3++;
              continue;
            }
            cg.i(0);
            if (!this.field_s.field_f &&
              !this.field_s.field_W) {
              qn.b(116);
              var3_ref_qr = new qr(0L, (qr) null);
              var3_ref_qr.field_M = new pf();
              this.field_E = new ub(0L, var3_ref_qr, dm.field_h, se.field_m);
              var4_ref = new qr(0L, l.field_a);
              this.field_O = new qr(0L, oh.field_a);
              this.field_O.a(640, 120, (byte) 116, 480, 0);
              var4_ref.a(634, this.field_O.field_mb - 6, (byte) 84, 3, 3);
              this.field_O.a(4, var4_ref);
              var4_ref.a(4, this.field_E);
              var5 = -5 + var4_ref.field_mb;
              this.field_E.a(624, 5, 5, 2, -125, -5 + var5, 15);
              ge.field_n = false;
            }
            cq.a(rs.field_Cb, true);
            this.field_ob = new int[]{82, 52, 52, 52};
            this.field_Q = 0;
            this.field_ab = new String[1 + this.field_s.field_P.field_r];
            this.field_U = -1;
            this.field_p = new int[]{32, 0, 0, 0};
            this.field_z = new boolean[this.field_s.field_P.field_r + 1];
            this.field_B = new pf();
            this.field_F = new os(0, 410, 128, 21);
            this.field_lb = new os(0, 410, 128, 21);
            this.field_m = new os(0, 410, 128, 21);
            this.field_M = new os(0, 410, 128, 21);
            this.field_B.a((byte) -113, this.field_F);
            this.field_B.a((byte) -113, this.field_lb);
            this.field_B.a((byte) -113, this.field_m);
            this.field_B.a((byte) -113, this.field_M);
            this.field_hb = new jh(0, 410, 128, 21, -1, (bi) null, ja.field_n.toUpperCase(), 16777215, -1, (bi) null, ja.field_n.toUpperCase(), 2805974);
            this.field_F.a(this.field_hb, 8);
            this.field_gb = new jh(0, 410, 128, 21, -1, (bi) null, na.field_s.toUpperCase(), 16777215, -1, (bi) null, na.field_s.toUpperCase(), 2805974);
            this.field_lb.a(this.field_gb, 8);
            this.field_db = new jh(0, 410, 128, 21, -1, (bi) null, po.field_a.toUpperCase(), 16777215, -1, (bi) null, po.field_a.toUpperCase(), 2805974);
            this.field_m.a(this.field_db, 8);
            this.field_a = new jh(0, 410, 128, 21, -1, (bi) null, ph.field_a.toUpperCase(), 16777215, -1, (bi) null, ph.field_a.toUpperCase(), 2805974);
            this.field_M.a(this.field_a, 8);
            this.field_hb.field_h = new Integer(0);
            this.field_gb.field_h = new Integer(1);
            this.field_db.field_h = new Integer(2);
            this.field_a.field_h = new Integer(3);
            this.field_a.e((byte) 54);
            if (!this.field_s.field_W) {
              return;
            }
            this.field_mb.field_s = false;
            this.field_n.field_s = false;
            this.field_W.field_s = false;
            this.field_S.field_s = false;
            this.field_g.field_s = false;
            this.field_bb.field_s = false;
            this.field_K.field_s = false;
            this.field_V.field_s = false;
            jr.a("continue", 1904, wm.field_e);
            jr.a("continue2", 1904, aq.field_k);
            jr.a("continue3", 1904, gn.field_v);
            jr.a("continuekey", 1904, ul.field_Ob);
            jr.a("captureAll", 1904, in.field_e);
            jr.a("exit", 1904, sa.field_b);
            ho.field_d = this.field_s.field_n;
            var3 = 0;
            while (true) {
              stackIn_45_0Lifetime1 = this.field_s.field_P.field_r;
              stackIn_45_1Lifetime1 = var3;
              if (stackIn_45_0Lifetime1 <= stackIn_45_1Lifetime1) {
                break;
              }
              var4 = this.field_s.field_P.field_v[var3];
              jr.a("playercol" + var3, 1904, re.a("<col=<%0>>", 4371, new String[]{Integer.toString(var4.field_s, 16)}));
              jr.a("player" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(var4.field_s, 16), var4.field_t}));
              jr.a("playerhome" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(var4.field_s, 16), var4.field_m.field_q.field_I}));
              var3++;
              if (var6 != 0) {
                return;
              }
            }
            break;
          }
          lp.a(1546006977, n.a("start", -21502));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("kq.<init>(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_L = "DEFEAT!";
        field_i = "<%0> cannot join; the game has started.";
    }
}
