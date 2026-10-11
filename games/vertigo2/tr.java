/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    private int field_N;
    private nj field_z;
    private wo[][] field_K;
    boolean field_i;
    static cr field_l;
    private boolean[] field_p;
    private long field_j;
    private int field_x;
    private bh field_m;
    int field_s;
    private int field_k;
    private int[] field_q;
    private boolean field_A;
    private int[] field_L;
    private int field_v;
    private int field_y;
    static String field_O;
    private int field_M;
    static String field_d;
    private er field_b;
    static String field_e;
    private boolean field_g;
    private am field_G;
    lj field_D;
    private int field_u;
    private int field_t;
    private boolean field_o;
    private float field_I;
    private int field_C;
    static int field_f;
    private float field_E;
    private hd field_a;
    private boolean field_w;
    private int field_r;
    int field_h;
    private boolean[] field_F;
    int field_B;
    private int field_J;
    private boolean field_c;
    private int field_n;
    private int field_H;

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1220) {
            return;
          }
          var4_int = 1 << param1;
          if ((ml.field_z & var4_int) != 0) {
            return;
          }
          ml.field_z = ml.field_z | var4_int;
          var5 = param1;
          if (ln.field_d != null &&
            ln.field_d.field_B >= 0 &&
            null == oe.field_pb) {
            stackIn_17_0 = ((1 << var5 & qr.field_j) == 0) ? 0 : 1;
            var6 = stackIn_17_0;
            if (var6 == 0) {
              qr.field_j = qr.field_j | 1 << var5;
              sk.field_b = sk.field_b - (1 << var5);
            }
          }
          jq.field_e = jq.field_e | var4_int;
          bg.field_b.a(new fa(param1), false);
          if (!this.field_c) {
            fg.field_eb.a(new nf(param1, param2, qr.field_j, sk.field_b, re.field_j, ki.field_c), false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "tr.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1) {
        try {
          uh.field_Wb.j(64, 122);
          uh.field_Wb.f(22, 119);
          uh.field_Wb.f(1, -98);
          uh.field_Wb.f(param0, param1 + 24174);
          uh.field_Wb.e(this.field_D.field_l[this.field_B].field_H, param1 ^ param1);
          uh.field_Wb.e(mc.field_e, param1 ^ -24066);
          uh.field_Wb.e(sl.field_l, param1 + 24066);
          uh.field_Wb.e(ci.field_b, param1 ^ -24066);
          uh.field_Wb.e(lj.field_k, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tr.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -27588) {
            this.e(-118);
          }
          if (!this.field_o) {
            throw new IllegalStateException();
          }
          uh.field_Wb.j(61, param0 + 27710);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.N(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_o) {
            throw new IllegalStateException();
          }
          uh.field_Wb.j(60, 123);
          if (!param0) {
            this.e(113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.P(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_O = null;
        field_d = null;
        if (param0) {
          return;
        }
        try {
          field_e = null;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tr.L(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        am stackIn_469_0 = null;
        bh stackIn_469_1 = null;
        int stackIn_469_2 = 0;
        boolean stackIn_472_3 = false;
        hd stackIn_537_0 = null;
        boolean stackIn_538_1 = false;
        boolean stackIn_607_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        long var5_long = 0L;
        int var6 = 0;
        long var7_long = 0L;
        int var7 = 0;
        long var9 = 0L;
        float var11 = 0.0f;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_B >= 0) {
            var3_int = this.field_o ? 1 : 0;
            var4 = this.field_D.field_l[this.field_B].field_W;
            if (var3_int != 0) {
              var4 = 0;
            }
            if (!ln.field_d.field_c ||
              var12 != 0) {
              var5 = (de.field_f ^ ln.field_d.field_s) % 8;
              switch (var5) {
                case 0:
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break;
                case 1:
                  gi.field_u = gi.field_u + c.field_h;
                  aj.field_e = aj.field_e - 1;
                  break;
                case 3:
                  gi.field_u = gi.field_u - c.field_h;
                  aj.field_e = aj.field_e + 1;
                  break;
                case 6:
                  pn.field_R = pn.field_R - aj.field_e;
                  c.field_h = c.field_h - 1;
                default:
                  break;
                case 7:
                  pn.field_R = pn.field_R - c.field_h;
                  aj.field_e = aj.field_e - 1;
                  if (var12 == 0) {
                    break;
                  }
                case 5:
                  pn.field_R = pn.field_R + c.field_h;
                  aj.field_e = aj.field_e + 1;
                  if (var12 == 0) {
                    break;
                  }
                case 4:
                  c.field_h = c.field_h + 1;
                  pn.field_R = pn.field_R + aj.field_e;
                  if (var12 == 0) {
                    break;
                  }
                case 2:
                  gi.field_u = gi.field_u - aj.field_e;
                  c.field_h = c.field_h + 1;
                  break;
              }
              var5 = (ln.field_d.field_s ^ de.field_f + var4) % 5;
              switch (var5) {
                default:
                  break;
                case 4:
                  re.field_j = re.field_j - 1;
                  sk.field_b = sk.field_b - ki.field_c;
                  if (var12 == 0) {
                    break;
                  }
                case 3:
                  re.field_j = re.field_j + 1;
                  sk.field_b = sk.field_b + ki.field_c;
                  if (var12 == 0) {
                    break;
                  }
                case 2:
                  ki.field_c = ki.field_c - 1;
                  sk.field_b = sk.field_b - re.field_j;
                  if (var12 == 0) {
                    break;
                  }
                case 1:
                  sk.field_b = sk.field_b + re.field_j;
                  ki.field_c = ki.field_c + 1;
                  if (var12 == 0) {
                    break;
                  }
                case 0:
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 17;
                  break;
              }
              var5 = (gi.field_u + de.field_f * aj.field_e) % 8;
              switch (var5) {
                case 2:
                  f.field_B = f.field_B + ca.field_g;
                  df.field_k = df.field_k + 1;
                  break;
                case 3:
                  ca.field_g = ca.field_g + 1;
                  f.field_B = f.field_B + df.field_k;
                  break;
                case 4:
                  df.field_k = df.field_k + 1;
                  hj.field_c = hj.field_c + ca.field_g;
                default:
                  break;
                case 7:
                  ca.field_g = ca.field_g - 1;
                  hj.field_c = hj.field_c - df.field_k;
                  if (var12 == 0) {
                    break;
                  }
                case 6:
                  df.field_k = df.field_k - 1;
                  hj.field_c = hj.field_c - ca.field_g;
                  if (var12 == 0) {
                    break;
                  }
                case 5:
                  hj.field_c = hj.field_c + df.field_k;
                  ca.field_g = ca.field_g + 1;
                  if (var12 == 0) {
                    break;
                  }
                case 1:
                  f.field_B = f.field_B - df.field_k;
                  ca.field_g = ca.field_g - 1;
                  if (var12 == 0) {
                    break;
                  }
                case 0:
                  df.field_k = df.field_k - 1;
                  f.field_B = f.field_B - ca.field_g;
                  break;
              }
              switch (var5) {
                case 1:
                  mc.field_e = mc.field_e - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  if (var12 == 0) {
                    break;
                  }
                  break;
                case 2:
                  mc.field_e = mc.field_e + ci.field_b;
                  sl.field_l = sl.field_l + 1;
                  if (var12 == 0) {
                    break;
                  }
                  break;
                case 3:
                  ci.field_b = ci.field_b + 1;
                  mc.field_e = mc.field_e + sl.field_l;
                  if (var12 == 0) {
                    break;
                  }
                  break;
                case 5:
                  ci.field_b = ci.field_b + 1;
                  lj.field_k = lj.field_k + sl.field_l;
                  if (var12 == 0) {
                    break;
                  }
                default:
                  break;
                case 7:
                  lj.field_k = lj.field_k - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  if (var12 == 0) {
                    break;
                  }
                case 6:
                  lj.field_k = lj.field_k - ci.field_b;
                  sl.field_l = sl.field_l - 1;
                  if (var12 == 0) {
                    break;
                  }
                case 4:
                  lj.field_k = lj.field_k + ci.field_b;
                  sl.field_l = sl.field_l + 1;
                  if (var12 == 0) {
                    break;
                  }
                case 0:
                  mc.field_e = mc.field_e - ci.field_b;
                  sl.field_l = sl.field_l - 1;
                  break;
              }
            }
          }
          if (this.field_D.field_r.h(9979) == 0 &&
            this.field_D.field_r.field_n < 100) {
            bm.a(rf.field_o, false, 4);
          }
          var3_int = this.field_D.b(-6133);
          if (null == fo.field_e &&
            this.field_D.field_r.h(9979) == 1) {
            bm.a(up.field_B[var3_int % up.field_B.length], false, 4);
          }
          this.field_s = this.field_s - 1;
          if (this.field_s == 0) {
            this.field_y = this.field_y + (this.field_D.field_q - this.field_N);
            this.field_s = 50;
            this.field_J = this.field_J + 1;
            this.field_N = this.field_D.field_q;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_o) {
            boolean decompiledFrameRemainder2 = true;
            var4 = -this.field_M + this.field_u;
            if ((!(this.field_z.c(true) > 0) ||
              var4 < 10) &&
              (decompiledFrameRemainder2 = !(3 >= this.field_z.c(true)))) {
              while (!(this.field_z.c(true) <= 3)) {
                this.a((pp) (this.field_z.b((byte) -43)), (byte) 11);
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              decompiledFrameRemainder2 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameCompleted0)) {
              this.a((pp) (this.field_z.b((byte) -43)), (byte) 11);
            }
            if (decompiledFrameCompleted0) {
              boolean decompiledFrameRemainder1 = true;
              var5_long = gk.a(100);
              var7_long = var5_long - this.field_j;
              var9 = (long)(-400 + 20 * var4);
              if (var9 < var7_long) {
                this.field_E = this.field_E + 0.009999999776482582f;
              }
              if (!(var9 < var7_long) ||
                var12 != 0) {
                if (var9 <= var7_long) {
                  if (this.field_E < 1.0f) {
                    this.field_E = this.field_E + 0.009999999776482582f;
                    decompiledFrameRemainder1 = (var12 != 0);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (this.field_E > 1.0f)) {
                    this.field_E = this.field_E - 0.009999999776482582f;
                    if (var12 != 0) {
                      this.field_E = this.field_E - 0.009999999776482582f;
                    }
                  }
                } else {
                  this.field_E = this.field_E - 0.009999999776482582f;
                }
              }
              var11 = -1.0f + this.field_E;
              if (var11 * var11 <= 0.00009999999747378752f) {
                this.field_E = 1.0f;
              }
              if (this.field_E > 5.0f) {
                this.field_E = 5.0f;
              }
              if (this.field_E < 0.009999999776482582f) {
                this.field_E = 0.009999999776482582f;
              }
              if (var12 != 0) {
                this.field_E = 1.0f;
              }
            }
          } else {
            this.field_E = 1.0f;
          }
          if (decompiledFrameCompleted0) {
            this.field_I = this.field_I + this.field_E;
            var4 = 0;
          }
          if (!param1) {
            this.a((mi) null, 48);
          }
          if (param0) {
            if (this.field_o &&
              il.field_a) {
            }
            if (!tf.a((byte) 43) &&
              kf.field_c == 1 &&
              this.field_B >= 0) {
              var5 = this.field_o ? 1 : 0;
              var6 = this.field_D.field_l[this.field_B].field_W;
              if (var5 != 0) {
                var6 = 0;
              }
              if (!ln.field_d.field_c) {
                var7 = (ln.field_d.field_s ^ de.field_f) % 8;
                switch (var7) {
                  case 3:
                    gi.field_u = gi.field_u - c.field_h;
                    aj.field_e = aj.field_e + 1;
                    break;
                  case 4:
                    c.field_h = c.field_h + 1;
                    pn.field_R = pn.field_R + aj.field_e;
                    break;
                  case 6:
                    pn.field_R = pn.field_R - aj.field_e;
                    c.field_h = c.field_h - 1;
                  default:
                    break;
                  case 7:
                    pn.field_R = pn.field_R - c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 5:
                    pn.field_R = pn.field_R + c.field_h;
                    aj.field_e = aj.field_e + 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 2:
                    c.field_h = c.field_h + 1;
                    gi.field_u = gi.field_u - aj.field_e;
                    if (var12 == 0) {
                      break;
                    }
                  case 1:
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 0:
                    c.field_h = c.field_h - 1;
                    gi.field_u = gi.field_u + aj.field_e;
                    break;
                }
                var7 = (ln.field_d.field_s ^ var6 + de.field_f) % 5;
                switch (var7) {
                  case 0:
                    qr.field_j = qr.field_j | sk.field_b + ki.field_c << 17;
                    break;
                  case 2:
                    sk.field_b = sk.field_b - re.field_j;
                    ki.field_c = ki.field_c - 1;
                    break;
                  case 3:
                    sk.field_b = sk.field_b + ki.field_c;
                    re.field_j = re.field_j + 1;
                  default:
                    break;
                  case 4:
                    sk.field_b = sk.field_b - ki.field_c;
                    re.field_j = re.field_j - 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 1:
                    ki.field_c = ki.field_c + 1;
                    sk.field_b = sk.field_b + re.field_j;
                    break;
                }
                var7 = (gi.field_u + de.field_f * aj.field_e) % 8;
                switch (var7) {
                  case 2:
                    df.field_k = df.field_k + 1;
                    f.field_B = f.field_B + ca.field_g;
                    break;
                  case 3:
                    ca.field_g = ca.field_g + 1;
                    f.field_B = f.field_B + df.field_k;
                    break;
                  case 5:
                    ca.field_g = ca.field_g + 1;
                    hj.field_c = hj.field_c + df.field_k;
                    break;
                  case 6:
                    df.field_k = df.field_k - 1;
                    hj.field_c = hj.field_c - ca.field_g;
                  default:
                    break;
                  case 7:
                    ca.field_g = ca.field_g - 1;
                    hj.field_c = hj.field_c - df.field_k;
                    if (var12 == 0) {
                      break;
                    }
                  case 4:
                    df.field_k = df.field_k + 1;
                    hj.field_c = hj.field_c + ca.field_g;
                    if (var12 == 0) {
                      break;
                    }
                  case 1:
                    ca.field_g = ca.field_g - 1;
                    f.field_B = f.field_B - df.field_k;
                    if (var12 == 0) {
                      break;
                    }
                  case 0:
                    f.field_B = f.field_B - ca.field_g;
                    df.field_k = df.field_k - 1;
                    break;
                }
                switch (var7) {
                  case 0:
                    mc.field_e = mc.field_e - ci.field_b;
                    sl.field_l = sl.field_l - 1;
                    if (var12 == 0) {
                      break;
                    }
                    break;
                  case 5:
                    ci.field_b = ci.field_b + 1;
                    lj.field_k = lj.field_k + sl.field_l;
                    if (var12 == 0) {
                      break;
                    }
                    break;
                  case 6:
                    sl.field_l = sl.field_l - 1;
                    lj.field_k = lj.field_k - ci.field_b;
                    if (var12 == 0) {
                      break;
                    }
                  default:
                    break;
                  case 7:
                    lj.field_k = lj.field_k - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 4:
                    lj.field_k = lj.field_k + ci.field_b;
                    sl.field_l = sl.field_l + 1;
                    if (var12 == 0) {
                      break;
                    }
                  case 3:
                    ci.field_b = ci.field_b + 1;
                    mc.field_e = mc.field_e + sl.field_l;
                    if (var12 == 0) {
                      break;
                    }
                  case 2:
                    sl.field_l = sl.field_l + 1;
                    mc.field_e = mc.field_e + ci.field_b;
                    if (var12 == 0) {
                      break;
                    }
                  case 1:
                    ci.field_b = ci.field_b - 1;
                    mc.field_e = mc.field_e - sl.field_l;
                    break;
                }
              }
            }
            var5 = 0;
            if (this.field_o) {
              if ((!il.field_a) &&
                (!tf.a((byte) 49))) {
                var6 = this.field_G.a((byte) -126);
                if (cr.field_eb[s.field_y] ||
                  cr.field_eb[am.field_t]) {
                  var5 = var5 | lp.field_B[(var6 + 0) % 4];
                }
                if (cr.field_eb[ga.field_gb] ||
                  cr.field_eb[od.field_Mb]) {
                  var5 = var5 | lp.field_B[(var6 + 2) % 4];
                }
                if (cr.field_eb[q.field_u] ||
                  cr.field_eb[pn.field_O]) {
                  var5 = var5 | lp.field_B[(5 + var6) % 4];
                }
                if (cr.field_eb[t.field_g] ||
                  cr.field_eb[ii.field_E]) {
                  var5 = var5 | lp.field_B[(var6 + 3) % 4];
                }
              }
            } else {
              var6 = this.field_G.a((byte) -126);
              if (cr.field_eb[s.field_y] ||
                cr.field_eb[am.field_t]) {
                var5 = var5 | lp.field_B[(var6 + 0) % 4];
              }
              if (cr.field_eb[ga.field_gb] ||
                cr.field_eb[od.field_Mb]) {
                var5 = var5 | lp.field_B[(var6 + 2) % 4];
              }
              if (cr.field_eb[q.field_u] ||
                cr.field_eb[pn.field_O]) {
                var5 = var5 | lp.field_B[(5 + var6) % 4];
              }
              if (cr.field_eb[t.field_g] ||
                cr.field_eb[ii.field_E]) {
                var5 = var5 | lp.field_B[(var6 + 3) % 4];
              }
            }
            var4 = this.field_C | var5 << 2;
          }
          boolean decompiledFrameRemainder3 = true;
          stackIn_469_0 = this.field_G;
          stackIn_469_1 = this.field_m;
          stackIn_469_2 = -120;
          if (this.field_o && (il.field_a ||
            tf.a((byte) 65))) {
            stackIn_472_3 = false;
            decompiledFrameRemainder3 = false;
          }
          else {
            stackIn_472_3 = true;
          }
          ((am) (Object) stackIn_469_0).a(stackIn_469_1, (byte) stackIn_469_2, stackIn_472_3, this.field_n);
          if (!this.field_D.field_r.f(17940)) {
            var4 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o) {
            this.field_C = 0;
            if (this.field_w &&
              jq.a((byte) 29) < 10 &&
              this.field_D.field_r.field_n > 100 &&
              this.field_D.field_r.h(9979) == 1) {
              this.field_w = false;
            }
            this.field_L[this.field_B] = var4;
            var5 = var3_int;
            this.field_D.a(this.field_L, 20, this.field_F);
            var3_int = this.field_D.b(-6133);
            if (var5 != var3_int &&
              var3_int < 10) {
              this.field_w = true;
              kh.a(var3_int, (byte) -84);
            }
            if (this.field_D.field_j == 0) {
              switch (var3_int) {
                case 10:
                  this.a(1220, 0, 255);
                  break;
                case 20:
                  this.a(1220, 2, 253);
                  break;
                case 30:
                  this.a(1220, 4, 251);
                  break;
                case 40:
                  this.a(1220, 6, 249);
                  break;
                case 50:
                  this.a(1220, 8, 247);
                  break;
                default:
                  break;
              }
            }
            if (this.field_D.c(-3317)) {
              if (this.field_D.field_j != 3) {
                ln.field_d.a(2, false);
                lc.field_d = false;
                an.field_c = true;
                if (var12 != 0) {
                  gj.a((byte) -78, true, am.field_n, 20);
                }
              } else {
                gj.a((byte) -78, true, am.field_n, 20);
              }
            }
            decompiledFrameRemainder0 = (var12 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_B >= 0) {
              stackIn_537_0 = this.field_a;
              stackIn_538_1 = !(param1);
              ((hd) (Object) stackIn_537_0).a(stackIn_538_1);
            }
            L108: while (true) {
              if (this.field_I >= 1.0f) {
                this.field_u = this.field_u + 1;
                this.field_I = this.field_I - 1.0f;
                if (var12 == 0) {
                  continue;
                }
              } else {
                if (this.field_B < 0) {
                  break L108;
                }
              }
              this.field_a.a(this.field_u, var4, 7829367);
              break;
            }
            this.field_C = 0;
          }
          if (this.field_o) {
            j.field_p = ol.field_D;
            if (!eo.field_o) {
              if (1 < wg.field_g) {
                j.field_p = Vertigo2.a(new String[]{Integer.toString(wg.field_g)}, ao.field_P, -127);
                if (var12 != 0) {
                  if (wg.field_g == 1) {
                    j.field_p = ci.field_c;
                    j.field_p = bl.field_q;
                  } else {
                    j.field_p = bl.field_q;
                  }
                }
              } else {
                if (wg.field_g == 1) {
                  j.field_p = ci.field_c;
                  if (var12 != 0) {
                    j.field_p = bl.field_q;
                  }
                } else {
                  j.field_p = bl.field_q;
                }
              }
            }
            var5 = tk.field_c.c(j.field_p);
            np.field_Nb = np.field_Nb + ((float)var5 - np.field_Nb) * 0.05000000074505806f;
          }
          if (!this.field_o ||
            !param0 ||
            tf.a((byte) 86) ||
            il.field_a &&
            0 <= this.field_B) {
            hj.field_g = false;
            if (var12 == 0) {
              return;
            }
          }
          hj.field_g = false;
          var5 = qe.field_W.field_t;
          if (ed.field_n >= 0 &&
            (float)ed.field_n < np.field_Nb * 2.0f &&
            gb.field_d >= (-4 - var5 + td.field_c.field_C) &&
            gb.field_d < -4 + td.field_c.field_C) {
            hj.field_g = true;
          }
          if (1 == kf.field_c &&
            hj.field_g) {
            stackIn_607_0 = !(eo.field_o);
            eo.field_o = stackIn_607_0;
            if (eo.field_o) {
              wg.field_g = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "tr.B(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        try {
          var2_int = this.field_D.b(-6133);
          if (qe.field_U.length > var2_int &&
            this.field_D.field_j == 0) {
            if (this.field_w) {
              var3 = qe.field_U[var2_int];
              var4 = 320;
              var5 = tk.field_c.a(var3, var4, 0);
              var6 = 20;
              var7 = 20;
              var8 = 170;
              rq.a(30 + var5 + 2 * var7, var4 + var6 * 2, var8 - var7, -(var4 / 2) + 320 - var6, -62, 150);
              tk.field_c.a(var3, 320 - var4 / 2, var8, var4, var5, 16777215, -1, 1, 1, 0);
              var8 = var8 + (var7 / 2 + var5);
              bi.b(320 - (var4 - 30) / 2, var8, var4 - 30, 5921370);
              if (this.field_D.field_r.field_n >= 100 &&
                1 == this.field_D.field_r.h(9979)) {
                var8 += 5;
                var4Lifetime1 = va.field_s.a(1, bg.field_a);
                va.field_s.a(bg.field_a, 16777215, -1, 320, var8 + va.field_s.field_k, 2);
              }
            }
            if (this.field_D.field_r.h(9979) == 1) {
              mo.a(true);
            }
          }
          if (param0 <= 45) {
            this.field_c = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.A(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_o) {
            throw new IllegalStateException();
          }
          uh.field_Wb.j(59, 119);
          var2_int = -114 / ((45 - param0) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.O(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
          this.field_G.c((byte) 122);
          if (param0 > -62) {
            this.field_C = 108;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tr.D(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (uh.field_Xb == null &&
            this.field_D.field_l[this.field_B].field_W > 0 &&
            !this.field_c) {
            uh.field_Xb = new vi(0, 65535, gi.field_u, pn.field_R, aj.field_e, c.field_h, new int[]{this.field_D.field_l[this.field_B].field_W});
            if (!ag.b(49)) {
              nr.a(3, -22754, uh.field_Xb);
            }
          }
          if (param0 != 0) {
            this.field_a = (hd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.E(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 16) {
          return;
        }
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tr.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 2) {
            return;
          }
          if (!this.field_o) {
            if (this.field_D.field_j == 0) {
              this.d(0);
            }
            if (!ag.b(49)) {
              if (jq.field_e == 0) {
                if (uh.field_Xb != null) {
                  var3_int = param1 ? 1 : 0;
                  gj.a((byte) -113, var3_int != 0, am.field_n, 5);
                  if (var4 == 0) {
                    return;
                  }
                }
                if (j.field_n == null) {
                  var3_int = param1 ? 1 : 0;
                  gj.a((byte) -85, var3_int != 0, am.field_n, 0);
                  if (var4 == 0) {
                    return;
                  }
                }
                var3_int = param1 ? 1 : 0;
                gj.a((byte) -100, var3_int != 0, am.field_n, 19);
                if (var4 == 0) {
                  return;
                }
              }
              var3_intLifetime3 = param1 ? 1 : 0;
              gj.a((byte) -53, var3_intLifetime3 != 0, am.field_n, 9);
              if (var4 == 0) {
                return;
              }
            }
            if (jq.field_e != 0 ||
              uh.field_Xb != null ||
              mb.field_y != null ||
              null != j.field_n) {
              var3_intLifetime1 = param1 ? 1 : 0;
              gj.a((byte) 100, var3_intLifetime1 != 0, am.field_n, 10);
              if (var4 == 0) {
                return;
              }
            }
            var3_intLifetime2 = param1 ? 1 : 0;
            gj.a((byte) 121, var3_intLifetime2 != 0, am.field_n, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "tr.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(pp param0, byte param1) {
        int fieldTemp$0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (10 < this.field_H) {
            this.field_H = 0;
            this.field_x = 0;
          }
          if (param1 != 11) {
            return;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= 10))) {
            param0.a(this.field_F, this.field_L, 32);
            fieldTemp$0 = this.field_r - 1;
            this.field_r = this.field_r - 1;
            stackIn_48_0 = fieldTemp$0;
            if (var5 == 0) {
              if (stackIn_48_0 < 0) {
                if (this.field_g &&
                  var3_int == 9 &&
                  param0.field_z != this.field_D.field_r.g(param1 ^ 116)) {
                  lf.d(param1 + 77, 0);
                  rm.b((byte) -79);
                }
                if (this.field_B >= 0 &&
                  this.field_F[this.field_B]) {
                  this.field_x = this.field_x + 1;
                }
                this.field_D.a(this.field_L, param1 ^ 31, this.field_F);
                if (this.field_B >= 0 &&
                  this.field_D.field_j == 1 &&
                  15 <= this.field_D.b(-6133) - (this.field_D.field_i ^ 4012)) {
                  this.a(param1 ^ 1231, 10, 245);
                }
                var4 = 0;
                while (!(this.field_D.field_l.length <= var4)) {
                  this.field_K[var3_int][var4].a(this.field_D.field_r.field_f[var4], 16777215);
                  var4++;
                }
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_H = this.field_H + 1;
            stackIn_48_0 = 0;
          }
          if (stackIn_48_0 <= this.field_B) {
            if (param0.b(false, this.field_B)) {
              this.field_k = this.field_a.a((byte) -17, param0.b(this.field_B, -96));
              this.field_M = 10 + this.field_k + (param0.a((byte) 76, this.field_B) - 1);
              this.field_j = gk.a(param1 ^ 52);
              if (var5 != 0) {
                this.field_M = this.field_M + (param0.a((byte) 76, this.field_B) - 1);
                this.field_j = gk.a(param1 + 83);
                this.field_M = this.field_M + 10;
              }
            } else {
              this.field_M = this.field_M + (param0.a((byte) 76, this.field_B) - 1);
              if (var5 != 0) {
                this.field_j = gk.a(param1 + 83);
                this.field_M = this.field_M + 10;
              }
            }
          } else {
            this.field_j = gk.a(param1 + 83);
            this.field_M = this.field_M + 10;
          }
          this.field_t = 0;
          this.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("tr.C(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, mp param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -25220) {
            field_O = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("tr.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        wo dupTemp$0 = null;
        boolean stackIn_214_0 = false;
        int stackIn_235_0 = 0;
        int stackIn_235_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_B >= 0) {
            var2_int = this.field_o ? 1 : 0;
            var3 = this.field_D.field_l[this.field_B].field_W;
            if (var2_int != 0) {
              var3 = 0;
            }
            if (!ln.field_d.field_c) {
              var4 = (ln.field_d.field_s ^ de.field_f) % 8;
              switch (var4) {
                case 2:
                  gi.field_u = gi.field_u - aj.field_e;
                  c.field_h = c.field_h + 1;
                default:
                  break;
                case 7:
                  aj.field_e = aj.field_e - 1;
                  pn.field_R = pn.field_R - c.field_h;
                  if (var8 == 0) {
                    break;
                  }
                case 6:
                  pn.field_R = pn.field_R - aj.field_e;
                  c.field_h = c.field_h - 1;
                  if (var8 == 0) {
                    break;
                  }
                case 5:
                  aj.field_e = aj.field_e + 1;
                  pn.field_R = pn.field_R + c.field_h;
                  if (var8 == 0) {
                    break;
                  }
                case 4:
                  pn.field_R = pn.field_R + aj.field_e;
                  c.field_h = c.field_h + 1;
                  if (var8 == 0) {
                    break;
                  }
                case 3:
                  aj.field_e = aj.field_e + 1;
                  gi.field_u = gi.field_u - c.field_h;
                  if (var8 == 0) {
                    break;
                  }
                case 1:
                  gi.field_u = gi.field_u + c.field_h;
                  aj.field_e = aj.field_e - 1;
                  if (var8 == 0) {
                    break;
                  }
                case 0:
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break;
              }
              var4 = (ln.field_d.field_s ^ de.field_f + var3) % 5;
              switch (var4) {
                case 1:
                  sk.field_b = sk.field_b + re.field_j;
                  ki.field_c = ki.field_c + 1;
                  break;
                case 2:
                  sk.field_b = sk.field_b - re.field_j;
                  ki.field_c = ki.field_c - 1;
                  break;
                case 3:
                  sk.field_b = sk.field_b + ki.field_c;
                  re.field_j = re.field_j + 1;
                default:
                  break;
                case 4:
                  re.field_j = re.field_j - 1;
                  sk.field_b = sk.field_b - ki.field_c;
                  if (var8 == 0) {
                    break;
                  }
                case 0:
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 17;
                  break;
              }
              var4 = (gi.field_u + aj.field_e * de.field_f) % 8;
              switch (var4) {
                case 2:
                  df.field_k = df.field_k + 1;
                  f.field_B = f.field_B + ca.field_g;
                  break;
                case 6:
                  df.field_k = df.field_k - 1;
                  hj.field_c = hj.field_c - ca.field_g;
                default:
                  break;
                case 7:
                  ca.field_g = ca.field_g - 1;
                  hj.field_c = hj.field_c - df.field_k;
                  if (var8 == 0) {
                    break;
                  }
                case 5:
                  ca.field_g = ca.field_g + 1;
                  hj.field_c = hj.field_c + df.field_k;
                  if (var8 == 0) {
                    break;
                  }
                case 4:
                  df.field_k = df.field_k + 1;
                  hj.field_c = hj.field_c + ca.field_g;
                  if (var8 == 0) {
                    break;
                  }
                case 3:
                  f.field_B = f.field_B + df.field_k;
                  ca.field_g = ca.field_g + 1;
                  if (var8 == 0) {
                    break;
                  }
                case 1:
                  f.field_B = f.field_B - df.field_k;
                  ca.field_g = ca.field_g - 1;
                  if (var8 == 0) {
                    break;
                  }
                case 0:
                  df.field_k = df.field_k - 1;
                  f.field_B = f.field_B - ca.field_g;
                  break;
              }
              switch (var4) {
                case 1:
                  mc.field_e = mc.field_e - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  if (var8 == 0) {
                    break;
                  }
                  break;
                case 2:
                  sl.field_l = sl.field_l + 1;
                  mc.field_e = mc.field_e + ci.field_b;
                  if (var8 == 0) {
                    break;
                  }
                  break;
                case 3:
                  ci.field_b = ci.field_b + 1;
                  mc.field_e = mc.field_e + sl.field_l;
                  if (var8 == 0) {
                    break;
                  }
                  break;
                case 4:
                  sl.field_l = sl.field_l + 1;
                  lj.field_k = lj.field_k + ci.field_b;
                  if (var8 == 0) {
                    break;
                  }
                  break;
                case 5:
                  ci.field_b = ci.field_b + 1;
                  lj.field_k = lj.field_k + sl.field_l;
                  if (var8 == 0) {
                    break;
                  }
                default:
                  break;
                case 7:
                  lj.field_k = lj.field_k - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  if (var8 == 0) {
                    break;
                  }
                case 6:
                  sl.field_l = sl.field_l - 1;
                  lj.field_k = lj.field_k - ci.field_b;
                  if (var8 == 0) {
                    break;
                  }
                case 0:
                  mc.field_e = mc.field_e - ci.field_b;
                  sl.field_l = sl.field_l - 1;
                  break;
              }
            }
          }
          if (de.field_f == 13) {
            var2_int = 1;
            if (this.field_D.field_r.field_w == 0 && (this.field_D.field_r.h(9979) == 3 ||
              4 == this.field_D.field_r.h(param0 ^ 9864))) {
              var2_int = 0;
            }
            boolean decompiledFrameRemainder4 = true;
            var3 = 1;
            if (this.field_o) {
              if (this.field_B < 0) {
                var3 = 4;
                decompiledFrameRemainder4 = (var8 != 0);
              }
              if (decompiledFrameRemainder4) {
                if (this.field_D.field_a) {
                  var3 = 3;
                  if (var8 != 0) {
                    if (1 == this.field_D.field_j) {
                      var3 = 22;
                      var3 = 2;
                    } else {
                      var3 = 2;
                    }
                  }
                } else {
                  if (1 == this.field_D.field_j) {
                    var3 = 22;
                    if (var8 != 0) {
                      var3 = 2;
                    }
                  } else {
                    var3 = 2;
                  }
                }
              }
            }
            if (var2_int != 0) {
              var4 = var3;
              gj.a((byte) 36, false, am.field_n, var4);
              return;
            }
          }
          L37: {
            if (!this.field_o &&
              ji.field_r > 0) {
              cp.field_b = cp.field_b.substring(1) + ji.field_r;
              if (cp.field_b.equalsIgnoreCase("noir")) {
                stackIn_214_0 = !(gi.field_r);
                gi.field_r = stackIn_214_0;
                var2_float = 1.399999976158142f;
                oo.b(var2_float);
                if (gi.field_r) {
                  var3 = 0;
                  L41: while (true) {
                    if (oo.field_c.length > var3) {
                      var4 = (oo.field_c[var3] & 16711680) >> 16;
                      var5 = (65280 & oo.field_c[var3]) >> 8;
                      var6 = oo.field_c[var3] & 255;
                      var7 = (var5 + (var6 + var4)) / 3;
                      stackIn_235_0 = var7;
                      stackIn_235_1 = 79;
                      if (var8 != 0) {
                        if (stackIn_235_0 > stackIn_235_1) {
                          qq.a(oo.field_c, 0, Vertigo2.field_J[var3], 0, oo.field_c.length);
                          var3++;
                          break L37;
                        }
                        break L41;
                      }
                      if (stackIn_235_0 < stackIn_235_1) {
                        oo.field_c[var3] = 0;
                      } else if (var7 < 90) {
                        oo.field_c[var3] = om.a(var7, om.a(var7 << 8, var7 << 16));
                      } else {
                        oo.field_c[var3] = 16777215;
                      }
                      var3++;
                      continue;
                    }
                    var3 = 0;
                    while (true) {
                      stackIn_235_0 = ~var3;
                      stackIn_235_1 = ~Vertigo2.field_J.length;
                      if (stackIn_235_0 <= stackIn_235_1) {
                        break;
                      }
                      qq.a(oo.field_c, 0, Vertigo2.field_J[var3], 0, oo.field_c.length);
                      var3++;
                      if (var8 != 0) {
                        break L37;
                      }
                    }
                    break;
                  }
                  if (var8 != 0) {
                    mn.a(false);
                  }
                } else {
                  mn.a(false);
                }
              }
            }
          }
          if (this.field_B < 0 &&
            1 == this.field_D.field_r.h(9979)) {
            if (s.field_y == de.field_f &&
              !eo.field_o ||
              am.field_t == de.field_f) {
              if (!this.field_G.a(true)) {
                var2_int = this.field_n;
                this.field_n = this.field_n - 1;
                if (this.field_n < 0) {
                  this.field_n = -1 + this.field_D.field_l.length;
                }
                this.field_G.a((byte) -17, var2_int, this.field_n);
                if ((var8 != 0) && ((ga.field_gb == de.field_f &&
                  !eo.field_o ||
                  de.field_f == od.field_Mb) && !this.field_G.a(true))) {
                  var2_int = this.field_n;
                  this.field_n = this.field_n + 1;
                  if (this.field_n >= this.field_D.field_l.length) {
                    this.field_n = 0;
                  }
                  this.field_G.a((byte) -17, var2_int, this.field_n);
                }
              }
            } else {
              if ((ga.field_gb == de.field_f &&
                !eo.field_o ||
                de.field_f == od.field_Mb) && !this.field_G.a(true)) {
                var2_int = this.field_n;
                this.field_n = this.field_n + 1;
                if (this.field_n >= this.field_D.field_l.length) {
                  this.field_n = 0;
                }
                this.field_G.a((byte) -17, var2_int, this.field_n);
              }
            }
          }
          if (this.field_o && (eo.field_o ||
            0 <= this.field_B)) {
            if ((!(0 > this.field_B)) &&
              (!il.field_a) &&
              (!tf.a((byte) 123))) {
              if (~tn.field_c == ~de.field_f ||
                bc.field_b == de.field_f) {
                this.field_G.a(15481);
              }
              if (ve.field_a == de.field_f ||
                ~jb.field_y == ~de.field_f) {
                this.field_G.b((byte) 119);
              }
            }
          } else {
            if (~tn.field_c == ~de.field_f ||
              bc.field_b == de.field_f) {
              this.field_G.a(15481);
            }
            if (ve.field_a == de.field_f ||
              ~jb.field_y == ~de.field_f) {
              this.field_G.b((byte) 119);
            }
          }
          if (this.field_o && (il.field_a ||
            tf.a((byte) 96))) {
            return;
          }
          if (param0 != 115) {
            return;
          }
          if (ch.field_k == de.field_f ||
            ~na.field_n == ~de.field_f) {
            this.field_C = this.field_C | 2;
          }
          if (de.field_f == ro.field_i ||
            ~om.field_B == ~de.field_f) {
            this.field_C = this.field_C | 1;
          }
          if (~de.field_f == ~ga.field_fb) {
            this.field_D.e(-4);
          }
          if (this.field_A &&
            de.field_f == 59 &&
            this.field_D.field_j == 3) {
            ci.field_b = 0;
            mc.field_e = 0;
            lj.field_k = 0;
            sl.field_l = 0;
            dh.a(this.field_D.field_e, this.field_D.field_l[0].field_H, true);
            gj.a((byte) -66, false, am.field_n, 20);
          }
          if (this.field_A) {
            L72: {
              L73: {
                L74: {
                  L75: {
                    boolean decompiledFrameRemainder3 = true;
                    boolean decompiledFrameRemainder2 = true;
                    boolean decompiledFrameRemainder1 = true;
                    boolean decompiledFrameRemainder0 = true;
                    var2_int = lp.h(param0 - 114);
                    var3 = var2_int;
                    if (0 == var3 &&
                      var8 == 0) {
                      this.field_D.a(30113, false);
                      return;
                    } else {
                      if ((1 != var3) &&
                        (decompiledFrameRemainder0 = (var3 != 2 ||
                        var8 != 0)) &&
                        (decompiledFrameRemainder1 = (var3 != 3 ||
                        var8 != 0)) &&
                        (decompiledFrameRemainder2 = (var3 != 4 ||
                        var8 != 0)) &&
                        (decompiledFrameRemainder3 = (var3 != 5 ||
                        var8 != 0))) {
                        switch (var3) {
                          case 6:
                            break L75;
                          case 7:
                            break L74;
                          case 8:
                            break L73;
                          case 9:
                            break L72;
                          default:
                            return;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      if (this.field_o) {
                        return;
                      }
                      this.field_D.field_l[this.field_B].l((byte) -89);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1)) {
                      if (this.field_o) {
                        return;
                      }
                      this.field_D.field_l[this.field_B].d((byte) 4);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2)) {
                      if (this.field_o) {
                        return;
                      }
                      dupTemp$0 = this.field_D.field_l[this.field_B];
                      dupTemp$0.field_g = dupTemp$0.field_g + 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if (decompiledFrameRemainder3) {
                      mr.a((byte) -68);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    kq.a((byte) -40);
                    if (var8 == 0) {
                      return;
                    }
                  }
                  m.d(param0 + 5, 20, 300);
                  if (var8 == 0) {
                    return;
                  }
                }
                tk.a(param0 ^ -116, 0, 0, il.field_e, wo.field_S);
                if (var8 == 0) {
                  return;
                }
              }
              va.a(20, (byte) 125);
              if (var8 == 0) {
                return;
              }
            }
            va.a(50, (byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "tr.I(" + param0 + ')');
        }
    }

    final void a(mi param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_D.a(param0, (byte) 102);
          if (param1 < 99) {
            this.b(-118, -59);
          }
          this.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("tr.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, pp param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -this.field_M + this.field_u &&
            this.field_z.a(false)) {
            this.a(param1, (byte) 11);
            return;
          }
          this.field_z.a(param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("tr.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1) {
        boolean stackIn_37_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_171_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        rn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        rn[] var4 = null;
        int var5 = 0;
        wo var6_ref_wo = null;
        int var6 = 0;
        int var7_int = 0;
        wo var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        rn var9_ref_rn = null;
        int var9 = 0;
        rn var10_ref_rn = null;
        int var10 = 0;
        int var11_int = 0;
        Runtime var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var4_intLifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11_intLifetime1;
        int var7_intLifetime1Lifetime1;
        int var8Lifetime2Lifetime1;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!mf.a((byte) 126, 512)) {
            this.field_m.a(false, this.field_D.field_r);
          }
          boolean decompiledFrameCompleted1 = true;
          if (!mf.a((byte) 126, 64)) {
            var3_int = 0;
            do {
              if (var3_int >= this.field_q.length) {
                var3_int = this.field_M;
                break;
              }
              this.field_q[var3_int] = 0;
              var3_int++;
            } while (var14 == 0);
            while (this.field_u > var3_int) {
              stackIn_37_0 = mf.a((byte) 126, 512);
              if (var14 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_37_0) {
                break;
              }
              if (this.field_B >= 0) {
                var4_int = this.field_a.a(true, var3_int);
                if (var4_int == -1 &&
                  this.field_B >= 0 &&
                  var14 == 0) {
                  break;
                }
                this.field_q[this.field_B] = var4_int;
              }
              var4_intLifetime1 = 0;
              if (this.field_v < var3_int) {
                this.field_v = var3_int;
                var4_intLifetime1 = 1;
              }
              this.field_m.a(false, this.field_p, 128, this.field_q, var4_intLifetime1 != 0);
              var3_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_37_0 = this.field_o;
          }
          if (stackIn_37_0 &&
            1 == this.field_m.h(param1 ^ -9953)) {
            var3_int = this.field_t;
            if (var3_int >= 10) {
              var3_int = 9;
            }
            this.field_m.a(this.field_K[var3_int], this.field_B, param1 - 22719);
          }
          var3 = this.field_D.field_r.m(9384);
          var4 = this.field_m.m(param1 ^ -9396);
          var5 = 0;
          while (true) {
            stackIn_46_0 = this.field_D.field_l.length;
            stackIn_46_1 = var5;
            if (stackIn_46_0 > stackIn_46_1) {
              stackIn_74_0 = ~var5;
              stackIn_74_1 = ~this.field_B;
              if (var14 == 0) {
                if (stackIn_74_0 != stackIn_74_1) {
                  var6_ref_wo = this.field_D.field_l[var5];
                  var7_int = 0;
                  while (var7_int < 9) {
                    var8 = var6_ref_wo.field_P[var7_int];
                    stackIn_46_0 = ~var8;
                    stackIn_46_1 = -1;
                    if (stackIn_46_0 <= stackIn_46_1 &&
                      var8 < var4.length) {
                      var9_ref_rn = var3[var8];
                      if (var9_ref_rn != null) {
                        var10_ref_rn = var4[var8];
                        if (var10_ref_rn != null) {
                          var11_int = -var9_ref_rn.field_l + var6_ref_wo.field_E;
                          var12 = -var9_ref_rn.field_g + var6_ref_wo.field_y;
                          var13 = -var9_ref_rn.field_s + var6_ref_wo.field_k;
                          this.field_m.field_f[var5].field_E = var11_int + var10_ref_rn.field_l;
                          this.field_m.field_f[var5].field_y = var12 + var10_ref_rn.field_g;
                          this.field_m.field_f[var5].field_k = var10_ref_rn.field_s + var13;
                          break;
                        }
                      }
                    }
                    var7_int++;
                  }
                }
                var5++;
                continue;
              }
            } else {
              stackIn_74_0 = kn.field_h[this.field_D.field_j].length;
              stackIn_74_1 = this.field_D.field_e + this.field_D.field_c;
            }
            if (stackIn_74_0 <= stackIn_74_1) {
              stackIn_78_0 = kn.field_h[this.field_D.field_j].length;
            } else {
              stackIn_78_0 = this.field_D.field_e + this.field_D.field_c;
            }
            var5 = stackIn_78_0;
            var6 = this.field_D.b(-6133);
            this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (-this.field_D.field_e + var6), true, this.field_m, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
            this.field_t = this.field_t + 1;
            if (param1 != -28) {
              this.field_J = -79;
            }
            if (mf.a((byte) 126, 128)) {
              if (this.field_b == null) {
                this.field_b = new er(640, 480);
              }
              this.field_b.d();
              this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (var6 - this.field_D.field_e), true, this.field_D.field_r, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
              ro.field_g.a(-125);
              this.field_b.d(0, 0, 128);
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_o) {
              var7_intLifetime1 = 0;
              while (!(this.field_D.field_z <= var7_intLifetime1)) {
                stackIn_163_0 = ~var7_intLifetime1;
                stackIn_163_1 = ~this.field_B;
                if (var14 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                boolean decompiledFrameRemainder4 = true;
                if (stackIn_163_0 != stackIn_163_1) {
                  var8_ref_String = this.field_D.field_w[var7_intLifetime1];
                  if (0 != (1 << var7_intLifetime1 & this.field_h)) {
                    if ((1 << var7_intLifetime1 & this.field_D.field_u) != 0) {
                      var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, kd.field_m, 121);
                    } else {
                      var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, mn.field_p, -115);
                    }
                  } else if (0 == (1 << var7_intLifetime1 & this.field_D.field_t)) {
                    if ((1 << var7_intLifetime1 & this.field_D.field_u) != 0) {
                      var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, ca.field_e, param1 ^ -109);
                    } else {
                      decompiledFrameRemainder4 = !(this.field_D.field_a);
                      if ((decompiledFrameRemainder4) &&
                        (decompiledFrameRemainder4 = (0 != (this.field_D.field_d & 1 << var7_intLifetime1) ||
                        var14 != 0))) {
                        var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, mo.field_c, -120);
                      }
                    }
                  } else if (this.field_i) {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, me.field_d, param1 ^ 19);
                  } else {
                    var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, gn.field_e, 9);
                  }
                } else if ((1 << var7_intLifetime1 & this.field_D.field_t) != 0) {
                  if (this.field_i) {
                    var8_ref_String = ue.field_H;
                  } else {
                    var8_ref_String = bm.field_A;
                  }
                } else if (0 == (1 << var7_intLifetime1 & this.field_D.field_u)) {
                  decompiledFrameRemainder4 = !(this.field_D.field_a);
                  if ((decompiledFrameRemainder4) &&
                    (decompiledFrameRemainder4 = (0 != (this.field_D.field_d & 1 << var7_intLifetime1) ||
                    var14 != 0))) {
                    var8_ref_String = rb.field_b;
                  }
                } else {
                  var8_ref_String = cd.field_c;
                }
                if (decompiledFrameRemainder4) {
                  va.field_s.a(616, param1 ^ 65, 16777215, var7_intLifetime1 * 14 + 140, -1, var8_ref_String);
                }
                var7_intLifetime1++;
              }
            }
            if (decompiledFrameCompleted0) {
              if (param0) {
                this.c(param1 ^ -112);
              }
              decompiledFrameRemainder2 = (this.field_o);
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0 = (!(hj.field_g) ||
                !(param0))) &&
                (decompiledFrameRemainder1 = !(wg.field_g <= 0))) {
                stackIn_163_0 = ~(rg.field_f % 40);
                stackIn_163_1 = -21;
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              decompiledFrameRemainder1 = !(stackIn_163_0 <= stackIn_163_1);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              stackIn_167_0 = 1;
              decompiledFrameRemainder3 = false;
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              stackIn_167_0 = 0;
            }
            if (decompiledFrameRemainder2) {
              var7_intLifetime1Lifetime1 = stackIn_167_0;
              var8Lifetime1 = 15;
              var9 = var8Lifetime1 * 2 + (int)np.field_Nb;
              var10 = var8Lifetime1 * 2 + tk.field_c.field_z;
              va.field_s.b(93);
              qi.a(false, 25, var9, 3 + td.field_c.field_C - var10);
              stackIn_171_0 = (var7_intLifetime1Lifetime1 != 0) ? 14586368 : 16777215;
              var11_intLifetime1 = stackIn_171_0;
              va.field_s.a(j.field_p, var11_intLifetime1, -1, var8Lifetime1 + ((int)np.field_Nb / 2 + 25), td.field_c.field_C - var8Lifetime1, 2);
            }
            var7 = this.field_D.field_l[this.field_n];
            if (null != va.field_s &&
              0 <= this.field_n &&
              var7 != null) {
              var8Lifetime2 = 20;
              var9Lifetime1 = 16;
              var10Lifetime1 = 440;
              if (mf.a((byte) 126, 1)) {
                tk.field_c.a("Position:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_E), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_y), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_k), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              if (mf.a((byte) 126, 2)) {
                tk.field_c.a("Current Cell:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_E / 128), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_y / 128), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(var7.field_k / 240), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              if (mf.a((byte) 126, 4)) {
                tk.field_c.a("FPS:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a(Integer.toString(li.field_d), var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              if (mf.a((byte) 126, 8)) {
                tk.field_c.a("Memory:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                var11 = Runtime.getRuntime();
                tk.field_c.a("Total: " + var11.totalMemory() / 1000L, var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Used: " + var11.freeMemory() / 1000L, var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              if (mf.a((byte) 126, 16)) {
                tk.field_c.a("Predictions:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Predicitons per frame: " + (this.field_u - this.field_M), var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Keys Out Packets: " + this.field_a.a(16777215), var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                if (this.field_J > 0) {
                  tk.field_c.a("Auth Updates/Sec: " + this.field_y / this.field_J, var10Lifetime1, var8Lifetime2, 65280, -1);
                }
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                if (0 < this.field_z.c(true)) {
                  tk.field_c.a("Auth Packets delayed: " + this.field_z.c(true), var10Lifetime1, var8Lifetime2, 65280, -1);
                }
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Gameupdates per tic: " + (int)(0.5f + this.field_E), var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                if (this.field_H > 0) {
                  tk.field_c.a("Avg Dont updates: " + this.field_x / this.field_H, var10Lifetime1, var8Lifetime2, 65280, -1);
                }
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              if (mf.a((byte) 126, 256)) {
                tk.field_c.a("Player Details:", var10Lifetime1, var8Lifetime2, 16777215, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Fall: " + var7.c((byte) -128), var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("vx: " + var7.field_c, var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("vx: " + var7.field_O, var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("On Block: " + var7.field_z, var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
                tk.field_c.a("Stuck: " + var7.field_N, var10Lifetime1, var8Lifetime2, 65280, -1);
                var8Lifetime2 = var8Lifetime2 + var9Lifetime1;
              }
              var8Lifetime2Lifetime1 = 480;
              if (mf.a((byte) 126, 32)) {
                this.field_a.a(this.field_M, 20, (byte) 51, var8Lifetime2Lifetime1, 30);
              }
            }
            va.b(127);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3_ref), "tr.Q(" + param0 + ',' + param1 + ')');
        }
    }

    tr(boolean param0, String[] param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        boolean stackIn_4_1 = false;
        wo[] stackIn_33_0;
        int stackIn_33_1;
        wo stackIn_33_2;
        wo stackIn_33_3;
        int stackIn_33_4;
        boolean stackIn_33_5;
        int stackIn_33_6;
        boolean stackIn_33_7;
        wo stackIn_34_2 = null;
        wo stackIn_34_3 = null;
        boolean stackIn_34_8 = false;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        this.field_I = 0.0f;
        this.field_c = false;
        this.field_E = 1.0f;
        try {
          this.field_o = param0;
          this.field_i = param3;
          stackIn_4_1 = !(2 > fn.field_z);
          this.field_A = stackIn_4_1;
          this.field_B = param2;
          jq.field_e = 0;
          qr.field_j = 0;
          hj.field_c = 2035;
          f.field_B = 43310;
          ki.field_c = 126;
          re.field_j = 8522;
          sk.field_b = 42354;
          lj.field_k = 1986;
          mc.field_e = 1951;
          sl.field_l = 1954;
          ci.field_b = 1982;
          aj.field_e = 5180;
          pn.field_R = 617;
          c.field_h = 9170;
          gi.field_u = 8768;
          df.field_k = 2127;
          ca.field_g = 1220;
          var9_int = t.field_l;
          t.field_l = 0;
          var10 = var9_int;
          var11 = rg.field_f % 4;
          var12 = (-t.field_l + var10) * 4;
          t.field_l = var10;
          switch (var11) {
            case 1:
              var13 = var12 / 3;
              hj.field_c = hj.field_c + var13;
              f.field_B = f.field_B + (var12 - var13);
            default:
              break;
            case 3:
              hj.field_c = hj.field_c + var12;
              if (var14 == 0) {
                break;
              }
            case 2:
              f.field_B = f.field_B + var12;
              if (var14 == 0) {
                break;
              }
            case 0:
              var13 = var12 / 2;
              hj.field_c = hj.field_c + (var12 - var13);
              f.field_B = f.field_B + var13;
              break;
          }
          this.field_D = new lj(param1, this.field_B, param4, param5, param6, param7, false, param3);
          this.field_m = this.field_D.c((byte) -116);
          this.field_G = new am(param4, this.field_D.field_l.length, param1);
          var9_int = param1.length;
          this.field_a = new hd(this.field_B, var9_int);
          this.field_K = new wo[10][var9_int];
          this.field_p = new boolean[var9_int];
          this.field_q = new int[var9_int];
          this.field_F = new boolean[var9_int];
          this.field_L = new int[var9_int];
          var10 = 0;
          while (true) {
            if (var10 < var9_int) {
              stackIn_37_0 = 0;
              if (var14 == 0) {
                var11 = stackIn_37_0;
                while (10 > var11) {
                  stackIn_33_0 = this.field_K[var11];
                  stackIn_33_1 = var10;
                  stackIn_33_2 = null;
                  stackIn_33_3 = null;
                  stackIn_33_4 = this.field_D.field_l[var10].field_l;
                  stackIn_33_5 = false;
                  stackIn_33_6 = var10;
                  stackIn_33_7 = this.field_o;
                  if (param4 != 2) {
                    stackIn_34_2 = null;
                    stackIn_34_3 = null;
                    stackIn_34_8 = false;
                  } else {
                    stackIn_34_2 = null;
                    stackIn_34_3 = null;
                    stackIn_34_8 = true;
                  }
                  stackIn_33_0[stackIn_33_1] = new wo(stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, stackIn_34_8, true);
                  var11++;
                }
                var10++;
                continue;
              }
            } else {
              stackIn_37_0 = -1;
            }
            break;
          }
          if (stackIn_37_0 >= ~this.field_B) {
            this.field_n = this.field_B;
          }
          this.field_s = 50;
          if (param4 == 0 &&
            param6 < 10) {
            this.field_w = true;
            kh.a(param6, (byte) -84);
          }
          this.field_z = new nj();
          this.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_53_0 = var9;
          stackIn_53_1 = new StringBuilder().append("tr.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_e = "<col=DE9200>Compete</col>";
        field_d = "This game option is only available to members.";
        field_O = "Friends can be added in multiplayer<nbsp>games";
    }
}
