/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends lc {
    private ua field_r;
    private byte[] field_v;
    private int field_t;
    static u field_g;
    private rn field_k;
    private ti field_f;
    private ua field_o;
    private byte[] field_u;
    private ci field_p;
    static int[] field_A;
    private ar field_w;
    private int field_z;
    private int field_j;
    static boolean field_n;
    static String field_y;
    private jc field_l;
    private int field_q;
    private pf field_h;
    private boolean field_x;
    private pf field_i;
    private boolean field_m;
    private long field_e;
    private boolean field_s;

    final void c(int param0) {
        jc discarded$0 = null;
        if (null == this.field_r) {
          return;
        }
        this.field_m = true;
        if (param0 != 255) {
          discarded$0 = this.a(21, -34, 75);
        }
        if (null == this.field_h) {
          this.field_h = new pf();
        }
    }

    final void b(boolean param0) {
        jc discarded$3 = null;
        jc discarded$2 = null;
        jc discarded$1 = null;
        jc discarded$0 = null;
        int var2_int;
        jc var2;
        oh var3;
        int var4;
        int var5;
        oh var6;
        oh var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        jc var2Lifetime1;
        oh var3Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          this.field_l = (jc) null;
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        if (this.field_h != null) {
          if (null == this.a(6)) {
            return;
          }
          if (this.field_x) {
            var2_int = 1;
            var3 = this.field_h.d(0);
            while (var3 != null) {
              var4 = (int)var3.field_b;
              if (0 == this.field_u[var4]) {
                discarded$3 = this.a(1, 0, var4);
              }
              if (this.field_u[var4] != 0) {
                var3.b((byte) -76);
              } else {
                var2_int = 0;
              }
              var3 = this.field_h.a((byte) -71);
            }
            while (this.field_q < this.field_p.field_n.length) {
              if (this.field_p.field_n[this.field_q] == 0) {
                this.field_q = this.field_q + 1;
                continue;
              }
              if (this.field_k.field_d < 250) {
                if (this.field_u[this.field_q] == 0) {
                  discarded$2 = this.a(1, 0, this.field_q);
                }
                if (this.field_u[this.field_q] == 0) {
                  var6 = new oh();
                  var6.field_b = (long)this.field_q;
                  var2_int = 0;
                  this.field_h.a((byte) -113, var6);
                }
                this.field_q = this.field_q + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if (var2_int != 0) {
              this.field_q = 0;
              this.field_x = false;
              decompiledFrameRemainder2 = false;
            }
            else {
              decompiledFrameRemainder0 = (this.field_s);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(pr.a(14274) < this.field_e))) {
                var2 = (jc) (this.field_f.c(77));
                while (var2 != null) {
                  if (!var2.field_u) {
                    if (var2.field_t) {
                      if (!var2.field_q) {
                        throw new RuntimeException();
                      }
                      var2.b((byte) -60);
                    } else {
                      var2.field_t = true;
                    }
                  }
                  var2 = (jc) (this.field_f.a(false));
                }
                decompiledFrameRemainder1 = false;
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_h.d(0);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_b;
                if (this.field_u[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, 0, var4Lifetime1);
                }
                if (this.field_u[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b((byte) -70);
                }
                var3Lifetime1 = this.field_h.a((byte) -71);
              }
              L6: while (true) {
                if (this.field_q < this.field_p.field_n.length) {
                  if (this.field_p.field_n[this.field_q] != 0) {
                    if (this.field_w.c((byte) -98)) {
                      var2_intLifetime1 = 0;
                      break L6;
                    }
                    if (this.field_u[this.field_q] != 1) {
                      discarded$0 = this.a(2, 0, this.field_q);
                    }
                    if (this.field_u[this.field_q] != 1) {
                      var7 = new oh();
                      var7.field_b = (long)this.field_q;
                      this.field_h.a((byte) -113, var7);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_q = this.field_q + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_q = 0;
                this.field_m = false;
              }
              decompiledFrameRemainder2 = false;
            }
            else {
              this.field_h = null;
            }
          }
        }
        if ((decompiledFrameRemainder1) && ((decompiledFrameRemainder0) &&
          (decompiledFrameRemainder0 = (this.field_s)) &&
          (decompiledFrameRemainder0 = !(pr.a(14274) < this.field_e)))) {
          var2Lifetime1 = (jc) (this.field_f.c(77));
          while (var2Lifetime1 != null) {
            if (!var2Lifetime1.field_u) {
              if (var2Lifetime1.field_t) {
                if (!var2Lifetime1.field_q) {
                  throw new RuntimeException();
                }
                var2Lifetime1.b((byte) -60);
              } else {
                var2Lifetime1.field_t = true;
              }
            }
            var2Lifetime1 = (jc) (this.field_f.a(false));
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_e = pr.a(14274) + 1000L;
        }

    }

    final void a(byte param0) {
        jc discarded$0 = null;
        jc discarded$1 = null;
        oh var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_h) {
          return;
        }
        if (this.a(param0 - 59) == null) {
          return;
        }
        var2 = this.field_i.d(0);
        while (var2 != null) {
          var3 = (int)var2.field_b;
          if (var3 >= 0) {
            if (this.field_p.field_a > var3) {
              if (this.field_p.field_n[var3] == 0) {
                var2.b((byte) -85);
              } else {
                if (this.field_u[var3] == 0) {
                  discarded$0 = this.a(1, 0, var3);
                }
                if (this.field_u[var3] == -1) {
                  discarded$1 = this.a(2, 0, var3);
                }
                if (this.field_u[var3] == 1) {
                  var2.b((byte) -90);
                }
              }
            } else {
              var2.b((byte) -85);
            }
          } else {
            var2.b((byte) -85);
          }
          var2 = this.field_i.a((byte) -71);
        }
        if (param0 != 65) {
          this.c(-101);
        }
    }

    final static void d(int param0) {
        gm.field_m.a(lp.field_v.field_K - (ns.field_pb ? 42 + (pe.field_K + 2) : 0), 18, (byte) 39, 0, 0);
        sf.field_f.a(42 + pe.field_K, param0, (byte) 42, 0, -40 + (lp.field_v.field_K - (pe.field_K + 2)));
        ls.field_a.a(lp.field_v.field_K, 20, 0, 2, -122, lp.field_v.field_mb - 20, pe.field_K);
    }

    final ci a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_p) {
          return this.field_p;
        }
        if (null == this.field_l) {
          if (this.field_w.c(27356)) {
            return null;
          }
          this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
        }
        if (this.field_l.field_u) {
          return null;
        }
        var8 = this.field_l.e((byte) 50);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_l instanceof ak) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_p = new ci(var9, this.field_z, this.field_v);
            if (this.field_t != this.field_p.field_e) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_p = null;
            if (this.field_w.c(27356)) {
              this.field_l = null;
            } else {
              this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_p = new ci(var8, this.field_z, this.field_v);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_w.b((byte) -91);
            this.field_p = null;
            if (this.field_w.c(27356)) {
              this.field_l = null;
            } else {
              this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
            }
            return null;
          }
          if (null != this.field_o) {
            this.field_k.a(this.field_j, this.field_o, -51, var8);
          }
        }
        if (param0 != 6) {
          field_y = (String) null;
        }
        if (null != this.field_r) {
          this.field_u = new byte[this.field_p.field_a];
        }
        this.field_l = null;
        return this.field_p;
    }

    final int a(int param0, byte param1) {
        jc var3 = (jc) (this.field_f.a((long)param0, -25064));
        if (var3 != null) {
          return var3.e(0);
        }
        int var4 = -32 / ((param1 + 3) / 58);
        return 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_y = null;
        if (param0 != 114) {
          p.d(24);
        }
        field_A = null;
    }

    final byte[] a(byte param0, int param1) {
        jc var3 = this.a(0, 0, param1);
        if (var3 == null) {
          return null;
        }
        int var5 = 84 % ((param0 + 51) / 33);
        byte[] var4 = var3.e((byte) 109);
        var3.b((byte) -60);
        return var4;
    }

    private final jc a(int param0, int param1, int param2) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        Object stackIn_89_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jc var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 0) {
          this.a(55, (byte) -28);
        }
        var12 = (jc) (this.field_f.a((long)param2, -25064));
        var4 = var12;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_q &&
          var12.field_u) {
          var12.b((byte) -76);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_r == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_u[param2]) {
                throw new RuntimeException();
              }
              if (this.field_w.c((byte) -115)) {
                return null;
              }
              var4 = this.field_w.a(false, this.field_j, (byte) 2, -2057056416, param2);
            } else {
              if (null == this.field_r) {
                throw new RuntimeException();
              }
              var4 = this.field_k.a(this.field_r, param2, 13514);
            }
          } else {
            if (this.field_r != null &&
              this.field_u[param2] != -1) {
              var4 = this.field_k.a(param2, this.field_r, 1);
            } else {
              if (this.field_w.c(param1 ^ 27356)) {
                return null;
              }
              var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
            }
          }
          this.field_f.a((oh) (var4), -120, (long)param2);
        }
        if (((jc) (var4)).field_u) {
          return null;
        }
        var18 = ((jc) (var4)).e((byte) 82);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof ak) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              ti.field_k.reset();
              ti.field_k.update(var5, 0, var18.length - 2);
              var6_int = (int)ti.field_k.getValue();
              if (this.field_p.field_f[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_p.field_j &&
                this.field_p.field_j[param2] != null) {
                var30 = this.field_p.field_j[param2];
                var29 = dp.a(var5, var18.length - 2, param1 ^ -26131, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = ((var5[var18.length - 2] & 255) << 8) + (var5[var18.length - 1] & 255);
              if (var7 != (this.field_p.field_v[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (1 != this.field_u[param2]) {
                if (this.field_u[param2] == 0) {
                }
                this.field_u[param2] = (byte) 1;
              }
              if (!((jc) (var4)).field_q) {
                ((jc) (var4)).b((byte) -70);
              }
              stackIn_89_0 = var4;
              return (jc) (stackIn_89_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_u[param2] = (byte)-1;
            ((jc) (var4)).b((byte) -124);
            if (((jc) (var4)).field_q) {
              if (this.field_w.c(27356)) {
                return null;
              }
              var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
              this.field_f.a((oh) (var4), 81, (long)param2);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            ti.field_k.reset();
            ti.field_k.update(var5, 0, var18.length - 2);
            var6_int = (int)ti.field_k.getValue();
            if (var6_int != this.field_p.field_f[param2]) {
              throw new RuntimeException();
            }
            if (null != this.field_p.field_j &&
              this.field_p.field_j[param2] != null) {
              var27 = this.field_p.field_j[param2];
              var28 = dp.a(var5, -2 + var18.length, param1 ^ -26131, 0);
              for (var9 = 0; 64 > var9; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_w.field_a = 0;
            this.field_w.field_p = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_w.b((byte) -91);
          ((jc) (var4)).b((byte) -68);
          if (((jc) (var4)).field_q &&
            !this.field_w.c(27356)) {
            var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
            this.field_f.a((oh) (var4), 64, (long)param2);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_p.field_v[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_p.field_v[param2];
        if (this.field_r != null) {
          this.field_k.a(param2, this.field_r, -61, var18);
          stackIn_59_0 = -2;
          stackIn_59_1 = ~this.field_u[param2];
          if (stackIn_59_0 != stackIn_59_1) {
            this.field_u[param2] = (byte) 1;
          }
        }
        if (!((jc) (var4)).field_q) {
          ((jc) (var4)).b((byte) -128);
        }
        return (jc) (var4);
    }

    p(int param0, ua param1, ua param2, ar param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_f = new ti(16);
        this.field_q = 0;
        this.field_i = new pf();
        this.field_e = 0L;
        try {
          this.field_j = param0;
          this.field_r = param1;
          if (this.field_r != null) {
            this.field_x = true;
            this.field_h = new pf();
          } else {
            this.field_x = false;
          }
          this.field_z = param5;
          this.field_t = param7;
          this.field_k = param4;
          this.field_v = param6;
          stackIn_7_1 = (param8);
          this.field_s = stackIn_7_1;
          this.field_w = param3;
          this.field_o = param2;
          if (null != this.field_o) {
            this.field_l = (jc) ((Object) this.field_k.a(this.field_j, this.field_o, 1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("p.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_g = new u();
        field_y = "<%0> has joined your game.";
    }
}
