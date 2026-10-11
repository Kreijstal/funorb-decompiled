/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private long[] field_k;
    private int field_e;
    static volatile boolean field_a;
    private long[] field_f;
    static String field_n;
    private int field_d;
    static long field_j;
    static String field_i;
    private long[] field_o;
    private long[] field_m;
    private byte[] field_h;
    private long[] field_c;
    static String field_b;
    static int[] field_g;
    private byte[] field_l;

    final void a(byte param0, byte[] param1, long param2) {
        int stackIn_27_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 < 2) {
            vc.b(101);
          }
          var5_int = 0;
          var6 = 7 & 8 - ((int)param2 & 7);
          var7 = 7 & this.field_e;
          var9 = param2;
          var11 = 31;
          var12 = 0;
          L2: while (true) {
            if (var11 >= 0) {
              var12 = var12 + ((this.field_l[var11] & 255) + (255 & (int)var9));
              this.field_l[var11] = (byte)var12;
              var12 = var12 >>> 8;
              var9 = var9 >>> 8;
              var11--;
              if (var13 == 0) {
                continue;
              }
            } else {
              while (param2 > 8L) {
                var8 = 255 & param1[var5_int] << var6 | (255 & param1[var5_int + 1]) >>> -var6 + 8;
                stackIn_27_0 = var8;
                if (var13 != 0) {
                  break L2;
                }
                if (stackIn_27_0 >= 0 &&
                  var8 < 256) {
                  this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], var8 >>> var7);
                  this.field_d = this.field_d + 1;
                  this.field_e = this.field_e + (8 - var7);
                  if (this.field_e == 512) {
                    this.a(false);
                    this.field_e = 0;
                    this.field_d = 0;
                  }
                  this.field_h[this.field_d] = (byte)vi.a(var8 << 8 - var7, 255);
                  param2 = param2 - 8L;
                  var5_int++;
                  this.field_e = this.field_e + var7;
                  continue;
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
            stackIn_27_0 = $cfr$lcmp(param2, 0L);
            break;
          }
          if (stackIn_27_0 > 0) {
            var8 = 255 & param1[var5_int] << var6;
            this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], var8 >>> var7);
          }
          if (stackIn_27_0 <= 0 ||
            var13 != 0) {
            var8 = 0;
          }
          if (param2 + (long)var7 >= 8L) {
            this.field_d = this.field_d + 1;
            param2 = param2 - (long)(-var7 + 8);
            this.field_e = this.field_e + (-var7 + 8);
            if (this.field_e == 512) {
              this.a(false);
              this.field_e = 0;
              this.field_d = 0;
            }
            this.field_h[this.field_d] = (byte)vi.a(var8 << 8 - var7, 255);
            this.field_e = this.field_e + (int)param2;
            if (var13 == 0) {
              return;
            }
          }
          this.field_e = (int)((long)this.field_e + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("vc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        ti stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ti stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        se var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ti var6 = null;
        String var6_ref = null;
        String var7 = null;
        ti var7_ref = null;
        String var8 = null;
        ti var8_ref = null;
        int var9 = 0;
        Object var4Lifetime1;
        String var5_ref_StringLifetime1;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          var3 = 50 / ((23 - param0) / 46);
          var1 = cd.field_t;
          var2 = var1.b((byte) 90);
          if (var2 == 0) {
            if (qb.field_a == null) {
              qb.field_a = new k(128);
              rl.field_e = 0;
            }
            stackIn_12_0 = (1 != var1.b((byte) 90)) ? 0 : 1;
            var4_int = stackIn_12_0;
            var5_ref_String = var1.g(2);
            if (var4_int != 0) {
              var1.g(2);
            }
            var6 = tg.a(var5_ref_String, 256);
            var7 = var1.g(2);
            var8 = ua.a(-74, (CharSequence) ((Object) var5_ref_String));
            if (var8 == null) {
              var8 = var5_ref_String;
            }
            if (var6 == null) {
              var6 = tg.a(var7, 256);
              if (null != var6) {
                qb.field_a.a(-1, var6, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new ti();
              qb.field_a.a(-1, var6, (long)var8.hashCode());
              fieldTemp$0 = rl.field_e;
              rl.field_e = rl.field_e + 1;
              var6.field_ab = fieldTemp$0;
              ii.field_c.a(-109, var6);
            }
            var6.field_db = var5_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (ob.field_H == 1) {
                ob.field_H = 2;
              }
              return;
            }
            if (3 == var2) {
              if (ob.field_H == 2) {
                ob.field_H = 1;
              }
              return;
            }
            if (4 != var2) {
              pe.a((byte) -13, (Throwable) null, "F1: " + sj.b(true));
              th.a(113);
              return;
            }
            ob.field_H = 1;
            var4 = var1.g(2);
            uc.field_r = ((String) (var4)).intern();
            var5 = var1.b((byte) 90);
            lb.a(true, var5);
            return;
          }
          if (null == ge.field_c) {
            ge.field_c = new k(128);
            tl.field_a = 0;
          }
          var4Lifetime1 = var1.g(2);
          if (((String) (var4Lifetime1)).equals("")) {
            var4Lifetime1 = null;
          }
          var5_ref_StringLifetime1 = var1.g(2);
          var6_ref = var1.g(2);
          var7_ref = gi.a(var5_ref_StringLifetime1, -52);
          if (null == var7_ref) {
            var7_ref = gi.a(var6_ref, -71);
            if (null != var7_ref) {
              ge.field_c.a(-1, var7_ref, (long)ua.a(-92, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode());
            }
          }
          if (null == var7_ref) {
            var7_ref = new ti();
            ge.field_c.a(-1, var7_ref, (long)ua.a(-94, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = tl.field_a;
            tl.field_a = tl.field_a + 1;
            var7_ref.field_ab = fieldTemp$1;
            lf.field_b.a(-107, var7_ref);
          }
          if (var4Lifetime1 != null) {
            var4Lifetime1 = ((String) (var4Lifetime1)).intern();
          }
          var7_ref.field_Z = (String) (var4Lifetime1);
          var7_ref.field_db = var5_ref_StringLifetime1;
          var7_ref.b(57);
          var8_ref = (ti) (lf.field_b.b((byte) 126));
          L13: while (true) {
            if (var8_ref != null) {
              stackIn_59_0 = var7_ref;
              stackIn_59_1 = 100;
              stackIn_59_2 = var8_ref;
              if (var9 != 0) {
                break L13;
              }
              if (oj.a(stackIn_59_0, stackIn_59_1, stackIn_59_2)) {
                var8_ref = (ti) (lf.field_b.d(853));
                continue;
              }
            }
            if (null == var8_ref) {
              lf.field_b.a(-96, var7_ref);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_59_0 = var7_ref;
            stackIn_59_1 = -65;
            stackIn_59_2 = var8_ref;
            break;
          }
          vk.$cfr$intArgs$a$0b89e0d19fbb(stackIn_59_0, stackIn_59_1, stackIn_59_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "vc.E(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = 0;
          while (var2_int < 32) {
            this.field_l[var2_int] = (byte) 0;
            var2_int++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          var3 = -126 / ((param0 - 59) / 36);
          this.field_h[0] = (byte) 0;
          this.field_e = 0;
          this.field_d = 0;
          var2_intLifetime1 = 0;
          while (var2_intLifetime1 < 8) {
            this.field_k[var2_intLifetime1] = 0L;
            var2_intLifetime1++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) runtimeException), "vc.F(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_i = null;
          field_g = null;
          if (param0 <= 68) {
            field_b = (String) null;
          }
          field_b = null;
          field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "vc.D(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int stackIn_33_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_33_0Lifetime1;
        int stackIn_52_0Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          do {
            if (8 <= var2_int) {
              if (param0) {
                vc.a((byte) -46);
              }
              break;
            }
            this.field_m[var2_int] = j.a(j.a(j.a(bm.a((long)this.field_h[var3 + 5], 255L) << 16, j.a(j.a(bm.a(255L, (long)this.field_h[3 + var3]) << 32, j.a(j.a(bm.a((long)this.field_h[1 + var3] << 48, 71776119061217280L), (long)this.field_h[var3] << 56), bm.a(280375465082880L, (long)this.field_h[var3 + 2] << 40))), bm.a((long)this.field_h[var3 + 4], 255L) << 24)), bm.a((long)this.field_h[6 + var3], 255L) << 8), bm.a((long)this.field_h[7 + var3], 255L));
            var3 += 8;
            var2_int++;
          } while (var6 == 0);
          var2_int = 0;
          do {
            if (var2_int >= 8) {
              var2_int = 1;
              break;
            }
            dupTemp$0 = this.field_k[var2_int];
            arrayValue$1 = this.field_m[var2_int];
            this.field_o[var2_int] = dupTemp$0;
            this.field_c[var2_int] = j.a(arrayValue$1, dupTemp$0);
            var2_int++;
          } while (var6 == 0);
          L6: while (true) {
            if (var2_int <= 10) {
              stackIn_61_0 = 0;
              if (var6 != 0) {
                break L6;
              }
              var3 = stackIn_61_0;
              while (var3 < 8) {
                this.field_f[var3] = 0L;
                var4 = 0;
                stackIn_33_0 = 56;
                var5 = stackIn_33_0;
                while (var4 < 8) {
                  this.field_f[var3] = j.a(this.field_f[var3], nd.field_c[var4][vi.a((int)(this.field_o[vi.a(-var4 + var3, 7)] >>> var5), 255)]);
                  var4++;
                  var5 -= 8;
                }
                var3++;
              }
              stackIn_33_0Lifetime1 = 0;
              var3 = stackIn_33_0Lifetime1;
              while (var3 < 8) {
                this.field_o[var3] = this.field_f[var3];
                var3++;
              }
              this.field_o[0] = j.a(this.field_o[0], nd.field_d[var2_int]);
              var3 = 0;
              while (var3 < 8) {
                this.field_f[var3] = this.field_o[var3];
                var4Lifetime1 = 0;
                stackIn_52_0 = 56;
                var5Lifetime1 = stackIn_52_0;
                while (var4Lifetime1 < 8) {
                  this.field_f[var3] = j.a(this.field_f[var3], nd.field_c[var4Lifetime1][vi.a((int)(this.field_c[vi.a(var3 - var4Lifetime1, 7)] >>> var5Lifetime1), 255)]);
                  var5Lifetime1 -= 8;
                  var4Lifetime1++;
                }
                var3++;
              }
              stackIn_52_0Lifetime1 = 0;
              var3 = stackIn_52_0Lifetime1;
              while (var3 < 8) {
                this.field_c[var3] = this.field_f[var3];
                var3++;
              }
              var2_int++;
              continue L6;
            }
            stackIn_61_0 = 0;
            break;
          }
          var2_int = stackIn_61_0;
          while (8 > var2_int) {
            this.field_k[var2_int] = j.a(this.field_k[var2_int], j.a(this.field_c[var2_int], this.field_m[var2_int]));
            var2_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "vc.B(" + param0 + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2, String param3, boolean param4, String param5) {
        try {
          int stackIn_8_0 = 0;
          int stackIn_55_0 = 0;
          int stackIn_58_0 = 0;
          boolean stackIn_74_0 = false;
          boolean stackIn_78_0 = false;
          int stackIn_124_0 = 0;
          int stackIn_136_0 = 0;
          int stackIn_142_0 = 0;
          int stackIn_156_0 = 0;
          int stackIn_159_0 = 0;
          RuntimeException stackIn_163_0 = null;
          StringBuilder stackIn_163_1 = null;
          String stackIn_164_2 = null;
          StringBuilder stackIn_167_1 = null;
          String stackIn_168_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var6_intLifetime3;
          var9 = OrbDefence.field_D ? 1 : 0;
          try {
            if (null == p.field_d) {
              var6_int = fg.a(param4, -66) ? 1 : 0;
              if (var6_int == 0) {
                stackIn_8_0 = -1;
                return stackIn_8_0;
              }
            }
            if (dh.field_bb == sk.field_E) {
              if (!param4) {
                s.field_A = sj.a(true, param3, false, param5);
              }
              if (param4 ||
                var9 != 0) {
                s.field_A = f.a(false, p.field_c, (String) null, 17470, param5);
              }
              uk.field_b.field_i = 0;
              uk.field_b.a(14, -111);
              uk.field_b.a(s.field_A.a(10277).field_c, -53);
              bh.a(-1, -1);
              dh.field_bb = nh.field_c;
            }
            if (nh.field_c == dh.field_bb &&
              va.a(true, 1)) {
              var6_intLifetime1 = cd.field_t.b((byte) 90);
              if (0 == var6_intLifetime1) {
                dh.field_bb = wh.field_c;
              }
              if (0 != var6_intLifetime1 ||
                var9 != 0) {
                ab.field_l = var6_intLifetime1;
                tf.field_c = -1;
                dh.field_bb = hf.field_l;
              }
              cd.field_t.field_i = 0;
            }
            if (wh.field_c == dh.field_bb &&
              va.a(true, 8)) {
              tg.field_a = cd.field_t.c((byte) -89);
              cd.field_t.field_i = 0;
              lg.a(3, param1, s.field_A, param4, param0);
              dh.field_bb = da.field_m;
            }
            if (da.field_m == dh.field_bb &&
              va.a(true, 1)) {
              var6_intLifetime2 = cd.field_t.b((byte) 90);
              cd.field_t.field_i = 0;
              ug.field_r = null;
              ab.field_l = var6_intLifetime2;
              if (var6_intLifetime2 == 0 ||
                var6_intLifetime2 == 1) {
                dh.field_bb = lm.field_e;
                tf.field_c = -1;
              }
              if (var6_intLifetime2 != 0 &&
                var6_intLifetime2 != 1 || var9 != 0) {
                if (var6_intLifetime2 != 8) {
                  dh.field_bb = hf.field_l;
                  tf.field_c = -1;
                }
                if (var6_intLifetime2 == 8 ||
                  var9 != 0) {
                  th.a(127);
                  ea.field_a = false;
                  stackIn_55_0 = var6_intLifetime2;
                  return stackIn_55_0;
                }}}
            if (param2 >= -18) {
              stackIn_58_0 = 87;
              return stackIn_58_0;
            }
            if (dh.field_bb == lm.field_e &&
              ce.a(-60)) {
              p.field_c = cd.field_t.c((byte) -89);
              va.field_d = cd.field_t.b((byte) 90);
              cd.field_t.b((byte) 90);
              tc.field_b = cd.field_t.j(98203176);
              var6 = cd.field_t.i(-1);
              var7 = cd.field_t.b((byte) 90);
              if ((var7 & 1) != 0) {
                gd.a((byte) 124);
              }
              if (!param4) {
                stackIn_74_0 = ((8 & var7) != 0);
                pc.field_Z = stackIn_74_0;
                stackIn_78_0 = ((4 & var7) != 0);
                jd.field_b = stackIn_78_0;
                if (pc.field_Z) {
                }
              }
              boolean decompiledFrameCompleted0 = true;
              if (mg.field_g) {
                cd.field_t.b((byte) 90);
                cd.field_t.b((byte) 90);
                cd.field_t.l(0);
                cf.field_c = cd.field_t.j(98203176);
                ij.field_h = new byte[cf.field_c];
                var8 = 0;
                while (!(cf.field_c <= var8)) {
                  ij.field_h[var8] = cd.field_t.d(-20398);
                  var8++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                gb.field_h = cd.field_t.g(2);
                sg.field_E = ua.a(90, (CharSequence) ((Object) gb.field_h));
                cb.field_j = cd.field_t.b((byte) 90);
                dh.field_bb = da.field_r;
              }
              if (s.field_A.a(10277) != ci.field_b) {
                if (s.field_A.a(10277) == oj.field_j) {
                  vh.field_s.a(12423, uj.b((byte) -120));
                  if (var9 != 0) {
                    mj.field_l.a(12423, uj.b((byte) -120));
                  }
                }
              } else {
                mj.field_l.a(12423, uj.b((byte) -120));
              }
              ea.field_a = false;
              if (null != var6) {
                kb.a(uj.b((byte) -120), false, var6);
              }
              L23: {
                if (0 >= tc.field_b &&
                  !jd.field_b) {
                  try {
                    gm.a(-31183, "unzap", uj.b((byte) -120));
                    decompiledRegionSelector0 = 0;
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8_ref_Throwable = decompiledCaughtException;
                    if (var9 == 0) {
                      decompiledRegionSelector0 = 0;
                    } else {
                      decompiledRegionSelector0 = 1;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L23;
                  }
                }
                try {
                  gm.a(true, "zap", new Object[]{jj.a(14461, p.field_c)}, uj.b((byte) -120));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (tc.field_b > 0) {
                jc.field_b = true;
              }
              uk.field_b.b(og.field_n, 3777);
              var8 = 0;
              do {
                if (4 <= var8) {
                  cd.field_t.b(og.field_n, 3777);
                  break;
                }
                og.field_n[var8] = og.field_n[var8] + 50;
                var8++;
              } while (var9 == 0);
              stackIn_124_0 = ab.field_l;
              return stackIn_124_0;
            }
            if (hf.field_l == dh.field_bb &&
              ce.a(-114)) {
              th.a(114);
              if (7 == ab.field_l &&
                !ea.field_a) {
                ea.field_a = true;
                stackIn_136_0 = -1;
                return stackIn_136_0;
              }
              if (ab.field_l == 7) {
                ab.field_l = 3;
              }
              kk.field_Y = cd.field_t.g(2);
              ea.field_a = false;
              stackIn_142_0 = ab.field_l;
              return stackIn_142_0;
            }
            if (null == p.field_d) {
              if (ea.field_a) {
                if (30000L < ed.b(-1)) {
                  kk.field_Y = ee.field_c;
                  if (var9 != 0) {
                    kk.field_Y = dj.field_j;
                  }
                } else {
                  kk.field_Y = dj.field_j;
                }
                ea.field_a = false;
                stackIn_156_0 = 3;
                return stackIn_156_0;
              }
              var6_intLifetime3 = eg.field_v;
              eg.field_v = sj.field_x;
              sj.field_x = var6_intLifetime3;
              ea.field_a = true;
            }
            stackIn_159_0 = -1;
            return stackIn_159_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_163_0 = var6_ref;
            stackIn_163_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_164_2 = "null";
            } else {
              stackIn_164_2 = "{...}";
            }
            stackIn_167_1 = ((StringBuilder) (Object) stackIn_163_1).append(stackIn_164_2).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_168_2 = "null";
            } else {
              stackIn_168_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_163_0), ((StringBuilder) (Object) stackIn_167_1).append(stackIn_168_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte[] param0, byte param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_h[this.field_d] = (byte)ge.a((int) this.field_h[this.field_d], 128 >>> vi.a(7, this.field_e));
          this.field_d = this.field_d + 1;
          if (this.field_d > 32) {
            while (true) {
              if (this.field_d < 64) {
                fieldTemp$0 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_h[fieldTemp$0] = (byte) 0;
                if (var8 == 0) {
                  continue;
                }
              } else {
                this.a(false);
              }
              break;
            }
            this.field_d = 0;
          }
          do {
            if (this.field_d >= 32) {
              mk.a(this.field_l, 0, this.field_h, 32, 32);
              this.a(false);
              break;
            }
            fieldTemp$1 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_h[fieldTemp$1] = (byte) 0;
          } while (var8 == 0);
          if (param1 != 87) {
            return;
          }
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_k[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[var5 + 1] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[3 + var5] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[5 + var5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
            if (var8 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("vc.G(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    vc() {
        this.field_k = new long[8];
        this.field_e = 0;
        this.field_o = new long[8];
        this.field_f = new long[8];
        this.field_m = new long[8];
        this.field_d = 0;
        this.field_c = new long[8];
        this.field_h = new byte[64];
        this.field_l = new byte[32];
    }

    static {
        field_a = false;
        field_j = 20000000L;
        field_n = "Reload game";
        field_i = "Back";
        field_b = "Password is valid";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
