/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km implements mn {
    private int[] field_r;
    static ln field_u;
    private int field_D;
    int field_S;
    private int[] field_t;
    k field_Q;
    private int field_g;
    private int field_Z;
    private db field_ab;
    private int[] field_U;
    int field_N;
    boolean[] field_V;
    sd field_c;
    boolean field_L;
    int field_i;
    private boolean[] field_w;
    int field_q;
    private db field_o;
    dc field_P;
    static String field_a;
    private int field_I;
    private boolean field_G;
    private int[] field_J;
    int field_m;
    uj[] field_s;
    private sf field_E;
    private int[] field_d;
    int field_h;
    boolean field_j;
    static String field_A;
    private int field_k;
    private int field_F;
    private sd[] field_l;
    private pf field_H;
    kq field_Y;
    private int[] field_C;
    private int field_x;
    private boolean field_b;
    private fs[] field_R;
    tr field_z;
    private wb field_v;
    private ln field_K;
    boolean field_f;
    boolean field_W;
    private boolean field_T;
    static qr field_e;
    private int field_O;
    boolean field_M;
    private boolean field_y;
    private int[] field_p;
    static String field_X;
    fs field_n;

    private final void a(fs param0, String param1, byte param2) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != 51) {
            this.field_q = -105;
          }
          if (this.field_W) {
            return;
          }
          var4 = param0.field_t + ": ";
          var5 = ji.field_I.field_K;
          if (this.field_f) {
            var5 = var5 - ho.field_f.c("[" + re.a(he.field_q, 4371, new String[]{this.field_P.field_v[0].field_t}) + "] ");
          }
          if (this.field_f) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = param0.field_k;
          }
          var6 = stackIn_16_0;
          var7 = -ho.field_f.c(var4) + var5 - 20;
          if (var7 < ho.field_f.c(param1)) {
            var8 = vi.a(ho.field_f, (byte) 125, param1, new int[]{var7});
            var9 = var8;
            var10 = 0;
            while (var9.length > var10) {
              var11 = var9[var10];
              md.a(1, var4 + var11, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
              var10++;
              if (var12 != 0) {
                return;
              }
            }
            if (var12 == 0) {
              return;
            }
          }
          md.a(1, var4 + param1, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("km.HA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, fs param1) {
        RuntimeException runtimeException = null;
        sd var3 = null;
        ln var4_ref_ln = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = (sd) (param1.field_i.d(0));
          L0: while (var3 != null) {
            var4_ref_ln = var3.j(18229);
            while (true) {
              if (var4_ref_ln != null) {
                var4_ref_ln.field_R = null;
                var4_ref_ln.field_y = null;
                var4_ref_ln.b((byte) -83);
                var4_ref_ln = var3.h(-23410);
                if (var5 == 0) {
                  continue;
                }
              } else {
                var3.b((byte) -89);
                var3 = (sd) (param1.field_i.a((byte) -71));
              }
              break;
            }
            if (var5 == 0) {
              continue L0;
            }
            break;
          }
          var4 = 107 % ((param0 - 77) / 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("km.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(int param0, ob param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_P.a(param2, (byte) -124, param1);
          if (param0 != 1) {
            this.field_r = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("km.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return;
          }
          if (!this.field_f) {
            qn.b(117);
            var3_int = param1 ? 1 : 0;
            ta.a(0, 0, (byte) 96, var3_int != 0);
          }
          if (-1 != de.field_j &&
            ~de.field_j != ~uc.field_A) {
            ta.b((byte) -69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(fs param0, int param1) {
        fs stackIn_9_0 = null;
        fs stackIn_9_1 = null;
        int stackIn_59_0 = 0;
        boolean stackIn_64_0 = false;
        ln stackIn_76_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_91_0 = false;
        boolean stackIn_117_0 = false;
        boolean stackIn_124_0 = false;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        String stackIn_145_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_63_0;
        boolean stackOut_90_0;
        boolean stackOut_123_0;
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        ln[] var4_ref_ln__ = null;
        int var4 = 0;
        int var5_int = 0;
        ln[] var5 = null;
        ln var6_ref_ln = null;
        int var6 = 0;
        mg var7 = null;
        int var7_int = 0;
        ln var7_ref = null;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        ln[] var10_array = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        ln stackIn_76_0Lifetime1;
        ln var6_ref_lnLifetime1;
        ln[] var10_arrayLifetime1;
        ln var12Lifetime1;
        ln var6_ref_lnLifetime1Lifetime1;
        ln[] var10_arrayLifetime1Lifetime1;
        ln var12Lifetime1Lifetime1;
        int stackIn_85_0Lifetime1;
        boolean stackIn_117_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var9Lifetime2;
        int var9Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = this.field_P.field_g.field_e;
          if (param1 > -65) {
            this.d((byte) -75);
          }
          var4_ref_ln__ = var3;
          var5_int = 0;
          L3: while (true) {
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted2 = true;
            if (var4_ref_ln__.length > var5_int) {
              var6_ref_ln = var4_ref_ln__[var5_int];
              this.field_d[var6_ref_ln.field_p] = 0;
              this.field_U[var6_ref_ln.field_p] = 0;
              stackIn_76_0 = var6_ref_ln;
              if (var13 != 0) {
                while (true) {
                  var6_ref_ln = stackIn_76_0;
                  this.field_t[var6_ref_ln.field_p] = 0;
                  this.field_r[var6_ref_ln.field_p] = 0;
                  var5_int++;
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                stackIn_9_0 = stackIn_76_0.field_y;
                stackIn_9_1 = (fs) (param0);
                L10: while (true) {
                  boolean decompiledSharedTail0 = (stackIn_9_0 == stackIn_9_1);
                  if (!decompiledSharedTail0) {
                    this.field_w[var6_ref_ln.field_p] = false;
                    this.field_p[var6_ref_ln.field_p] = 0;
                    this.field_V[var6_ref_ln.field_p] = false;
                    this.field_J[var6_ref_ln.field_p] = 0;
                    decompiledSharedTail0 = (var13 != 0);
                  }
                  if (decompiledSharedTail0) {
                    this.field_w[var6_ref_ln.field_p] = true;
                    this.field_p[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                    this.field_V[var6_ref_ln.field_p] = true;
                    this.field_J[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                  }
                  var7 = (mg) (var6_ref_ln.field_s.c(-128));
                  while (null != var7) {
                    stackIn_9_0 = (fs) (param0);
                    stackIn_9_1 = var7.field_G;
                    if (var13 != 0) {
                      continue L10;
                    }
                    if (stackIn_9_0 == stackIn_9_1) {
                      this.field_p[var6_ref_ln.field_p] = this.field_p[var6_ref_ln.field_p] + var7.field_z;
                      this.field_w[var6_ref_ln.field_p] = true;
                      if (param0 == var7.field_B.field_y ||
                        var7.field_B.field_x == 0) {
                        this.field_J[var6_ref_ln.field_p] = this.field_J[var6_ref_ln.field_p] + var7.field_z;
                        this.field_V[var6_ref_ln.field_p] = true;
                      }
                    }
                    var7 = (mg) (var6_ref_ln.field_s.b(32));
                  }
                  if (null != param0) {
                    var8_ref_ln__ = var6_ref_ln.field_D;
                    var9 = 0;
                    while (var9 < var8_ref_ln__.length) {
                      var10 = var8_ref_ln__[var9];
                      stackIn_9_0 = (fs) (param0);
                      stackIn_9_1 = var10.field_y;
                      if (var13 != 0) {
                        continue L10;
                      }
                      if (stackIn_9_0 != stackIn_9_1 &&
                        null != var10.field_y && (!var10.field_y.field_h[param0.field_x] ||
                        var6_ref_ln.field_y != param0)) {
                        this.field_V[var6_ref_ln.field_p] = false;
                        this.field_J[var6_ref_ln.field_p] = 0;
                        break;
                      }
                      var9++;
                    }
                  }
                  break;
                }
                var5_int++;
                if (var13 == 0) {
                  continue;
                }
              }
            }
            if (decompiledFrameCompleted3) {
              if (!this.field_P.field_o.field_k) {
                if (this.field_P.field_o.field_l) {
                  var4_ref_ln__ = var3;
                  var5_int = 0;
                  while (var4_ref_ln__.length > var5_int) {
                    var6_ref_lnLifetime1 = var4_ref_ln__[var5_int];
                    this.field_t[var6_ref_lnLifetime1.field_p] = 1;
                    this.field_r[var6_ref_lnLifetime1.field_p] = 1;
                    var5_int++;
                    if (var13 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted2) {
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted2)) {
                  var4_ref_ln__ = var3;
                  var5_int = 0;
                  while (true) {
                    stackIn_59_0 = ~var5_int;
                    if (stackIn_59_0 > ~var4_ref_ln__.length) {
                      var6_ref_lnLifetime1 = var4_ref_ln__[var5_int];
                      var7_int = var6_ref_lnLifetime1.field_p;
                      var8 = 0;
                      var9Lifetime2 = 0;
                      var10_array = var6_ref_lnLifetime1.field_D;
                      stackIn_81_0 = 0;
                      if (var13 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      var11 = stackIn_81_0;
                      while (var10_array.length > var11) {
                        var12 = var10_array[var11];
                        stackOut_63_0 = this.field_w[var12.field_p];
                        stackIn_59_0 = stackOut_63_0 ? 1 : 0;
                        stackIn_64_0 = stackOut_63_0;
                        if (!stackIn_64_0) {
                          var8++;
                        }
                        if (!this.field_V[var12.field_p]) {
                          var9Lifetime2++;
                        }
                        var11++;
                      }
                      this.field_t[var7_int] = var8;
                      this.field_r[var7_int] = var9Lifetime2;
                      var5_int++;
                      continue;
                    }
                    break;
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1)) {
                var4_ref_ln__ = var3;
                var5_int = 0;
                while (var4_ref_ln__.length > var5_int) {
                  stackIn_76_0Lifetime1 = var4_ref_ln__[var5_int];
                  var6_ref_lnLifetime1Lifetime1 = stackIn_76_0Lifetime1;
                  this.field_t[var6_ref_lnLifetime1Lifetime1.field_p] = 0;
                  this.field_r[var6_ref_lnLifetime1Lifetime1.field_p] = 0;
                  var5_int++;
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
            }
            if ((decompiledFrameCompleted3) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              stackIn_81_0 = this.field_P.field_o.field_k ? 1 : 0;
            }
            if ((decompiledFrameCompleted3) &&
              (decompiledFrameCompleted0) &&
              (stackIn_81_0 != 0)) {
              break L3;
            }
            var4 = 1;
            while (true) {
              stackIn_85_0 = var4;
              if (stackIn_85_0 == 0) {
                break L3;
              }
              var4 = 0;
              var5 = var3;
              if (var13 != 0) {
                return;
              }
              var6 = 0;
              while (true) {
                stackIn_89_0 = ~var5.length;
                if (stackIn_89_0 < ~var6) {
                  var7_ref = var5[var6];
                  var8Lifetime1 = var7_ref.field_p;
                  stackOut_90_0 = this.field_w[var8Lifetime1];
                  stackIn_85_0Lifetime1 = stackOut_90_0 ? 1 : 0;
                  stackIn_91_0 = stackOut_90_0;
                  if (stackIn_91_0 &&
                    this.field_t[var8Lifetime1] > this.field_p[var8Lifetime1]) {
                    this.field_w[var8Lifetime1] = false;
                    var9Lifetime1 = 1 + this.field_d[var8Lifetime1];
                    var4 = 1;
                    var10_arrayLifetime1 = var7_ref.field_D;
                    var11Lifetime1 = 0;
                    while (var10_arrayLifetime1.length > var11Lifetime1) {
                      var12Lifetime1 = var10_arrayLifetime1[var11Lifetime1];
                      stackIn_117_0 = this.field_P.field_o.field_l;
                      if (!stackIn_117_0) {
                        this.field_t[var12Lifetime1.field_p] = this.field_t[var12Lifetime1.field_p] + 1;
                      } else {
                        this.field_t[var12Lifetime1.field_p] = 1;
                      }
                      if (this.field_d[var12Lifetime1.field_p] > var9Lifetime1 ||
                        this.field_w[var12Lifetime1.field_p]) {
                        this.field_d[var12Lifetime1.field_p] = var9Lifetime1;
                      }
                      var11Lifetime1++;
                    }
                  }
                  stackIn_117_0Lifetime1 = this.field_V[var8Lifetime1];
                  if (stackIn_117_0Lifetime1 &&
                    this.field_r[var8Lifetime1] > this.field_J[var8Lifetime1]) {
                    this.field_V[var8Lifetime1] = false;
                    this.field_J[var8Lifetime1] = 0;
                    var9Lifetime1Lifetime1 = 1 + this.field_U[var8Lifetime1];
                    var4 = 1;
                    var10_arrayLifetime1Lifetime1 = var7_ref.field_D;
                    var11Lifetime1Lifetime1 = 0;
                    while (var11Lifetime1Lifetime1 < var10_arrayLifetime1Lifetime1.length) {
                      var12Lifetime1Lifetime1 = var10_arrayLifetime1Lifetime1[var11Lifetime1Lifetime1];
                      stackOut_123_0 = this.field_P.field_o.field_l;
                      stackIn_89_0 = stackOut_123_0 ? 1 : 0;
                      stackIn_124_0 = stackOut_123_0;
                      if (!stackIn_124_0) {
                        this.field_r[var12Lifetime1Lifetime1.field_p] = this.field_r[var12Lifetime1Lifetime1.field_p] + 1;
                      } else {
                        this.field_r[var12Lifetime1Lifetime1.field_p] = 1;
                      }
                      if (var9Lifetime1Lifetime1 < this.field_U[var12Lifetime1Lifetime1.field_p] ||
                        this.field_V[var12Lifetime1Lifetime1.field_p]) {
                        this.field_U[var12Lifetime1Lifetime1.field_p] = var9Lifetime1Lifetime1;
                      }
                      var11Lifetime1Lifetime1++;
                    }
                  }
                  var6++;
                  continue;
                }
                break;
              }
            }

          }
          this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_144_0 = var3_ref;
          stackIn_144_1 = new StringBuilder().append("km.RA(");
          if (param0 == null) {
            stackIn_145_2 = "null";
          } else {
            stackIn_145_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_144_0), ((StringBuilder) (Object) stackIn_144_1).append(stackIn_145_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, ob param1, int param2) {
        dc stackIn_14_0 = null;
        dc stackIn_19_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa var4 = null;
        RuntimeException var4_ref = null;
        mg var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_P.a(param0, (byte) -127, param1);
          var4 = (qa) (this.field_P.field_q.d(0));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var4))) {
            stackIn_14_0 = this.field_P;
            if (var10 == 0) {
              if (!stackIn_14_0.field_o.field_i) {
                var4.field_u.field_R.field_x = var4.field_u.field_R.field_x - var4.field_v;
              } else {
                var4.field_u.field_y.field_m.field_x = var4.field_u.field_y.field_m.field_x - var4.field_v;
              }
              var4.field_u.field_J = var4.field_u.field_J + var4.field_v;
              var4 = (qa) (this.field_P.field_q.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_14_0 = this.field_P;
          }
          var5 = (mg) (((el) (Object) stackIn_14_0.field_p).a(true));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 == null))) {
            var5.field_y.field_J = var5.field_y.field_J - var5.field_z;
            stackIn_19_0 = this.field_P;
            if (var10 == 0) {
              var5 = (mg) (((el) (Object) stackIn_19_0.field_p).a((byte) -68));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_19_0 = this.field_P;
          }
          var6 = stackIn_19_0.field_g.field_e;
          var7 = 0;
          var8 = -104 % ((param2 + 36) / 56);
          while (var7 < var6.length) {
            var9 = var6[var7];
            fl.a(var9, (byte) 49);
            kr.a((byte) -127, var9);
            var7++;
            if (var10 != 0) {
              return;
            }
          }
          this.a(this.field_n, -94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("km.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(l param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_P.a(92, param0);
          this.field_z.a(param0, 0);
          this.field_p = new int[param0.field_e.length];
          this.field_t = new int[param0.field_e.length];
          if (param1 != 6) {
            return;
          }
          this.field_w = new boolean[param0.field_e.length];
          this.field_d = new int[param0.field_e.length];
          this.field_J = new int[param0.field_e.length];
          this.field_r = new int[param0.field_e.length];
          this.field_V = new boolean[param0.field_e.length];
          this.field_U = new int[param0.field_e.length];
          this.a(this.field_n, -74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("km.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        tr stackIn_6_0 = null;
        pf stackIn_6_1 = null;
        pf stackIn_6_2 = null;
        boolean stackIn_7_3;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -65 / ((param1 - 11) / 62);
          stackIn_6_0 = this.field_z;
          stackIn_6_1 = this.field_P.field_A;
          stackIn_6_2 = this.field_P.field_i;
          stackIn_7_3 = (this.field_j) && (se.field_g);
          ((tr) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_7_3, 12114, param0, this.field_P.field_p);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (je.field_d == 2 &&
            !this.field_y) {
            this.field_Z = param1;
            this.field_y = true;
            this.field_D = param2;
            this.field_T = false;
            return;
          }
          if (param0 != -3587) {
            return;
          }
          if (this.field_y &&
            2 == rf.field_n &&
            (this.field_D - param2) * (this.field_D - param2) + (-param1 + this.field_Z) * (-param1 + this.field_Z) > 25) {
            this.field_T = true;
          }
          if (this.field_y &&
            rf.field_n != 2) {
            this.field_y = false;
            if (!this.field_T) {
              if (this.field_m != 0) {
                qk.a(us.field_d, param0 ^ -3671);
                this.field_Y.a(-76, 0);
                if (var5 == 0) {
                  return;
                }
              }
              if (null != this.field_z.field_p) {
                var4 = (qm) (this.field_P.field_i.d(param0 + 3587));
                while (var4 != null) {
                  if (var5 != 0) {
                    return;
                  }
                  if (var4.field_p == this.field_n && (var4.field_q == this.field_z.field_p ||
                    var4.field_r == this.field_z.field_p)) {
                    var4.field_q = null;
                    var4.field_r = null;
                    if (this.field_f) {
                      this.field_ab.a(var4, 32);
                      this.e(param0 + 3587);
                    }
                    var4.b((byte) -105);
                    this.field_Y.c(var4.field_o, 127);
                  }
                  var4 = (qm) (this.field_P.field_i.a((byte) -71));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref), "km.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, byte param1, fs param2, fs param3, int param4) {
        fs stackIn_4_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        fs var7 = null;
        String[] var8 = null;
        String var9 = null;
        fs var10 = null;
        try {
          var6_int = -91 / ((-70 - param1) / 36);
          if (this.field_f) {
            stackIn_4_0 = this.field_n;
          } else {
            stackIn_4_0 = this.field_P.field_v[0];
          }
          var7 = stackIn_4_0;
          if (var7 != param2) {
            return;
          }
          var8 = ma.field_s[param4];
          if (0 == var8.length) {
            return;
          }
          var9 = var8[vc.a((byte) -39, var8.length)];
          var10 = this.field_P.field_v[this.field_P.field_m[-1 + this.field_P.field_r]];
          var9 = vm.a(var10.field_t, 108, "largestplayer", var9);
          var9 = vm.a(this.field_n.field_t, 124, "you", var9);
          var9 = vm.a(param3.field_t, 121, "me", var9);
          if (this.field_P.field_g.field_e.length <= param0) {
            stackIn_14_0 = "";
          } else {
            stackIn_14_0 = this.field_P.field_g.field_e[param0].field_I;
          }
          var9 = vm.a(stackIn_14_0, 100, "system", var9);
          this.a(param3, var9, (byte) 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("km.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int stackIn_77_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        sl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (66 == ej.field_e) {
            var2_int = sa.field_a.j(-108);
            var3 = sa.field_a.f(param0 - 35735);
            var4 = sa.field_a.a(16711680);
            var5 = sa.field_a.a(param0 ^ 16726439);
            var6 = sa.field_a.j(-75);
            var7_int = sa.field_a.j(param0 ^ -14818);
            var8 = sa.field_a.f(-20976);
            boolean decompiledSharedTail1 = (!(this.field_P.field_O < var2_int) ||
              -1 == this.field_P.field_O);
            if (!decompiledSharedTail1) {
              this.b(false);
              this.a((byte) 96, var4, var3);
              if (~var5 != ~this.field_P.f(-28824)) {
                var9 = js.field_f;
                var9.h(66, param0 ^ 14680);
                var9.field_j = var9.field_j + 2;
                var10 = var9.field_j;
                if (this.field_h >= 0) {
                  this.field_P.a(var9, (byte) 68, this.field_n);
                }
                var9.f(param0 - 549356895, var9.field_j - var10);
                if (!se.field_g) {
                  d.$cfr$intArgs$a$a6964d7afeb1(0, 82);
                  q.g(-112);
                }
                this.field_j = true;
                if (var11 != 0) {
                  this.field_j = false;
                }
              } else {
                this.field_j = false;
              }
              this.field_P.a(var7_int, var6, false);
              this.field_L = false;
              this.field_S = var8;
              this.a(true);
              decompiledSharedTail1 = (var11 != 0);
            }
            if ((decompiledSharedTail1) &&
              (this.field_P.field_O == -1)) {
              this.field_P.d(-9778, var2_int);
              this.a(true, (int[]) null);
              this.field_q = this.field_P.field_O;
            }
            this.field_S = var8;
            return true;
          }
          if (ej.field_e == 69) {
            this.field_N = sa.field_a.j(-78);
            return true;
          }
          if (ej.field_e == 67) {
            this.a(1, sa.field_a, rr.field_t);
            return true;
          }
          if (70 == ej.field_e) {
            this.b(rr.field_t, sa.field_a, -123);
            return true;
          }
          if (68 == ej.field_e) {
            this.a(sa.field_a, rr.field_t, -80);
            return true;
          }
          if (ej.field_e == 62) {
            this.field_P.field_y = sa.field_a.j(param0 ^ -14832);
            if (this == ce.field_x) {
              ri.k(8);
            }
            return true;
          }
          if (ej.field_e == 64) {
            this.field_P.field_e = sa.field_a.j(param0 ^ -14814);
            if (this == ce.field_x) {
              wp.a(-2);
            }
            return true;
          }
          if (ej.field_e == 63) {
            this.field_P.field_f = sa.field_a.j(-119);
            this.field_P.field_w = this.field_P.field_w | this.field_P.field_f;
            var2_intLifetime1 = 0;
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (!(this.field_P.field_r > var2_intLifetime1)))) {
              stackIn_77_0 = this.field_P.field_f & 1 << var2_intLifetime1;
              if (var11 == 0) {
                if (stackIn_77_0 != 0) {
                  this.field_P.a(this.field_P.field_v[var2_intLifetime1], (byte) -123);
                }
                var2_intLifetime1++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_77_0 = 1;
            }
            return stackIn_77_0 != 0;
          }
          if (ej.field_e == 65) {
            this.field_i = sa.field_a.j(-57);
            return true;
          }
          if (61 == ej.field_e) {
            var2_intLifetime2 = sa.field_a.g(-2852);
            this.field_P.a(var2_intLifetime2, 3);
            ta.a(0, -1, (byte) 96, false);
            this.field_b = false;
            this.field_Y.o(-4956);
            boolean decompiledSharedTail0 = ((this.field_n == null ||
              (this.field_P.field_w & 1 << this.field_h) == 0) &&
              !(this.field_P.field_x.a((byte) 123, this.field_n)));
            if (!decompiledSharedTail0) {
              jo.a(param0 ^ 18008, wh.field_b, false, 10);
              decompiledSharedTail0 = (var11 != 0);
            }
            if ((decompiledSharedTail0) &&
              (this.field_P.field_z)) {
              jo.a(32767, hj.field_n, false, 10);
            }
            if (sm.field_e &&
              (1 << this.field_h & this.field_P.field_e) == 0) {
              this.b(-116);
            }
            return true;
          }
          if (param0 != 14759) {
            return true;
          }
          if (ej.field_e == 72) {
            this.i(-126);
            return true;
          }
          if (ej.field_e == 73) {
            var2_intLifetime3 = sa.field_a.j(-95);
            var3Lifetime1 = sa.field_a.j(-112);
            var4Lifetime1 = sa.field_a.j(param0 ^ -14805);
            this.a(var4Lifetime1, (byte) 4, this.field_n, this.field_P.field_v[var2_intLifetime3], var3Lifetime1);
            return true;
          }
          if (ej.field_e == 74 &&
            se.field_g) {
            var2_intLifetime4 = rr.field_t / 4;
            var3Lifetime2 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var2_intLifetime4 <= var3Lifetime2))) {
              var4Lifetime2 = sa.field_a.j(-128);
              var5Lifetime1 = sa.field_a.j(-126);
              stackIn_128_0 = sa.field_a.f(param0 ^ -26697);
              if (var11 == 0) {
                var6Lifetime1 = stackIn_128_0;
                var7 = "My personality type is " + wk.field_a[var5Lifetime1] + " and my rating is " + var6Lifetime1;
                this.a(this.field_P.field_v[var4Lifetime2], var7, (byte) 51);
                var3Lifetime2++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_128_0 = 1;
            }
            return stackIn_128_0 != 0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.M(" + param0 + ')');
        }
    }

    private final void a(int param0, ln param1, ln param2, int param3) {
        RuntimeException runtimeException = null;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = (qm) (this.field_P.field_i.d(0));
          L1: while (true) {
            if (var5 != null) {
              stackIn_16_0 = ~param3;
              stackIn_16_1 = ~var5.field_o;
              if (var7 != 0) {
                break L1;
              }
              if (stackIn_16_0 == stackIn_16_1) {
                var5.field_r = param1;
                var5.field_q = param2;
              } else {
                var5 = (qm) (this.field_P.field_i.a((byte) -71));
                continue;
              }
            }
            if (var5 == null) {
              var5 = new qm(param3, this.field_n, param2, param1);
            }
            stackIn_16_0 = 86;
            stackIn_16_1 = (param0 - 6) / 34;
            break;
          }
          var6 = stackIn_16_0 % stackIn_16_1;
          this.field_P.field_i.a((byte) -113, var5);
          if (this.field_f) {
            this.field_ab.a(var5, 32);
            this.e(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_24_0 = runtimeException;
          stackIn_24_1 = new StringBuilder().append("km.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        boolean stackIn_4_0 = false;
        ln stackIn_22_0 = null;
        Object stackIn_74_0 = null;
        boolean stackIn_78_0 = false;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        ln stackOut_21_0;
        boolean stackOut_77_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        mg var7_ref_mg = null;
        eg var7_ref_eg = null;
        nr var7_ref_nr = null;
        qi var7_ref_qi = null;
        qm var7_ref_qm = null;
        hj var7_ref_hj = null;
        int var7 = 0;
        ne var8 = null;
        int var8_int = 0;
        fs[] var8_array = null;
        mg var9 = null;
        as var10 = null;
        int var11 = 0;
        Object stackIn_74_0Lifetime1;
        int stackIn_98_0Lifetime1;
        int stackIn_98_1Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_Q = new k();
          this.field_z.b(false);
          var3 = this.c((byte) 44);
          this.field_P.a(param0, 1, this.field_Q, (se) null);
          this.field_z.a(0);
          var4 = this.field_Q.field_a.d(0);
          var5 = 0;
          var6 = new StringBuilder();
          L2: while (true) {
            if (null != var4) {
              stackOut_3_0 = var4 instanceof mg;
              stackIn_94_0 = stackOut_3_0 ? 1 : 0;
              stackIn_4_0 = stackOut_3_0;
              if (var11 == 0) {
                if (stackIn_4_0) {
                  var7_ref_mg = (mg) (var4);
                  if (var7_ref_mg.field_G == null) {
                    var5 = 1;
                    discarded$0 = var6.append("Fleet from " + var7_ref_mg.field_y.field_I + " to " + var7_ref_mg.field_B.field_I + " has no owner.\n");
                  } else {
                    this.field_z.field_c.a((byte) -113, qn.a(-121, var7_ref_mg));
                    if (var7_ref_mg.field_z > this.field_z.field_y) {
                      this.field_z.field_y = var7_ref_mg.field_z;
                    }
                  }
                } else if (var4 instanceof eg) {
                  var7_ref_eg = (eg) (var4);
                  this.field_z.field_m.a((byte) -113, new vn(var7_ref_eg));
                  var8 = (ne) (var7_ref_eg.field_v.d(0));
                  while (var8 != null) {
                    stackOut_21_0 = var8.field_k;
                    stackIn_74_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (stackIn_22_0 != null &&
                      var8.field_r != 0 &&
                      var8.field_h == var8.field_k.field_y) {
                      var9 = new mg(var7_ref_eg.field_p, var8.field_k, var8.field_h, var8.field_r);
                      var10 = bb.a(-2, var9);
                      this.field_z.field_v.a((byte) -113, var10);
                      if (var10.field_x > this.field_z.field_y) {
                        this.field_z.field_y = var10.field_x;
                      }
                    }
                    var8 = (ne) (var7_ref_eg.field_v.a((byte) -71));
                  }
                } else if (!(var4 instanceof qm)) {
                  if (!(var4 instanceof qi)) {
                    if (var4 instanceof nr) {
                      var7_ref_nr = (nr) (var4);
                      if (null != var7_ref_nr.field_j) {
                        var8_int = 0;
                        while (!(var7_ref_nr.field_j.length <= var8_int)) {
                          var9 = new mg(var7_ref_nr.field_p, var7_ref_nr.field_j[var8_int], var7_ref_nr.field_p.field_t, var7_ref_nr.field_i[var8_int]);
                          this.field_z.field_hb.a((byte) -113, sg.a((byte) 101, var9));
                          stackIn_98_0 = var9.field_z;
                          stackIn_98_1 = this.field_z.field_y;
                          if (stackIn_98_0 > stackIn_98_1) {
                            this.field_z.field_y = var9.field_z;
                          }
                          var8_int++;
                        }
                      }
                      this.field_z.field_P[var7_ref_nr.field_p.field_p] = true;
                    }
                  } else {
                    var7_ref_qi = (qi) (var4);
                    this.field_z.a(var7_ref_qi.field_l, -123, 2, var7_ref_qi.field_k);
                  }
                } else {
                  var7_ref_qm = (qm) (var4);
                  if (0 != var7_ref_qm.field_o) {
                    if (var7_ref_qm.field_o != 1) {
                      if (var7_ref_qm.field_o == 3) {
                        this.field_z.a(var7_ref_qm.field_p, var7_ref_qm.field_r, (byte) -128, var7_ref_qm.field_q);
                      }
                    } else {
                      this.field_z.a(var7_ref_qm.field_q, -117, 1, var7_ref_qm.field_p);
                    }
                  } else {
                    this.field_z.a(var7_ref_qm.field_q, -124, 0, var7_ref_qm.field_p);
                  }
                  if (this.field_n != var7_ref_qm.field_p) {
                  }
                }
                stackIn_74_0Lifetime1 = this.field_Q.field_a.a((byte) -71);
                var4 = stackIn_74_0Lifetime1;
                continue;
              }
            } else {
              var4 = this.field_Q.field_a.d(0);
              while (var4 != null) {
                stackOut_77_0 = var4 instanceof hj;
                stackIn_94_0 = stackOut_77_0 ? 1 : 0;
                stackIn_78_0 = stackOut_77_0;
                if (var11 != 0) {
                  break L2;
                }
                if (stackIn_78_0) {
                  var7_ref_hj = (hj) (var4);
                  if (var7_ref_hj.field_j == null) {
                    var5 = 1;
                    discarded$1 = var6.append("Construction event at " + var7_ref_hj.field_i.field_I + " has no owner.\n");
                  } else {
                    if (var7_ref_hj.field_j != this.field_n) {
                      this.field_z.a(var7_ref_hj.field_j, var7_ref_hj.field_i, false, var7_ref_hj.field_h);
                      if (this.field_z.field_u < var7_ref_hj.field_h) {
                        this.field_z.field_u = var7_ref_hj.field_h;
                      }
                    }
                  }
                }
                var4 = this.field_Q.field_a.a((byte) -71);
              }
              this.field_z.field_C = true;
              this.field_P.g(-7954);
              this.a(true, var3);
              stackIn_94_0 = var5;
            }
            break;
          }
          if (stackIn_94_0 != 0) {
            jq.a(-29901, (Throwable) null, var6.toString());
            q.g(-118);
          }
          stackIn_98_0Lifetime1 = -13;
          stackIn_98_1Lifetime1 = (param1 - 35) / 40;
          var7 = stackIn_98_0Lifetime1 % stackIn_98_1Lifetime1;
          if (this.field_W &&
            (this.field_P.field_w & 1) != 0) {
            fl.a(0, "losegame");
          }
          if (this.field_W) {
            var8_array = this.field_P.field_x.a((byte) -23);
            if (var8_array != null &&
              this.field_n == var8_array[0]) {
              fl.a(0, "wingame");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -7970) {
            return;
          }
          if (!this.field_f) {
            throw new IllegalStateException();
          }
          js.field_f.h(64, param0 ^ -8159);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.H(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var10Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 0;
          boolean decompiledSharedTail1 = !(this.field_Y.a(true, (byte) 63));
          if (!decompiledSharedTail1) {
            this.field_T = true;
            var2_int = 1;
            this.field_y = false;
            this.field_z.field_nb[1] = -1;
            this.field_z.field_nb[0] = -1;
            this.field_z.field_p = null;
            this.field_z.field_S = null;
            decompiledSharedTail1 = (var11 != 0);
          }
          if (decompiledSharedTail1) {
            if (je.field_d == 1) {
              this.a(td.field_P, (byte) -103, nh.field_p);
            }
            this.a(-3587, pd.field_k, bb.field_b);
            this.field_z.a(this.field_m, 0, pd.field_k, bb.field_b);
          }
          var3 = this.field_z.field_k;
          var4 = this.field_z.field_E;
          if (di.field_p[96]) {
            var3 = var3 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
            if (0.0f > var3) {
              var3 = 0.0f;
            }
          }
          if (param0 != 50) {
            this.d(88);
          }
          var5 = this.field_z.field_I;
          if (di.field_p[97]) {
            var3 = var3 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
            if ((float)(this.field_P.field_g.field_k + 0) < var3) {
              var3 = (float)(0 + this.field_P.field_g.field_k);
            }
          }
          if (di.field_p[98]) {
            var4 = var4 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
            if (var4 < 0.0f) {
              var4 = 0.0f;
            }
          }
          if (di.field_p[99]) {
            var4 = var4 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
            if ((float)(0 + this.field_P.field_g.field_b) < var4) {
              var4 = (float)(this.field_P.field_g.field_b + 0);
            }
          }
          if (di.field_p[27] ||
            di.field_p[87]) {
            var5 = var5 / 1.100000023841858f;
            if (this.field_z.field_g > var5) {
              var5 = this.field_z.field_g;
            }
          }
          if (di.field_p[26] ||
            di.field_p[88]) {
            var5 = var5 * 1.100000023841858f;
            if (this.field_z.field_F < var5) {
              var5 = this.field_z.field_F;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (var2_int != 0 ||
            (2 & rf.field_n) == 0) {
            this.field_G = false;
            decompiledFrameRemainder1 = (var11 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_G) {
              var6 = -this.field_z.field_db + pd.field_k;
              var7 = -this.field_z.field_e + bb.field_b;
              var3 = var3 - this.field_z.field_I * (float)var6 / 300.0f;
              if (0.0f > var3) {
                var3 = 0.0f;
              }
              var4 = var4 - (float)var7 * this.field_z.field_I / 300.0f;
              if (var3 > (float)(this.field_P.field_g.field_k + 0)) {
                var3 = (float)(this.field_P.field_g.field_k - 0);
              }
              if (var4 < 0.0f) {
                var4 = 0.0f;
              }
              if (var4 > (float)(this.field_P.field_g.field_b + 0)) {
                var4 = (float)(this.field_P.field_g.field_b - 0);
              }
            }
            this.field_z.field_e = bb.field_b;
            this.field_G = true;
            this.field_z.field_db = pd.field_k;
          }
          if (var2_int == 0 &&
            so.field_o != 0) {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            var6Lifetime1 = 320;
            var7Lifetime1 = this.field_Y.d((byte) 14) / 2;
            var8 = var3 + (float)(pd.field_k - var6Lifetime1) * this.field_z.field_I / 300.0f;
            var9 = (float)(bb.field_b - var7Lifetime1) * this.field_z.field_I / 300.0f + var4;
            if (0 >= so.field_o) {
              var10 = 2 * so.field_o;
              while (var10 < 0) {
                var5 = var5 / 1.100000023841858f;
                var10++;
                if (var11 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameRemainder0 = !(!(this.field_z.field_g > var5)))) {
                var5 = this.field_z.field_g;
                decompiledFrameRemainder0 = (var11 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              var10Lifetime1 = 0;
              while ((so.field_o * 2) > var10Lifetime1) {
                var5 = var5 * 1.100000023841858f;
                var10Lifetime1++;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var5 > this.field_z.field_F)) {
                var5 = this.field_z.field_F;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              var3 = var8 - var5 * (float)(-var6Lifetime1 + pd.field_k) / 300.0f;
              var4 = var9 - var5 * (float)(bb.field_b - var7Lifetime1) / 300.0f;
            }
            if (0.0f > var3) {
              var3 = 0.0f;
            }
            if (0.0f > var4) {
              var4 = 0.0f;
            }
            if ((float)(0 + this.field_P.field_g.field_k) < var3) {
              var3 = (float)(this.field_P.field_g.field_k - 0);
            }
            if (var4 > (float)(this.field_P.field_g.field_b + 0)) {
              var4 = (float)(this.field_P.field_g.field_b - 0);
            }
          }
          if (this.field_z.field_k != var3 ||
            this.field_z.field_E != var4 ||
            this.field_z.field_I != var5) {
            this.field_z.field_I = var5;
            this.field_z.field_x = false;
            this.field_z.field_fb = null;
            this.field_z.field_E = var4;
            this.field_z.field_k = var3;
            this.field_z.a(false);
          }
          boolean decompiledSharedTail0 = (rf.field_n != 0);
          if (!decompiledSharedTail0) {
            this.field_I = this.field_F;
            this.field_O = 0;
            decompiledSharedTail0 = (var11 != 0);
          }
          if ((decompiledSharedTail0) &&
            (this.field_z.field_S != null)) {
            discarded$0 = this.a((byte) 121, this.field_z.field_S);
          }
          this.field_z.c(pd.field_k, bb.field_b, param0 ^ 69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.W(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, ln param2, ln param3) {
        ln stackIn_18_0 = null;
        ln stackIn_18_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = (mg) (param3.field_T.d(0));
          L1: while (true) {
            if (null != var5) {
              stackIn_18_0 = (ln) (param2);
              stackIn_18_1 = var5.field_B;
              if (var6 != 0) {
                break L1;
              }
              if (stackIn_18_0 != stackIn_18_1 ||
                var5.field_G != this.field_n) {
                var5 = (mg) (param3.field_T.a((byte) -71));
                continue;
              }
            }
            if (param0) {
              return;
            }
            if (null == var5) {
              var5 = new mg(param3, param2, param1);
              param3.field_T.a((byte) -113, var5);
              param2.field_s.a(var5, 32);
              this.field_P.field_p.a((byte) 62, var5);
              if (var6 != 0) {
                var5.field_z = var5.field_z + param1;
              }
            } else {
              var5.field_z = var5.field_z + param1;
            }
            stackIn_18_0 = (ln) (param3);
            stackIn_18_1 = (ln) (param3);
            break;
          }
          stackIn_18_0.field_J = stackIn_18_1.field_J - param1;
          this.field_C[param3.field_p] = this.field_C[param3.field_p] - param1;
          kr.a((byte) 83, param3);
          fl.a(param2, (byte) 75);
          this.a(this.field_n, -95);
          if (this.field_f) {
            this.field_v.a((byte) 9, var5);
            this.e(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("km.U(").append(param0).append(',').append(param1).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = js.field_f;
          var2.h(59, 255);
          if (param0 >= -75) {
            return;
          }
          var2.field_j = var2.field_j + 2;
          var3 = var2.field_j;
          var2.c(this.field_P.field_O, (byte) -109);
          se.a(tr.a((byte) 81, this.field_o), -256, tr.a((byte) 93, this.field_ab), rp.a(-125, this.field_v), var2);
          this.field_ab.b((byte) 35);
          this.field_o.b((byte) 87);
          this.field_v.a((byte) 112);
          var2.f(-549342136, -var3 + var2.field_j);
          this.field_g = -1;
          this.field_k = -1;
          if (sm.field_e) {
            this.m(126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.VA(" + param0 + ')');
        }
    }

    private final void a(mg param0, int param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          param0.field_y.field_J = param0.field_y.field_J - param1;
          this.field_C[param0.field_y.field_p] = this.field_C[param0.field_y.field_p] - param1;
          param0.field_z = param0.field_z + param1;
          if (param2 != 10755) {
            this.a(101);
          }
          if (param0.field_z < 0) {
            throw new RuntimeException();
          }
          if (0 == param0.field_z) {
            param0.b((byte) -106);
            param0.a(16);
            param0.d(true);
          }
          this.a(this.field_n, -117);
          if (this.field_f) {
            this.field_v.a((byte) 9, param0);
            this.e(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("km.IA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 54) {
            this.field_c = (sd) null;
          }
          var2_int = 0;
          if (di.field_p[81]) {
            var2_int = 81;
          }
          if (di.field_p[86]) {
            if (0 != var2_int) {
              stackIn_14_0 = 0;
              return stackIn_14_0;
            }
            var2_int = 86;
          }
          if (di.field_p[82]) {
            if (var2_int != 0) {
              stackIn_21_0 = 0;
              return stackIn_21_0;
            }
            var2_int = 82;
          }
          stackIn_24_0 = var2_int;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.PA(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_f) {
            throw new IllegalStateException();
          }
          this.field_P.field_e = this.field_P.field_e | 1 << this.field_h;
          var2_int = 9 / ((-64 - param0) / 51);
          js.field_f.h(65, 255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.C(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, mg param1) {
        int fieldTemp$0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var3_intLifetime2;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 <= 95) {
            return false;
          }
          if (param1.field_G != this.field_n) {
            return false;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_O > 0) {
            this.field_O = this.field_O - 1;
            decompiledFrameRemainder1 = (var7 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (rf.field_n == 1 &&
              param1 != this.field_z.field_rb) {
              this.field_z.b((byte) -127);
            }
            boolean decompiledFrameRemainder0 = true;
            if (rf.field_n != 1 ||
              !this.field_z.field_Ab) {
              if (rf.field_n == 1 &&
                this.field_z.field_Gb) {
                var3_int = -1;
                var4 = this.a((byte) 55);
                if (var4 != 82) {
                  if (var4 == 86) {
                    if (this.field_z.field_S.field_z < 5) {
                      stackIn_42_0 = this.field_z.field_S.field_z;
                    } else {
                      stackIn_42_0 = 5;
                    }
                    var3_int = -stackIn_42_0;
                    if (var7 != 0) {
                      var3_int = -this.field_z.field_S.field_z;
                    }
                  }
                } else {
                  var3_int = -this.field_z.field_S.field_z;
                }
                this.a(this.field_z.field_S, var3_int, 10755);
                if (this.field_z.field_S.field_z == 0) {
                  this.field_z.field_nb[1] = -1;
                  this.field_z.field_nb[0] = -1;
                  this.field_z.field_S = null;
                  this.field_z.b((byte) -51);
                }
                decompiledFrameRemainder0 = (var7 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (rf.field_n == 1)) &&
                (decompiledFrameRemainder0 = !(!this.field_z.field_Bb))) {
                var3_intLifetime2 = -param1.field_z;
                this.a(this.field_z.field_S, var3_intLifetime2, 10755);
                this.field_z.field_nb[1] = -1;
                this.field_z.field_S = null;
                this.field_z.field_nb[0] = -1;
                this.field_z.b((byte) -74);
                decompiledFrameRemainder0 = (var7 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var3_intLifetime1 = 1;
              var4Lifetime1 = this.a((byte) 57);
              var5 = this.field_z.field_S.field_y;
              if (82 != var4Lifetime1) {
                if (var4Lifetime1 == 86) {
                  var3_intLifetime1 = 5;
                  if (var7 != 0) {
                    if (var5.field_N < var5.field_J) {
                      stackIn_70_0 = var5.field_J - var5.field_N;
                    } else {
                      stackIn_70_0 = var5.field_J;
                    }
                    var3_intLifetime1 = stackIn_70_0;
                  }
                }
              } else {
                if (var5.field_N < var5.field_J) {
                  stackIn_70_0 = var5.field_J - var5.field_N;
                } else {
                  stackIn_70_0 = var5.field_J;
                }
                var3_intLifetime1 = stackIn_70_0;
              }
              if (!this.field_P.field_o.field_e) {
                stackIn_75_0 = var5.field_N;
              } else {
                stackIn_75_0 = 0;
              }
              var6 = stackIn_75_0;
              if ((var5.field_J - var6) < var3_intLifetime1) {
                var3_intLifetime1 = var5.field_J - var6;
              }
              if (var3_intLifetime1 <= 0) {
                qk.a(jj.field_l, 47);
                if (var7 != 0) {
                  this.a(this.field_z.field_S, var3_intLifetime1, 10755);
                }
              } else {
                this.a(this.field_z.field_S, var3_intLifetime1, 10755);
              }
            }
            fieldTemp$0 = this.field_I - 5;
            this.field_I = this.field_I - 5;
            if (0 > fieldTemp$0) {
              this.field_I = 0;
            }
            this.field_O = this.field_I;
            this.a(2);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_92_0 = var3;
          stackIn_92_1 = new StringBuilder().append("km.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    final void a(int param0) {
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_R.length < this.field_P.field_g.field_e.length) {
            this.field_R = new fs[this.field_P.field_g.field_e.length];
            this.field_C = new int[this.field_P.field_g.field_e.length];
            this.field_l = new sd[this.field_P.field_g.field_e.length];
          }
          var2 = this.field_P.field_g.field_e;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= var2.length))) {
            var4 = var2[var3];
            var5 = var4.field_p;
            this.field_R[var5] = var4.field_y;
            if (var6 == 0) {
              stackIn_13_0 = this.field_C;
              stackIn_13_1 = var5;
              if (var4.field_y != this.field_n) {
                stackIn_14_2 = var4.field_x;
              } else {
                stackIn_14_2 = var4.field_J;
              }
              stackIn_13_0[stackIn_13_1] = stackIn_14_2;
              this.field_l[var5] = var4.field_R;
              var3++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 != 2)) {
            this.field_l = (sd[]) null;
          }
          this.field_z.a(this.field_C, true, this.field_l, this.field_R, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.A(" + param0 + ')');
        }
    }

    final void m(int param0) {
        sl var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 < 122) {
            this.a((fs) null, -117);
          }
          if (this.field_f) {
            if (-1 != this.field_k) {
              this.l(-113);
            }
            var2 = js.field_f;
            var2.h(61, 255);
            var2.c(this.field_P.field_O, (byte) -93);
            var2.e(11135, this.f(-41));
            this.field_L = true;
            if (this.field_N > 1) {
              this.field_N = this.field_N - 1;
            }
            if (!ShatteredPlansClient.field_F) {
              return;
            }
          }
          this.d((byte) -81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.QA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (!this.field_L) {
            throw new RuntimeException();
          }
          var3 = 82 / ((param0 - 61) / 51);
          var2 = js.field_f;
          var2.h(62, 255);
          var2.c(this.field_P.field_O, (byte) -126);
          this.field_L = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.N(" + param0 + ')');
        }
    }

    private final void a(fs param0, fs param1, boolean param2) {
        String var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (this.field_n != param0) {
            if (param1 == this.field_n) {
              var4 = re.a(wf.field_h, 4371, new String[]{param0.field_t});
              this.field_H.a(new n(param0, (fs) null, var4), 0);
              if (ShatteredPlansClient.field_F) {
                var4 = re.a(ud.field_b, 4371, new String[]{param1.field_t});
                this.field_H.a(new n(param1, (fs) null, var4), 0);
              }
            }
          } else {
            var4 = re.a(ud.field_b, 4371, new String[]{param1.field_t});
            this.field_H.a(new n(param1, (fs) null, var4), 0);
          }
          if (null != this.field_s[param1.field_x]) {
            this.field_s[param1.field_x].a(param0, 7686);
          }
          if (!param2) {
            this.a(true, 25, (ln) null, (ln) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("km.P(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_L) {
            this.k(-92);
          }
          if (param0 == ~this.field_g) {
            this.field_g = 250;
          }
          this.field_k = 25;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_P.c(0);
          this.field_P.b(param2, 0);
          if (param0 <= 89) {
            this.field_n = (fs) null;
          }
          this.b(param1, 123);
          this.field_z.field_d = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "km.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        dc stackIn_13_0 = null;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        qm var3 = null;
        int var4 = 0;
        qa var5 = null;
        mg var6 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = 406213746;
          var4 = -1 % ((param0 - 29) / 63);
          var3 = (qm) (this.field_P.field_i.d(0));
          while (var3 != null) {
            stackIn_6_0 = var2_int;
            stackIn_6_1 = 17 * var3.field_q.field_p + var3.field_o;
            if (var3.field_r != null) {
              stackIn_7_2 = var3.field_r.field_p + 7;
            } else {
              stackIn_7_2 = 5;
            }
            var2_int = stackIn_6_0 + stackIn_6_1 * stackIn_7_2;
            var3 = (qm) (this.field_P.field_i.a((byte) -71));
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var5 = (qa) (this.field_P.field_q.d(0));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var5))) {
            var2_int = var2_int + (var5.field_u.field_p * (var5.field_v ^ 11) << 11);
            stackIn_13_0 = this.field_P;
            if (var7 == 0) {
              var5 = (qa) (((pf) (Object) stackIn_13_0.field_q).a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_13_0 = this.field_P;
          }
          var6 = (mg) (((el) (Object) stackIn_13_0.field_p).a(true));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 == null))) {
            stackIn_18_0 = var2_int + ((1 + var6.field_y.field_p) * (1 + (var6.field_B.field_p + 65536)) + var6.field_z * ((1 + var6.field_B.field_p) * (1 + var6.field_y.field_p)));
            if (var7 == 0) {
              var2_int = stackIn_18_0;
              var6 = (mg) (this.field_P.field_p.a((byte) -68));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = var2_int;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.AA(" + param0 + ')');
        }
    }

    private final void a(ob param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fs var8_ref_fs = null;
        int var8 = 0;
        fs var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = 30 % ((-1 - param2) / 62);
          L0: while (true) {
            stackIn_3_0 = -1;
            stackIn_3_1 = ~param1;
            if (stackIn_3_0 > stackIn_3_1) {
              var5 = param0.j(-82);
              param1--;
              if (var10 != 0) {
                return;
              }
              if (var5 != 0) {
                if (var5 == 1) {
                  var6 = param0.j(-96);
                  var7 = param0.j(-120);
                  var8_ref_fs = this.field_P.field_v[var6];
                  var9 = this.field_P.field_v[var7];
                  var8_ref_fs.field_f[var7] = 3;
                  var8_ref_fs.field_h[var7] = true;
                  var9.field_f[var6] = 3;
                  var9.field_h[var6] = true;
                  var8_ref_fs.field_A = var8_ref_fs.field_A & ~(1 << var7);
                  var8_ref_fs.field_w = var8_ref_fs.field_w & ~(1 << var7);
                  var9.field_A = var9.field_A & ~(1 << var6);
                  var9.field_w = var9.field_w & ~(1 << var6);
                  this.a(var8_ref_fs, -27584, var9);
                  param1 -= 3;
                }
              } else {
                var6 = param0.j(-108);
                var7 = ~this.field_n.field_A & var6;
                this.field_n.field_A = var6;
                param1--;
                if (var7 != 0) {
                  var8 = 0;
                  while (!(var8 >= this.field_P.field_r)) {
                    stackIn_3_0 = 0;
                    stackIn_3_1 = var7 & 1 << var8;
                    if (stackIn_3_0 != stackIn_3_1) {
                      this.a(this.field_P.field_v[var8], this.field_n, true);
                    }
                    var8++;
                  }
                }
              }
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("km.K(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, ln param1, int param2) {
        RuntimeException runtimeException = null;
        qm var4 = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = (qm) (this.field_P.field_i.d(param2 + param2));
          L1: while (true) {
            if (null != var4) {
              stackIn_14_0 = param0;
              if (var5 != 0) {
                break L1;
              }
              if (stackIn_14_0 == var4.field_o) {
                var4.field_q = param1;
              } else {
                var4 = (qm) (this.field_P.field_i.a((byte) -71));
                continue;
              }
            }
            if (null == var4) {
              var4 = new qm(param0, this.field_n, param1);
            }
            this.field_P.field_i.a((byte) -113, var4);
            stackIn_14_0 = this.field_f ? 1 : 0;
            break;
          }
          if (stackIn_14_0 != 0) {
            this.field_ab.a(var4, 32);
            this.e(param2 ^ 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_21_0 = runtimeException;
          stackIn_21_1 = new StringBuilder().append("km.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0, int[] param1) {
        boolean stackIn_27_0 = false;
        Object stackIn_49_0 = null;
        boolean stackIn_51_0 = false;
        fs stackIn_93_0 = null;
        eg stackIn_108_0 = null;
        Object stackIn_116_0 = null;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        String stackIn_163_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_26_0;
        boolean stackOut_50_0;
        eg stackOut_107_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ln[] var11_ref_ln__ = null;
        fs[] var11_ref_fs__ = null;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        hj var12_ref_hj = null;
        eg var12_ref_eg = null;
        qi var12_ref_qi = null;
        qm var12_ref_qm = null;
        mg var12_ref_mg = null;
        ln var13 = null;
        fs var13_ref = null;
        int var13_int = 0;
        fs[] var13_array = null;
        ne var13_ref2 = null;
        um var13_ref3 = null;
        int var14_int = 0;
        um var14 = null;
        int var15_int = 0;
        sd var15 = null;
        fs var15_ref = null;
        int var16 = 0;
        Object stackIn_49_0Lifetime1;
        fs var13_refLifetime1;
        int var12Lifetime1;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param0) {
            this.field_R = (fs[]) null;
          }
          var3 = new int[this.field_P.field_r];
          var4 = new int[this.field_P.field_r];
          var5 = new int[this.field_P.field_r];
          var6 = new int[this.field_P.field_r];
          var7 = new int[this.field_P.field_r];
          var8 = new int[this.field_P.field_r];
          var9 = new int[this.field_P.field_r];
          var10 = new int[this.field_P.field_r];
          var11_ref_ln__ = this.field_P.field_g.field_e;
          var12 = 0;
          L2: while (true) {
            if (var12 < var11_ref_ln__.length) {
              var13 = var11_ref_ln__[var12];
              if (var16 == 0) {
                if (null != var13.field_y) {
                  var14_int = var13.field_y.field_x;
                  var6[var14_int] = var6[var14_int] + 1;
                  var3[var14_int] = var3[var14_int] + var13.field_x;
                  if (!(var13.field_G[0] < 0)) {
                    var15_int = 0;
                    while (4 > var15_int) {
                      var5[var14_int] = var5[var14_int] + var13.field_G[var15_int];
                      var15_int++;
                    }
                  }
                }
                var12++;
                continue;
              }
            } else {
              var11_ref_fs__ = this.field_P.field_v;
              var12 = 0;
              while (var11_ref_fs__.length > var12) {
                var13_ref = var11_ref_fs__[var12];
                var14_int = var13_ref.field_x;
                stackOut_26_0 = this.field_P.field_o.field_i;
                stackIn_128_0 = stackOut_26_0 ? 1 : 0;
                stackIn_27_0 = stackOut_26_0;
                if (var16 != 0) {
                  break L2;
                }
                if (!stackIn_27_0) {
                  var15 = (sd) (var13_ref.field_i.d(0));
                  while (var15 != null) {
                    var4[var14_int] = var4[var14_int] + var15.field_r;
                    var15 = (sd) (var13_ref.field_i.a((byte) -71));
                  }
                } else {
                  if (null != var13_ref.field_m) {
                    var4[var14_int] = var13_ref.field_m.field_r;
                  }
                }
                var12++;
              }
              if (this.field_Q != null) {
                var11_ref_oh = this.field_Q.field_a.d(0);
                while (true) {
                  stackIn_49_0 = null;
                  if (stackIn_49_0 == var11_ref_oh) {
                    break;
                  }
                  stackOut_50_0 = var11_ref_oh instanceof hj;
                  stackIn_128_0 = stackOut_50_0 ? 1 : 0;
                  stackIn_51_0 = stackOut_50_0;
                  if (var16 != 0) {
                    break L2;
                  }
                  if (stackIn_51_0) {
                    var12_ref_hj = (hj) (var11_ref_oh);
                    if (var12_ref_hj.field_j != null) {
                      var7[var12_ref_hj.field_j.field_x] = var7[var12_ref_hj.field_j.field_x] + var12_ref_hj.field_h;
                    }
                  }
                  if (var11_ref_oh instanceof eg) {
                    var12_ref_eg = (eg) (var11_ref_oh);
                    var13_int = 0;
                    while (true) {
                      if (this.field_P.field_r > var13_int) {
                        var8[var13_int] = var8[var13_int] + var12_ref_eg.field_k[var13_int];
                        var13_int++;
                        continue;
                      }
                      break;
                    }
                    if (var12_ref_eg.field_i == var12_ref_eg.field_w) {
                      if (null != var12_ref_eg.field_i) {
                        var12_ref_eg.field_i.field_q.field_y = var12_ref_eg.field_i.field_q.field_y + 1;
                      }
                      var13_array = var12_ref_eg.field_h;
                      var14_int = 0;
                      while (var14_int < var13_array.length) {
                        var15_ref = var13_array[var14_int];
                        stackIn_93_0 = var15_ref;
                        if (stackIn_93_0 != null &&
                          var15_ref != var12_ref_eg.field_w) {
                          var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        }
                        var14_int++;
                      }
                    } else {
                      if (null != var12_ref_eg.field_w) {
                        var12_ref_eg.field_w.field_q.field_a = var12_ref_eg.field_w.field_q.field_a + 1;
                      }
                      if (null != var12_ref_eg.field_i) {
                        var12_ref_eg.field_i.field_q.field_m = var12_ref_eg.field_i.field_q.field_m + 1;
                      }
                      var13_array = var12_ref_eg.field_h;
                      var14_int = 0;
                      while (var13_array.length > var14_int) {
                        stackIn_93_0 = var13_array[var14_int];
                        var15_ref = stackIn_93_0;
                        stackIn_49_0Lifetime1 = null;
                        if (stackIn_49_0Lifetime1 != var15_ref &&
                          var12_ref_eg.field_w != var15_ref &&
                          var12_ref_eg.field_i != var15_ref) {
                          var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        }
                        var14_int++;
                      }
                    }
                    var13_ref2 = (ne) (var12_ref_eg.field_v.d(0));
                    while (var13_ref2 != null) {
                      stackOut_107_0 = var12_ref_eg;
                      stackIn_116_0 = stackOut_107_0;
                      stackIn_108_0 = stackOut_107_0;
                      if (stackIn_108_0.field_w != var13_ref2.field_h) {
                        var10[var13_ref2.field_h.field_x] = var10[var13_ref2.field_h.field_x] + var13_ref2.field_i;
                      }
                      var13_ref2 = (ne) (var12_ref_eg.field_v.a((byte) -71));
                    }
                  }
                  stackIn_116_0 = var11_ref_oh;
                  if (stackIn_116_0 instanceof qi) {
                    var12_ref_qi = (qi) (var11_ref_oh);
                    var8[var12_ref_qi.field_k.field_x] = var8[var12_ref_qi.field_k.field_x] + var12_ref_qi.field_i;
                    var12_ref_qi.field_k.field_q.field_s = var12_ref_qi.field_k.field_q.field_s + 1;
                  }
                  if (var11_ref_oh instanceof qm) {
                    var12_ref_qm = (qm) (var11_ref_oh);
                    var12_ref_qm.field_p.field_q.field_s = var12_ref_qm.field_p.field_q.field_s + 1;
                  }
                  if (var11_ref_oh instanceof mg) {
                    var12_ref_mg = (mg) (var11_ref_oh);
                    var13_ref3 = var12_ref_mg.field_G.field_q;
                    var13_ref3.field_t = var13_ref3.field_t + 1;
                    var13_ref3.field_i = var13_ref3.field_i + var12_ref_mg.field_z;
                    var9[var12_ref_mg.field_G.field_x] = var9[var12_ref_mg.field_G.field_x] + var12_ref_mg.field_z;
                  }
                  var11_ref_oh = this.field_Q.field_a.a((byte) -71);
                }
              }
            }
            stackIn_128_0 = ~this.field_P.field_O;
            break;
          }
          if (stackIn_128_0 == 0) {
            stackIn_132_0 = 0;
          } else {
            stackIn_132_0 = this.field_P.field_O % 100;
          }
          var11 = stackIn_132_0;
          var12Lifetime1 = 0;
          while (this.field_P.field_r > var12Lifetime1) {
            var13_refLifetime1 = this.field_P.field_v[var12Lifetime1];
            var14 = var13_refLifetime1.field_q;
            var14.field_g[var11] = var3[var12Lifetime1];
            var14.field_f[var11] = var4[var12Lifetime1];
            var14.field_h[var11] = var6[var12Lifetime1];
            if (var16 != 0) {
              return;
            }
            if (var3[var12Lifetime1] > var14.field_A) {
              var14.field_A = var3[var12Lifetime1];
            }
            var14.field_v = var14.field_v + var8[var12Lifetime1];
            if (var4[var12Lifetime1] > var14.field_x) {
              var14.field_x = var4[var12Lifetime1];
            }
            var14.field_o = var14.field_o + var7[var12Lifetime1];
            var14.field_r = var14.field_e + (var14.field_o - var3[var12Lifetime1]);
            if (!var13_refLifetime1.field_i.g(115)) {
              if (param1 != null) {
                if (var5[var12Lifetime1] > 0) {
                  var14.field_u = var14.field_u + (var4[var12Lifetime1] * 800 + var5[var12Lifetime1]) / (var5[var12Lifetime1] * 2);
                }
                var14.field_z = var14.field_z + (param1[var12Lifetime1] + 200 * var10[var12Lifetime1]) / (2 * param1[var12Lifetime1]);
                var14.field_w = var14.field_w + (param1[var12Lifetime1] + 200 * var9[var12Lifetime1]) / (2 * param1[var12Lifetime1]);
              }
              var14.field_l = this.field_P.field_O - this.field_q;
            }
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_162_0 = var3_ref;
          stackIn_162_1 = new StringBuilder().append("km.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_163_2 = "null";
          } else {
            stackIn_163_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_162_0), ((StringBuilder) (Object) stackIn_162_1).append(stackIn_163_2).append(')').toString());
        }
    }

    public final void a(byte param0, fs param1, fs param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != -63) {
            field_A = (String) null;
          }
          if (this.field_f) {
            if (!sm.field_e) {
              throw new RuntimeException();
            }
            this.a(param2, (byte) 50);
          }
          if (param2 == param1) {
            return;
          }
          if (0 != (param1.field_w & 1 << param2.field_x)) {
            return;
          }
          param1.field_w = param1.field_w | 1 << param2.field_x;
          param2.field_A = param2.field_A | 1 << param1.field_x;
          if ((1 << param2.field_x & param1.field_A) != 0) {
            if (null != this.field_s[param2.field_x]) {
              this.field_s[param2.field_x].a(param1, (byte) -42);
            }
            param1.field_f[param2.field_x] = 3;
            param1.field_h[param2.field_x] = true;
            param2.field_f[param1.field_x] = 3;
            param2.field_h[param1.field_x] = true;
            param1.field_A = param1.field_A & ~(1 << param2.field_x);
            param1.field_w = param1.field_w & ~(1 << param2.field_x);
            param2.field_A = param2.field_A & ~(1 << param1.field_x);
            param2.field_w = param2.field_w & ~(1 << param1.field_x);
            this.a(param2, param0 ^ 27521, param1);
            if (!ShatteredPlansClient.field_F) {
              return;
            }
          }
          if (this.field_s[param2.field_x] != null) {
            this.field_s[param2.field_x].a(param1, param0 ^ -7737);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("km.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_f) {
            throw new IllegalStateException();
          }
          if (param0) {
            this.c(false);
          }
          js.field_f.h(63, 255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.LA(" + param0 + ')');
        }
    }

    final void a(int param0, fs param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka var3 = null;
        RuntimeException var3_ref = null;
        ka[] var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_P.a(-5, param1);
          var3 = new ka(this.field_P, param1, (mn) (this), 2);
          var4 = new ka[this.field_s.length + 1];
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= this.field_s.length))) {
            if (var8 == 0) {
              if (this.field_s[var5] != null) {
                var4[var5] = new ka(this.field_P, this.field_P.field_v[var5], (mn) (this), 2);
                var6 = (ka) (this.field_s[var5]);
                var7 = 0;
                while (!(var6.field_i.length <= var7)) {
                  var4[var5].field_i[var7] = var6.field_i[var7];
                  var7++;
                }
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var4[param1.field_x] = new ka(this.field_P, param1, (mn) (this), param0);
            var4[var5] = var3;
          }
          this.field_s = (uj[]) ((Object) var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("km.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void g(int param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        fs[] var2 = null;
        mg var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3_int = 0;
        qa var3 = null;
        fs var4 = null;
        qm var4_ref = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var2_intLifetime1;
        int var3_intLifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_f) {
            if (0 > this.field_h) {
              stackIn_11_0 = (oq.field_j != 13);
              stackIn_12_0 = stackIn_11_0 & ge.field_n;
            } else {
              stackIn_12_0 = sr.field_h;
            }
            var2_int = stackIn_12_0 ? 1 : 0;
            if (var2_int != 0) {
              return;
            }
          }
          if (13 == oq.field_j) {
            var2_intLifetime1 = 1;
            if (this.field_f) {
              if (this.field_h < 0) {
                var2_intLifetime1 = 4;
                if (var8 != 0) {
                  if (this.field_b) {
                    var2_intLifetime1 = 2;
                    var2_intLifetime1 = 3;
                  } else {
                    var2_intLifetime1 = 3;
                  }
                }
              } else {
                if (this.field_b) {
                  var2_intLifetime1 = 2;
                  if (var8 != 0) {
                    var2_intLifetime1 = 3;
                  }
                } else {
                  var2_intLifetime1 = 3;
                }
              }
            }
            var3_int = var2_intLifetime1;
            ta.a(0, var3_int, (byte) 96, false);
            return;
          }
          if (param0 > -80) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_Y.h(-1);
          if (se.field_g &&
            !this.field_f) {
            if ((!di.field_p[86] ||
              !di.field_p[35]) &&
              (decompiledFrameRemainder0 = !(!di.field_p[86])) &&
              (decompiledFrameRemainder0 = !(!di.field_p[67]))) {
              var2 = this.field_P.field_v;
              var3_intLifetime1 = 0;
              while (true) {
                if (var2.length > var3_intLifetime1) {
                  var4 = var2[var3_intLifetime1];
                  if (var8 == 0) {
                    if (this.field_n != var4) {
                      this.a((byte) -66, var4);
                    }
                    var3_intLifetime1++;
                    continue;
                  }
                }
                break;
              }
              this.m(126);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.a((byte) -2, this.field_n);
              this.m(123);
            }
          }
          if (se.field_g &&
            this.field_f &&
            null != this.field_n &&
            di.field_p[82] &&
            di.field_p[81] &&
            oq.field_j == 16) {
            sm.field_e = true;
            em.a(mq.c((byte) 73), 1);
            this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
            var2_ref = (mg) (this.field_P.field_p.a(true));
            while (null != var2_ref) {
              this.a(var2_ref, -var2_ref.field_z, 10755);
              var2_ref = (mg) (this.field_P.field_p.a((byte) -68));
              if (var8 != 0) {
                return;
              }
            }
            var3 = (qa) (this.field_P.field_q.d(0));
            while (null != var3) {
              var3.field_u.field_J = var3.field_u.field_J - var3.field_v;
              this.field_C[var3.field_u.field_p] = this.field_C[var3.field_u.field_p] - var3.field_v;
              var3.field_v = 0;
              var3.b((byte) -74);
              this.field_o.a(var3, 32);
              var3 = (qa) (this.field_P.field_q.a((byte) -71));
              if (var8 != 0) {
                return;
              }
            }
            var4_ref = (qm) (this.field_P.field_i.d(0));
            do {
              if (var4_ref == null) {
                this.e(0);
                this.field_s[this.field_h].b((byte) -98);
                this.a(this.field_n, -122);
                break;
              }
              var4_ref.field_q = null;
              var4_ref.field_r = null;
              this.field_ab.a(var4_ref, 32);
              var4_ref.b((byte) -71);
              var4_ref = (qm) (this.field_P.field_i.a((byte) -71));
            } while (var8 == 0);
            var5 = this.field_P.field_g.field_e;
            var6 = 0;
            do {
              if (var6 >= var5.length) {
                var2_ref = (mg) (this.field_P.field_p.a(true));
                break;
              }
              var7 = var5[var6];
              fl.a(var7, (byte) 96);
              kr.a((byte) -99, var7);
              var6++;
            } while (var8 == 0);
            do {
              if (var2_ref == null) {
                var3 = (qa) (this.field_P.field_q.d(0));
                break;
              }
              this.field_v.a((byte) 9, var2_ref);
              var2_ref = (mg) (this.field_P.field_p.a((byte) -68));
            } while (var8 == 0);
            do {
              if (var3 == null) {
                var4_ref = (qm) (this.field_P.field_i.d(0));
                break;
              }
              this.field_o.a(var3, 32);
              var3 = (qa) (this.field_P.field_q.a((byte) -71));
            } while (var8 == 0);
            while (null != var4_ref) {
              this.field_ab.a(var4_ref, 32);
              var4_ref = (qm) (this.field_P.field_i.a((byte) -71));
              if (var8 != 0) {
                return;
              }
            }
            this.e(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref2), "km.G(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_132_0 = 0;
        fs stackIn_143_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        ln[] var4 = null;
        ln var4_ref = null;
        gm var4_ref2 = null;
        RuntimeException var4_ref3 = null;
        int var5_int = 0;
        ln[] var5 = null;
        fs var5_ref = null;
        sf var5_ref2 = null;
        int var6 = 0;
        ln var6_ref_ln = null;
        int var7_int = 0;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_z.a(this.field_m, 0, param2, param0);
          if (!this.field_b) {
            return;
          }
          if (param1 > -66) {
            return;
          }
          if (null != this.field_z.field_p) {
            if (this.field_m != 2) {
              if (this.field_m != 0) {
                if (this.field_m == 1) {
                  if (this.field_K.b(this.field_z.field_p, (byte) 10) ||
                    this.field_K != this.field_z.field_p &&
                    this.field_K.field_R == this.field_z.field_p.field_R &&
                    this.field_P.a(this.field_K, this.field_z.field_p, -1)) {
                    this.field_z.e(-18641);
                    var4_int = -this.field_K.field_N + this.field_K.field_J;
                    if (0 < var4_int) {
                      stackIn_33_0 = (1 + var4_int) / 2;
                    } else {
                      stackIn_33_0 = 1;
                    }
                    var5_int = stackIn_33_0;
                    var6 = this.a((byte) 105);
                    switch (var6) {
                      case 81:
                        var5_int = 1;
                      default:
                        break;
                      case 82:
                        if (var4_int > 0) {
                          stackIn_47_0 = var4_int;
                        } else {
                          stackIn_47_0 = this.field_K.field_J;
                        }
                        var5_int = stackIn_47_0;
                        if (var8 == 0) {
                          break;
                        }
                      case 86:
                        var5_int = 5;
                        break;
                    }
                    if (!this.field_P.field_o.field_e) {
                      stackIn_53_0 = this.field_K.field_N;
                    } else {
                      stackIn_53_0 = 0;
                    }
                    var7_int = stackIn_53_0;
                    if (var5_int > this.field_K.field_J - var7_int) {
                      var5_int = this.field_K.field_J - var7_int;
                    }
                    if (var5_int > 0) {
                      this.a(false, var5_int, this.field_z.field_p, this.field_K);
                      if (this.field_n != this.field_z.field_p.field_y && (null != this.field_z.field_p.field_y ||
                        this.field_z.field_p.field_x != 0)) {
                        qk.a(jj.field_l, 78);
                        if (var8 != 0) {
                          qk.a(hs.field_l, 89);
                        }
                      } else {
                        qk.a(hs.field_l, 89);
                      }
                    }
                    this.a(2);
                  }
                  this.field_Y.a(-125, 0);
                  if (var8 == 0) {
                    return;
                  }
                }
                if (this.field_m != 3) {
                  if (this.field_m == 4) {
                    if (this.field_z.field_p.field_y != this.field_n) {
                      return;
                    }
                    if (this.field_z.field_p.field_L != 0) {
                      return;
                    }
                    this.field_z.e(-18641);
                    this.a(2);
                    this.a(1, this.field_z.field_p, 0);
                    this.field_Y.a(-122, 0);
                    this.field_Y.b(1, 2);
                    if (var8 == 0) {
                      return;
                    }
                  }
                  if (5 != this.field_m) {
                    if (this.field_m != 6) {
                      if (7 != this.field_m) {
                        return;
                      }
                      if (this.field_K.b(this.field_z.field_p, (byte) 10)) {
                        return;
                      }
                      if (this.field_K == this.field_z.field_p) {
                        return;
                      }
                      this.field_z.e(-18641);
                      this.a(2);
                      this.a(41, this.field_z.field_p, this.field_K, 3);
                      this.field_Y.a(-117, 0);
                      this.field_Y.b(3, 2);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if (this.field_z.field_p.field_y != this.field_n) {
                      return;
                    }
                    this.field_z.e(-18641);
                    this.a(2);
                    this.field_K = this.field_z.field_p;
                    this.field_Y.a(-84, 7);
                    var4 = this.field_P.field_g.field_e;
                    var5_int = 0;
                    while (var5_int < var4.length) {
                      var6_ref_ln = var4[var5_int];
                      if (var8 != 0) {
                        return;
                      }
                      if (!this.field_z.field_p.b(var6_ref_ln, (byte) 10) &&
                        this.field_z.field_p != var6_ref_ln) {
                        this.field_z.field_z[var6_ref_ln.field_p] = 2;
                      }
                      var5_int++;
                    }
                    if (var8 == 0) {
                      return;
                    }
                  }
                  stackIn_132_0 = (this.field_n != this.field_z.field_p.field_y) ? 0 : 1;
                  var4_int = stackIn_132_0;
                  var5 = this.field_z.field_p.field_D;
                  var6 = 0;
                  while (true) {
                    if (var6 < var5.length) {
                      var7 = var5[var6];
                      stackIn_143_0 = var7.field_y;
                      if (var8 == 0) {
                        if (stackIn_143_0 == this.field_n) {
                          var4_int = 1;
                        }
                        var6++;
                        continue;
                      }
                    } else {
                      stackIn_143_0 = this.field_z.field_p.field_y;
                    }
                    break;
                  }
                  var5_ref = stackIn_143_0;
                  if (var4_int != 0 &&
                    this.field_n != var5_ref && (null == var5_ref ||
                    !this.field_n.field_h[var5_ref.field_x])) {
                    this.field_z.e(-18641);
                    this.a(2);
                    this.a(2, this.field_z.field_p, 0);
                    this.field_Y.a(-81, 0);
                    this.field_Y.b(2, 2);
                  }
                  if (var8 == 0) {
                    return;
                  }
                }
                if (this.field_z.field_p.field_y != this.field_n) {
                  return;
                }
                if (this.field_z.field_p.field_u) {
                  return;
                }
                this.field_z.e(-18641);
                this.a(2);
                this.a(0, this.field_z.field_p, 0);
                this.field_Y.a(-119, 0);
                this.field_Y.b(0, 2);
                if (var8 == 0) {
                  return;
                }
              }
              if (this.field_n != this.field_z.field_p.field_y) {
                return;
              }
              if (this.field_n == null) {
                return;
              }
              if (0 >= this.field_z.field_p.field_J) {
                return;
              }
              this.field_K = this.field_z.field_p;
              qk.a(us.field_d, 74);
              this.field_Y.a(-107, 1);
              this.field_z.field_z[this.field_K.field_p] = 1;
              var4 = this.field_K.field_D;
              var5_int = 0;
              while (var5_int < var4.length) {
                var6_ref_ln = var4[var5_int];
                this.field_z.field_z[var6_ref_ln.field_p] = 2;
                var5_int++;
                if (var8 != 0) {
                  return;
                }
              }
              var4_ref = this.field_K.field_R.j(18229);
              while (null != var4_ref) {
                if (var8 != 0) {
                  return;
                }
                if (var4_ref != this.field_K &&
                  this.field_P.a(this.field_K, var4_ref, -1)) {
                  this.field_z.field_z[var4_ref.field_p] = 2;
                }
                var4_ref = this.field_K.field_R.h(-23410);
              }
              if (var8 == 0) {
                return;
              }
            }
            if (this.field_z.field_p.field_R != this.field_c) {
              if (!this.field_P.field_o.field_i) {
                return;
              }
              if (null == this.field_z.field_p.field_y) {
                return;
              }
              if (this.field_c != this.field_z.field_p.field_y.field_m) {
                return;
              }
            }
            this.field_z.e(-18641);
            this.a(this.field_z.field_p, -83);
            if (this.field_x > 3) {
              var5_int = this.field_x - 3;
              var6 = 96 >> (var5_int >> 1);
              if (0 != (var5_int & 1)) {
                var6 = 46341 * var6 >> 16;
              }
              if (var6 < 24) {
                var6 = 24;
              }
              var4_ref2 = rp.a(96, qc.field_w, var6);
              if (var8 != 0) {
                var4_ref2 = qk.a(qc.field_w, 78);
              }
            } else {
              var4_ref2 = qk.a(qc.field_w, 78);
            }
            if (null != this.field_E) {
              var5_ref2 = this.field_E;
              while (true) {
                if (null != var5_ref2.field_b) {
                  var5_ref2 = var5_ref2.field_b;
                  if (var8 == 0) {
                    continue;
                  }
                } else {
                  var5_ref2.field_b = new sf(var4_ref2, cl.field_n);
                }
                break;
              }
              if (var8 != 0) {
                this.field_E = new sf(var4_ref2, cl.field_n);
              }
            } else {
              this.field_E = new sf(var4_ref2, cl.field_n);
            }
            this.field_x = this.field_x + 1;
            this.a(2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref3), "km.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        fs[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        fs[] var2Lifetime1;
        fs var4Lifetime1;
        int var3Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          this.b(false);
          if (this.field_W &&
            0 == this.field_P.field_O) {
            if (this.field_P.field_o.field_i) {
              var2 = this.field_P.field_v;
              var3 = 0;
              while (var3 < var2.length) {
                var4 = var2[var3];
                var4.field_m.field_x = 0;
                var3++;
                if (var6 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder0 = (var6 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              var2Lifetime1 = this.field_P.field_v;
              var3Lifetime1 = 0;
              while (var2Lifetime1.length > var3Lifetime1) {
                var4Lifetime1 = var2Lifetime1[var3Lifetime1];
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var5 = (sd) (var4Lifetime1.field_i.d(0));
                while (null != var5) {
                  var5.field_x = 0;
                  var5 = (sd) (var4Lifetime1.field_i.a((byte) -71));
                }
                var3Lifetime1++;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            fieldTemp$0 = this.field_h + 1;
            this.field_h = this.field_h + 1;
            if (fieldTemp$0 == this.field_P.field_v.length) {
              this.field_n = this.field_P.field_v[0];
              this.field_h = 0;
              this.field_P.c(0);
              this.b(lr.a((byte) 27), 79);
              this.field_z.field_d = lr.a((byte) 27);
              this.field_P.c((byte) 119);
              var2_int = 0;
              while (!(this.field_P.field_r <= var2_int)) {
                if (var6 != 0) {
                  return;
                }
                if (null != this.field_s[var2_int]) {
                  this.field_s[var2_int].a((byte) -63);
                }
                var2_int++;
              }
            }
          }
          if (param0 != -81) {
            this.a(false, 84, (ln) null, (ln) null);
          }
          this.field_n = this.field_P.field_v[this.field_h];
          this.field_S = mb.field_o[this.field_P.field_J];
          this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.TA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        qm var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = (qm) (this.field_P.field_i.d(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            stackIn_15_0 = ~var3.field_o;
            stackIn_15_1 = ~param0;
            if (var4 == 0) {
              if (stackIn_15_0 == stackIn_15_1) {
                var3.field_r = null;
                var3.field_q = null;
                if (this.field_f) {
                  this.field_ab.a(var3, 32);
                  this.e(0);
                }
                var3.b((byte) -117);
              }
              var3 = (qm) (this.field_P.field_i.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = param1;
            stackIn_15_1 = 24;
          }
          if (stackIn_15_0 != stackIn_15_1) {
            this.field_f = true;
          }
          this.field_Y.c(param0, 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.BB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        try {
          field_e = null;
          field_u = null;
          field_a = null;
          field_X = null;
          field_A = null;
          if (param0 != 11) {
            km.h(24);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "km.JA(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        tr stackIn_13_0 = null;
        pf stackIn_14_1 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 &&
            !ol.a(-114)) {
            this.j(50);
            if (var4 != 0) {
              this.field_Y.a(false, (byte) 110);
            }
          } else {
            this.field_Y.a(false, (byte) 110);
          }
          this.field_Y.h((byte) 122);
          stackIn_13_0 = this.field_z;
          if (null == this.field_Q) {
            stackIn_14_1 = null;
          } else {
            stackIn_14_1 = this.field_Q.field_a;
          }
          ((tr) (Object) stackIn_13_0).a(stackIn_14_1, 66);
          L4: while (true) {
            if (null != this.field_E) {
              stackIn_24_0 = cl.field_n - this.field_E.field_c;
              stackIn_24_1 = 50;
              if (var4 != 0) {
                break L4;
              }
              if (stackIn_24_0 >= stackIn_24_1) {
                this.field_x = this.field_x - 1;
                this.field_E = this.field_E.field_b;
                continue;
              }
            }
            stackIn_24_0 = param1 ? 1 : 0;
            stackIn_24_1 = 1;
            break;
          }
          if (stackIn_24_0 != stackIn_24_1) {
            field_X = (String) null;
          }
          boolean decompiledSharedTail0 = (this.field_f);
          if (!decompiledSharedTail0) {
            this.field_S = this.field_S - 1;
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            if (1 < this.field_S) {
              fieldTemp$0 = this.field_S - 1;
              this.field_S = this.field_S - 1;
              if (fieldTemp$0 == 1 &&
                !this.field_L &&
                this.field_b) {
                this.m(123);
              }
            }
            if (this.field_S % 200 == 0 &&
              this.field_L) {
              var3 = js.field_f;
              var3.h(61, 255);
              var3.c(this.field_P.field_O, (byte) -110);
              var3.e(11135, this.f(109));
            }
          }
          if (this.field_f &&
            this.field_b &&
            this.field_k != -1) {
            fieldTemp$1 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            if (fieldTemp$1 != -1) {
              fieldTemp$2 = this.field_g - 1;
              this.field_g = this.field_g - 1;
              if (fieldTemp$2 >= 0) {
                return;
              }
            }
            this.l(-106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(fs param0, int param1, fs param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_n == param0) {
            var4 = re.a(jb.field_a, 4371, new String[]{param2.field_t});
            this.field_H.a(new n(param0, param2, var4), 0);
            if (var5 != 0) {
              if (param2 == this.field_n) {
                var4 = re.a(se.field_c, 4371, new String[]{param0.field_t});
                this.field_H.a(new n(param2, param0, var4), 0);
                var4 = re.a(lh.field_A, 4371, new String[]{param0.field_t, param2.field_t});
                this.field_H.a(new n(param2, param0, var4), 0);
              } else {
                var4 = re.a(lh.field_A, 4371, new String[]{param0.field_t, param2.field_t});
                this.field_H.a(new n(param2, param0, var4), 0);
              }
            }
          } else {
            boolean decompiledSharedTail0 = (param2 != this.field_n);
            if (!decompiledSharedTail0) {
              var4 = re.a(se.field_c, 4371, new String[]{param0.field_t});
              this.field_H.a(new n(param2, param0, var4), 0);
              decompiledSharedTail0 = (var5 != 0);
            }
            if (decompiledSharedTail0) {
              var4 = re.a(lh.field_A, 4371, new String[]{param0.field_t, param2.field_t});
              this.field_H.a(new n(param2, param0, var4), 0);
            }
          }
          if (this.field_W) {
            fl.a(0, "signtreaty");
          }
          this.a(this.field_n, param1 + 27510);
          if (null != this.field_s[param0.field_x]) {
            this.field_s[param0.field_x].a(param2, (byte) -42);
          }
          if (param1 != -27584) {
            this.field_J = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("km.I(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        n var2 = null;
        RuntimeException var2_ref = null;
        qm var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = (n) (this.field_H.d(0));
          if (param0) {
            return;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2 == null))) {
            stackIn_12_0 = -3;
            if (var5 == 0) {
              fieldTemp$0 = var2.field_i + 1;
              var2.field_i = var2.field_i + 1;
              if (stackIn_12_0 == ~fieldTemp$0) {
                var2.b((byte) -85);
              }
              var2 = (n) (this.field_H.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = this.field_W ? 1 : 0;
          }
          if (stackIn_12_0 != 0) {
            var3 = (qm) (this.field_P.field_i.d(0));
            while (var3 != null) {
              var4 = var3.field_o;
              if (var5 != 0) {
                return;
              }
              L7: {
                L8: {
                  switch (var4) {
                    case 2:
                      fl.a(0, "stellarbomb");
                      break;
                    default:
                      break;
                    case 3:
                      break L8;
                    case 0:
                      fl.a(0, "defensivenet");
                      break;
                    case 1:
                      fl.a(0, "terraforming");
                      break;
                  }

                  break L7;
                }
                fl.a(0, "tannhauser");
              }
              var3 = (qm) (this.field_P.field_i.a((byte) -71));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.DA(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        ln stackIn_46_0 = null;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Throwable decompiledCaughtException = null;
        ln[] var2 = null;
        int var2_int = 0;
        Exception var2_ref = null;
        mg var2_ref2 = null;
        RuntimeException var2_ref3 = null;
        int var3_int = 0;
        qa var3 = null;
        ln var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ln stackIn_46_0Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          System.gc();
          this.field_P.field_x.a((byte) -70, this.field_P, this.field_Y);
          var2 = this.field_P.field_g.field_e;
          var3_int = 0;
          L1: while (true) {
            if (var3_int < var2.length) {
              var4 = var2[var3_int];
              var4.field_J = var4.field_x;
              stackIn_46_0 = var4;
              if (var6 != 0) {
                while (true) {
                  fl.a(stackIn_46_0, (byte) 73);
                  kr.a((byte) 65, var4);
                  var3_int++;
                  break L1;
                }
              }
              boolean decompiledSharedTail0 = (stackIn_46_0.field_y != this.field_n);
              if (!decompiledSharedTail0) {
                this.field_p[var4.field_p] = var4.field_x;
                this.field_J[var4.field_p] = var4.field_x;
                decompiledSharedTail0 = (var6 != 0);
              }
              if (decompiledSharedTail0) {
                this.field_w[var4.field_p] = false;
                this.field_V[var4.field_p] = false;
                this.field_p[var4.field_p] = 0;
                this.field_J[var4.field_p] = 0;
              }
              var3_int++;
              if (var6 == 0) {
                continue;
              }
            }
            if (null == this.field_R ||
              !(this.field_P.field_g.field_e.length <= this.field_R.length)) {
              var2_int = this.field_P.field_g.field_e.length;
              this.field_C = new int[var2_int];
              this.field_R = new fs[var2_int];
              this.field_l = new sd[var2_int];
            }
            var2 = this.field_P.field_g.field_e;
            var3_int = 0;
            do {
              if (var2.length <= var3_int) {
                this.field_z.a(this.field_C, param0, this.field_l, this.field_R, false);
                this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
                this.field_z.d(0);
                this.a(this.field_n, -83);
                break;
              }
              var4 = var2[var3_int];
              var5 = var4.field_p;
              this.field_R[var5] = var4.field_y;
              this.field_C[var5] = var4.field_x;
              this.field_l[var5] = var4.field_R;
              var3_int++;
            } while (var6 == 0);
            if (!this.field_f &&
              null != this.field_s[this.field_h]) {
              try {
                this.field_s[this.field_h].b((byte) -91);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                jq.a(-29901, (Throwable) ((Object) var2_ref), "AI has errored in single player game");
              }
              this.a(this.field_n, -84);
              this.d((byte) -81);
              return;
            }
            if (sm.field_e &&
              !this.field_j &&
              this.field_b) {
              this.field_s[this.field_h].a((byte) -63);
              this.field_s[this.field_h].b((byte) -15);
              this.a(this.field_n, -70);
              var2 = this.field_P.field_g.field_e;
              var3_int = 0;
              while (var3_int < var2.length) {
                var4 = var2[var3_int];
                stackIn_46_0Lifetime1 = var4;
                fl.a(stackIn_46_0Lifetime1, (byte) 73);
                kr.a((byte) 65, var4);
                var3_int++;
                if (var6 != 0) {
                  break L1;
                }
              }
              var2_ref2 = (mg) (this.field_P.field_p.a(true));
              while (var2_ref2 != null) {
                this.field_v.a((byte) 9, var2_ref2);
                var2_ref2 = (mg) (this.field_P.field_p.a((byte) -68));
                if (var6 != 0) {
                  break L1;
                }
              }
              var3 = (qa) (this.field_P.field_q.d(0));
              while (var3 != null) {
                this.field_o.a(var3, 32);
                var3 = (qa) (this.field_P.field_q.a((byte) -71));
                if (var6 != 0) {
                  break L1;
                }
              }
              var4_ref = (qm) (this.field_P.field_i.d(0));
              while (null != var4_ref) {
                this.field_ab.a(var4_ref, 32);
                var4_ref = (qm) (this.field_P.field_i.a((byte) -71));
                if (var6 != 0) {
                  break L1;
                }
              }
              this.e(0);
            }
            this.field_z.a(false);
            this.field_Y.n(106);
            this.field_Y.a(-73, 0);
            this.field_N = 0;
            break;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2_int < this.field_P.field_r)))) {
            stackIn_88_0 = ~(1 << var2_int & this.field_P.field_w);
            stackIn_88_1 = -1;
            if (var6 == 0) {
              if (stackIn_88_0 == stackIn_88_1) {
                this.field_N = this.field_N + 1;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (!this.field_P.field_z) {
              if (this.field_n == null) {
                return;
              }
              if ((1 << this.field_h & this.field_P.field_w) == 0) {
                return;
              }
            }
            stackIn_88_0 = 0;
            stackIn_88_1 = -1;
          }
          ta.a(stackIn_88_0, stackIn_88_1, (byte) 96, false);
          this.field_b = false;
          this.field_Y.o(-4956);
          if ((this.field_n == null ||
            (1 << this.field_h & this.field_P.field_w) == 0) && !this.field_P.field_x.a((byte) -123, this.field_n)) {
            if (this.field_P.field_z) {
              jo.a(32767, hj.field_n, false, 10);
              if (var6 != 0) {
                jo.a(32767, wh.field_b, false, 10);
              }
            }
          } else {
            jo.a(32767, wh.field_b, false, 10);
          }
          if (sm.field_e &&
            (this.field_P.field_e & 1 << this.field_h) == 0) {
            this.b(-118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref3), "km.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        Object stackIn_5_0;
        Object stackIn_6_0;
        tr stackIn_6_1;
        tr stackIn_6_2;
        l stackIn_6_3;
        fs[] stackIn_6_4;
        fs stackIn_6_5;
        boolean stackIn_6_6;
        tr stackIn_7_1 = null;
        tr stackIn_7_2 = null;
        boolean stackIn_7_7 = false;
        boolean stackIn_42_0 = false;
        int stackIn_49_0 = 0;
        Object stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_41_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3_ref_String = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        Object stackIn_6_0Lifetime1;
        tr stackIn_6_1Lifetime1;
        tr stackIn_6_2Lifetime1;
        tr stackIn_7_1Lifetime1;
        tr stackIn_7_2Lifetime1;
        int var2_intLifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          stackIn_6_0 = this;
          stackIn_6_1 = null;
          stackIn_6_2 = null;
          stackIn_6_3 = this.field_P.field_g;
          stackIn_6_4 = this.field_P.field_v;
          stackIn_6_5 = this.field_n;
          stackIn_6_6 = this.field_W;
          if (!this.field_P.field_o.field_k) {
            stackIn_6_0Lifetime1 = this;
            stackIn_6_1Lifetime1 = null;
            stackIn_6_2Lifetime1 = null;
            if (!this.field_P.field_o.field_l) {
              stackIn_5_0 = this;
              stackIn_7_1 = null;
              stackIn_7_2 = null;
              stackIn_7_7 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_7_1Lifetime1 = null;
            stackIn_7_2Lifetime1 = null;
            stackIn_7_7 = false;
          }
          this.field_z = new tr(stackIn_6_3, stackIn_6_4, stackIn_6_5, stackIn_6_6, stackIn_7_7);
          this.field_z.field_C = true;
          if (this.field_Y == null) {
            this.field_Y = new kq(this);
          }
          boolean decompiledFrameCompleted0 = true;
          this.field_z.a(this.field_Y, param0 + 205);
          if (!this.field_f &&
            !this.field_W) {
            var2_int = 0;
            while (!(var2_int >= this.field_P.field_r)) {
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != this.field_s[var2_int]) {
                this.field_s[var2_int].a(param0 + 7);
                if (se.field_g) {
                  var3_ref_String = "My personality is " + wk.field_a[this.field_s[var2_int].a(false)];
                  this.a(this.field_P.field_v[var2_int], var3_ref_String, (byte) 51);
                }
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            var2_intLifetime1 = this.field_P.field_g.field_e.length;
            this.field_J = new int[var2_intLifetime1];
            this.field_w = new boolean[var2_intLifetime1];
            this.field_r = new int[var2_intLifetime1];
            this.field_p = new int[var2_intLifetime1];
            this.field_d = new int[var2_intLifetime1];
            this.field_V = new boolean[var2_intLifetime1];
            this.field_t = new int[var2_intLifetime1];
            this.field_U = new int[var2_intLifetime1];
            this.field_P.b(-99);
            this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
          }
          if (this.field_h < 0) {
            sm.field_e = false;
          }
          if (param0 != -81) {
            return;
          }
          if (sm.field_e) {
            this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
          }
          var3_ref_fs__ = this.field_P.field_v;
          var4 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 >= var3_ref_fs__.length))) {
            var5 = var3_ref_fs__[var4];
            stackOut_41_0 = var5.field_i.g(-124);
            stackIn_49_0 = stackOut_41_0 ? 1 : 0;
            stackIn_42_0 = stackOut_41_0;
            if (var6 == 0) {
              if (stackIn_42_0) {
                this.field_P.field_w = this.field_P.field_w | 1 << var5.field_x;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_z.b(false);
            this.a(true);
            stackIn_49_0 = 0;
          }
          var3 = stackIn_49_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(this.field_P.field_r > var3)))) {
            stackIn_60_0 = null;
            if (var6 == 0) {
              if (stackIn_60_0 != this.field_s[var3]) {
                this.field_s[var3].a((byte) -63);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.a(param0 + 83);
            stackIn_60_0 = null;
          }
          boolean decompiledSharedTail0 = (stackIn_60_0 != this.field_n &&
            !(this.field_n.field_i.g(param0 ^ 27)) &&
            !(sm.field_e));
          if (!decompiledSharedTail0) {
            this.field_z.field_I = this.field_z.field_F;
            decompiledSharedTail0 = (var6 != 0);
          }
          if (decompiledSharedTail0) {
            this.field_z.a((sd) (this.field_n.field_i.d(0)), param0 ^ -82);
          }
          this.field_z.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.T(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = js.field_f;
          var2.h(60, 255);
          var2.field_j = var2.field_j + 2;
          var3 = var2.field_j;
          var2.c(this.field_P.field_O, (byte) -73);
          if (param0 >= -114) {
            this.field_Q = (k) null;
          }
          se.a(fp.a(this.field_P.field_q, -71), -256, fp.a(this.field_P.field_i, -88), eh.a(25, this.field_P.field_p), var2);
          this.field_ab.b((byte) 108);
          this.field_o.b((byte) 127);
          this.field_v.a((byte) 112);
          var2.f(-549342136, -var3 + var2.field_j);
          this.field_k = -1;
          this.field_g = -1;
          if (this.field_L) {
            var2.h(61, 255);
            var2.c(this.field_P.field_O, (byte) -74);
            var2.e(11135, this.f(-78));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.CA(" + param0 + ')');
        }
    }

    private final void a(ln param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_58_0 = 0;
        ln stackIn_65_0 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        qa var5 = null;
        sd var6 = null;
        ln var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = 1;
          var4 = this.a((byte) 82);
          if (param1 == ~var4) {
            var3_int = this.field_c.field_x;
          }
          if ((param1 != ~var4 ||
            var8 != 0) &&
            var4 == 86) {
            if (5 >= this.field_c.field_x) {
              stackIn_12_0 = this.field_c.field_x;
            } else {
              stackIn_12_0 = 5;
            }
            var3_int = stackIn_12_0;
          }
          param0.field_J = param0.field_J + var3_int;
          this.field_C[param0.field_p] = this.field_C[param0.field_p] + var3_int;
          this.field_p[param0.field_p] = this.field_p[param0.field_p] + var3_int;
          this.field_J[param0.field_p] = this.field_J[param0.field_p] + var3_int;
          var5 = (qa) (this.field_P.field_q.d(0));
          L5: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (null != var5) {
              stackIn_65_0 = (ln) (param0);
              decompiledFrameRemainder1 = (var8 == 0);
              if ((decompiledFrameRemainder1) &&
                (stackIn_65_0 != var5.field_u)) {
                var5 = (qa) (this.field_P.field_q.a((byte) -71));
                continue;
              }
            }
            if (decompiledFrameRemainder1) {
              if (null == var5) {
                var5 = new qa(param0, 0);
                this.field_P.field_q.a((byte) -113, var5);
              }
              var5.field_v = var5.field_v + var3_int;
              if (this.field_f) {
                this.field_o.a(var5, 32);
                this.e(0);
              }
              this.field_c.field_x = this.field_c.field_x - var3_int;
              this.field_Y.e((byte) 43);
              if (this.field_c.field_x <= 0) {
                if (null == this.field_n ||
                  this.field_P.field_o.field_i) {
                  this.field_Y.a(param1 - 4, 0);
                  if (var8 == 0) {
                    break L5;
                  }
                }
                var6 = (sd) (this.field_n.field_i.d(param1 + 83));
                L14: while (true) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var6 != null) {
                    stackIn_58_0 = -1;
                    decompiledFrameRemainder0 = (var8 == 0);
                    if ((decompiledFrameRemainder0) && (stackIn_58_0 == ~var6.field_x ||
                      var8 != 0)) {
                      var6 = (sd) (this.field_n.field_i.a((byte) -71));
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (null != var6) {
                      this.field_c = var6;
                      this.field_Y.a(-102, 2);
                      var7 = var6.j(18229);
                      while (null != var7) {
                        this.field_z.field_z[var7.field_p] = 2;
                        var7 = var6.h(param1 - 23327);
                        if (var8 != 0) {
                          break L14;
                        }
                      }
                      if (var8 == 0) {
                        break L14;
                      }
                    }
                    stackIn_58_0 = this.field_W ? 1 : 0;
                  }
                  if (stackIn_58_0 != 0) {
                    fl.a(0, "buildships");
                  }
                  this.field_Y.a(-86, 0);
                  break;
                }
                if (var8 == 0) {
                  break L5;
                }
              }
              this.field_Y.a(-73, 2);
              stackIn_65_0 = this.field_c.j(18229);
            }
            var6_ref = stackIn_65_0;
            while (null != var6_ref) {
              this.field_z.field_z[var6_ref.field_p] = 2;
              var6_ref = this.field_c.h(-23410);
              if (var8 != 0) {
                return;
              }
            }
            break;
          }
          this.a(this.field_n, param1 ^ 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_76_0 = var3;
          stackIn_76_1 = new StringBuilder().append("km.S(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int[] c(byte param0) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int[] stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        ln[] var3 = null;
        fs[] var3_array = null;
        int var4 = 0;
        ln var5 = null;
        fs var5_ref = null;
        int var6 = 0;
        sd var7 = null;
        int var8 = 0;
        int var4Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = new int[this.field_P.field_r];
          var3 = this.field_P.field_g.field_e;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            var5 = var3[var4];
            if (var8 == 0) {
              if (null != var5.field_y) {
                var2[var5.field_y.field_x] = var2[var5.field_y.field_x] + var5.field_x;
              }
              var4++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 != 44)) {
            this.a((fs) null, (String) null, (byte) -53);
          }
          var3_array = this.field_P.field_v;
          var4Lifetime1 = 0;
          L4: while (true) {
            stackIn_16_0 = ~var3_array.length;
            stackIn_16_1 = ~var4Lifetime1;
            L5: while (stackIn_16_0 < stackIn_16_1) {
              var5_ref = var3_array[var4Lifetime1];
              var6 = var5_ref.field_x;
              boolean decompiledSharedTail0 = !(!this.field_P.field_o.field_i);
              if (!decompiledSharedTail0) {
                var7 = (sd) (var5_ref.field_i.d(param0 ^ 44));
                while (var7 != null) {
                  stackIn_16_0 = 0;
                  stackIn_16_1 = var7.field_r;
                  if (var8 != 0) {
                    continue L5;
                  }
                  if (stackIn_16_0 < stackIn_16_1) {
                    var2[var6] = var2[var6] + var7.field_r;
                  }
                  var7 = (sd) (var5_ref.field_i.a((byte) -71));
                }
                decompiledSharedTail0 = (var8 != 0);
              }
              if ((decompiledSharedTail0) && (null != var5_ref.field_m &&
                var5_ref.field_m.field_r > 0)) {
                var2[var6] = var2[var6] + var5_ref.field_m.field_r;
              }
              var4Lifetime1++;
              if (var8 == 0) {
                continue L4;
              }
              break;
            }
            break;
          }
          stackIn_37_0 = var2;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.UA(" + param0 + ')');
        }
    }

    final void a(fs param0, byte param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 != ((1 << param0.field_x | 1 << this.field_h) & this.field_P.field_w)) {
            return;
          }
          if (param1 <= 44) {
            this.a((ob) null, -6, 94);
          }
          if (param0 == this.field_n) {
            return;
          }
          if ((1 << param0.field_x & this.field_n.field_w) != 0) {
            return;
          }
          this.field_n.field_w = this.field_n.field_w | 1 << param0.field_x;
          param0.field_A = param0.field_A | 1 << this.field_n.field_x;
          if (this.field_f) {
            var3 = js.field_f;
            var3.h(59, 255);
            var3.field_j = var3.field_j + 2;
            var4 = var3.field_j;
            var3.c(this.field_P.field_O, (byte) -106);
            var3.c(255, (byte) -78);
            var3.c(this.field_n.field_x, (byte) -126);
            var3.c(param0.field_x, (byte) -104);
            var3.f(-549342136, -var4 + var3.field_j);
            if ((this.field_n.field_A & 1 << param0.field_x) == 0) {
              this.a(this.field_n, param0, true);
            }
            if (var5 == 0) {
              return;
            }
          }
          if ((1 << param0.field_x & this.field_n.field_A) == 0) {
            this.a(this.field_n, param0, true);
            if (var5 == 0) {
              return;
            }
          }
          this.field_n.field_f[param0.field_x] = 3;
          this.field_n.field_h[param0.field_x] = true;
          param0.field_f[this.field_n.field_x] = 3;
          param0.field_h[this.field_n.field_x] = true;
          this.field_n.field_A = this.field_n.field_A & ~(1 << param0.field_x);
          this.field_n.field_w = this.field_n.field_w & ~(1 << param0.field_x);
          param0.field_A = param0.field_A & ~(1 << this.field_n.field_x);
          param0.field_w = param0.field_w & ~(1 << this.field_n.field_x);
          this.a(param0, -27584, this.field_n);
          if (this.field_W) {
            fl.a(0, "signtreaty");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("km.EA(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    km(boolean param0, boolean param1, int param2, vr param3, int param4, String[] param5, int param6, boolean param7, kq param8) {
        fs stackIn_21_0 = null;
        String stackIn_22_1 = null;
        boolean stackIn_27_0 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_44_1 = false;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_26_0;
        int var10_int = 0;
        fs[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        fs var12 = null;
        int var13 = 0;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime1Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_F = 25;
        this.field_T = false;
        this.field_I = this.field_F;
        this.field_y = false;
        try {
          this.field_f = param0;
          this.field_h = param6;
          this.field_W = param1;
          this.field_M = param7;
          if (!this.field_f) {
            if (this.field_W) {
              this.field_P = jg.a(param3, param5, param2, -22379, 4);
              ob.a(-126, this);
              if (var13 != 0) {
                this.field_P = qr.a(param2, 50, param5, param3, param4, 2);
                this.field_P = uq.a(param4, param2, -27579, param5, param3);
              }
            } else {
              this.field_P = qr.a(param2, 50, param5, param3, param4, 2);
              if (var13 != 0) {
                this.field_P = uq.a(param4, param2, -27579, param5, param3);
              }
            }
          } else {
            this.field_P = uq.a(param4, param2, -27579, param5, param3);
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_f) {
            var10_int = 1;
            while (true) {
              if (this.field_P.field_r > var10_int) {
                this.field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                var10_int++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                stackIn_21_0 = this.field_P.field_v[0];
                if (w.d(true)) {
                  stackIn_22_1 = hn.field_f[0];
                } else {
                  stackIn_22_1 = ln.field_o;
                }
                stackIn_21_0.field_t = stackIn_22_1;
              }
              break;
            }
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            var10_intLifetime2 = 0;
            while (!(var10_intLifetime2 >= this.field_P.field_r)) {
              stackOut_26_0 = param5[var10_intLifetime2].equals("bot_sp");
              stackIn_34_0 = stackOut_26_0 ? 1 : 0;
              stackIn_27_0 = stackOut_26_0;
              if (var13 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_27_0) {
                this.field_P.field_v[var10_intLifetime2].field_t = hn.field_f[var10_intLifetime2];
              }
              var10_intLifetime2++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_34_0 = -1;
          }
          if (stackIn_34_0 < ~this.field_h) {
            this.field_n = null;
            if (var13 != 0) {
              this.field_n = this.field_P.field_v[this.field_h];
            }
          } else {
            this.field_n = this.field_P.field_v[this.field_h];
          }
          stackIn_44_1 = (this.field_n != null);
          this.field_b = stackIn_44_1;
          this.field_s = (uj[]) ((Object) new hi[this.field_P.field_v.length]);
          var10 = this.field_P.field_v;
          var11 = 0;
          L16: while (true) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            if (var10.length > var11) {
              var12 = var10[var11];
              var12.field_q = new um(20);
              var11++;
              if (var13 == 0) {
                continue;
              }
            } else {
              if (!this.field_W) {
                if (!(this.field_f)) {
                  var10_intLifetime1 = 0;
                  while (var10_intLifetime1 < this.field_P.field_r) {
                    stackIn_80_0 = ~this.field_h;
                    if (var13 != 0) {
                      break L16;
                    }
                    if (stackIn_80_0 != ~var10_intLifetime1 ||
                      var13 != 0) {
                      this.field_s[var10_intLifetime1] = (uj) ((Object) new hi(this.field_P.field_v[var10_intLifetime1], this.field_P, (mn) (this)));
                      this.field_s[var10_intLifetime1].a(true, -6861);
                    }
                    var10_intLifetime1++;
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              var10_intLifetime1Lifetime1 = 1;
              while (!(this.field_P.field_r <= var10_intLifetime1Lifetime1)) {
                this.field_s[var10_intLifetime1Lifetime1] = og.a(2, (mn) (this), this.field_P.field_v[var10_intLifetime1Lifetime1], this.field_P, -114);
                this.field_s[var10_intLifetime1Lifetime1].a(false, -6861);
                var10_intLifetime1Lifetime1++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (param8 != null) {
                param8.a((byte) -33, this);
                this.field_Y = param8;
              }
              this.field_H = new pf();
            }
            stackIn_80_0 = this.field_f ? 1 : 0;
            break;
          }
          if (stackIn_80_0 != 0) {
            this.field_ab = new db();
            this.field_o = new db();
            this.field_v = new wb();
            this.field_k = -1;
            this.field_g = -1;
            this.field_P.d(-9778, -1);
          }
          if (stackIn_80_0 == 0 ||
            var13 != 0) {
            this.b((byte) -81);
            this.field_z.field_p = null;
            this.field_P.d(-9778, 0);
            this.field_S = mb.field_o[this.field_P.field_J];
          }
          this.field_G = false;
          this.field_L = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_91_0 = var10_ref;
          stackIn_91_1 = new StringBuilder().append("km.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(')').toString());
        }
    }

    static {
        field_a = "Enter multiplayer lobby";
        field_A = "Enter name of friend to add to list";
        field_X = "Connecting to<br>friend server...";
    }
}
