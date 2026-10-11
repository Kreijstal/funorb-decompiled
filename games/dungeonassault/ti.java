/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends qa {
    private ln field_D;
    static String field_v;
    private int field_w;
    static pp field_A;
    private int field_p;
    private tm field_y;
    private bb field_t;
    private byte[] field_s;
    static String field_n;
    static boolean field_f;
    static boolean field_i;
    static byte[] field_q;
    private byte[] field_h;
    private int field_o;
    private wa field_l;
    private ln field_g;
    private vf field_C;
    private cc field_B;
    private boolean field_r;
    private boolean field_x;
    private md field_j;
    private md field_u;
    private int field_z;
    private long field_m;
    private boolean field_k;

    private final vf a(byte param0, int param1, int param2) {
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
        vf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = DungeonAssault.field_K;
        if (param0 < 81) {
          this.field_k = false;
        }
        var12 = (vf) (this.field_l.a((long)param1, 8));
        var4 = var12;
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_B &&
          var12.field_v) {
          var12.a(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param2 == 0) {
            if (this.field_D != null &&
              this.field_h[param1] != -1) {
              var4 = this.field_B.a(this.field_D, param1, -6319);
            } else {
              if (this.field_t.b(-21431)) {
                return null;
              }
              var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 73);
            }
          } else {
            if (1 != param2) {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_D) {
                throw new RuntimeException();
              }
              if (this.field_h[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_t.d(20)) {
                return null;
              }
              var4 = this.field_t.a(false, this.field_p, (byte) 2, param1, (byte) 118);
            } else {
              if (this.field_D == null) {
                throw new RuntimeException();
              }
              var4 = this.field_B.a((byte) -78, this.field_D, param1);
            }
          }
          this.field_l.a((ne) (var4), 12460, (long)param1);
        }
        if (((vf) (var4)).field_v) {
          return null;
        }
        var18 = ((vf) (var4)).b(true);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof co) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              jl.field_a.reset();
              jl.field_a.update(var5, 0, var18.length - 2);
              var6_int = (int)jl.field_a.getValue();
              if (this.field_y.field_q[param1] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_y.field_g &&
                null != this.field_y.field_g[param1]) {
                var29 = this.field_y.field_g[param1];
                var30 = rn.a(var18.length - 2, 0, 8, var18);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[-1 + var18.length] & 255) + (var5[-2 + var18.length] << 8 & 65280);
              if ((this.field_y.field_o[param1] & 65535) != var7) {
                throw new RuntimeException();
              }
              if (1 != this.field_h[param1]) {
                if (0 == this.field_h[param1]) {
                }
                this.field_h[param1] = (byte) 1;
              }
              if (!((vf) (var4)).field_B) {
                ((vf) (var4)).a(false);
              }
              stackIn_89_0 = var4;
              return (vf) (stackIn_89_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_h[param1] = (byte)-1;
            ((vf) (var4)).a(false);
            if (!((vf) (var4)).field_B) {
              return null;
            }
            if (this.field_t.b(-21431)) {
              return null;
            }
            var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 77);
            this.field_l.a((ne) (var4), 12460, (long)param1);
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            jl.field_a.reset();
            jl.field_a.update(var5, 0, var18.length - 2);
            var6_int = (int)jl.field_a.getValue();
            if (var6_int != this.field_y.field_q[param1]) {
              throw new RuntimeException();
            }
            if (null != this.field_y.field_g &&
              null != this.field_y.field_g[param1]) {
              var28 = this.field_y.field_g[param1];
              var27 = rn.a(-2 + var18.length, 0, 8, var18);
              for (var9 = 0; 64 > var9; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_t.field_h = 0;
            this.field_t.field_c = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_t.f(-118);
          ((vf) (var4)).a(false);
          if (!((vf) (var4)).field_B) {
            return null;
          }
          if (this.field_t.b(-21431)) {
            return null;
          }
          var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 105);
          this.field_l.a((ne) (var4), 12460, (long)param1);
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_y.field_o[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_y.field_o[param1];
        if (this.field_D != null) {
          this.field_B.a(this.field_D, 15958, param1, var18);
          if (this.field_h[param1] != 1) {
            this.field_h[param1] = (byte) 1;
          }
        }
        if (!((vf) (var4)).field_B) {
          ((vf) (var4)).a(false);
        }
        return (vf) (var4);
    }

    final void c(int param0) {
        vf discarded$1 = null;
        vf discarded$0 = null;
        vf discarded$3 = null;
        vf discarded$2 = null;
        int var2_int;
        vf var2;
        ne var3;
        int var4;
        int var5;
        ne var6;
        ne var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ne var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = DungeonAssault.field_K;
        if (this.field_j != null) {
          if (null == this.a(26538)) {
            return;
          }
          if (this.field_x) {
            var2_int = 1;
            var3 = this.field_j.e(-24172);
            while (var3 != null) {
              var4 = (int)var3.field_h;
              if (0 == this.field_h[var4]) {
                discarded$1 = this.a((byte) 127, var4, 1);
              }
              if (0 != this.field_h[var4]) {
                var3.a(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_j.a(param0 ^ -10786);
            }
            while (this.field_y.field_k.length > this.field_z) {
              if (this.field_y.field_k[this.field_z] == 0) {
                this.field_z = this.field_z + 1;
                continue;
              }
              if (250 > this.field_B.field_f) {
                if (this.field_h[this.field_z] == 0) {
                  discarded$0 = this.a((byte) 126, this.field_z, 1);
                }
                if (this.field_h[this.field_z] == 0) {
                  var7 = new ne();
                  var7.field_h = (long)this.field_z;
                  var2_int = 0;
                  this.field_j.a(var7, false);
                }
                this.field_z = this.field_z + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_z = 0;
              this.field_x = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_r) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_j.e(-24172);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_h;
                if (1 != this.field_h[var4Lifetime1]) {
                  discarded$3 = this.a((byte) 107, var4Lifetime1, 2);
                }
                if (this.field_h[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.a(false);
                }
                var3Lifetime1 = this.field_j.a(4);
              }
              L10: while (true) {
                if (this.field_z < this.field_y.field_k.length) {
                  if (this.field_y.field_k[this.field_z] != 0) {
                    if (this.field_t.d(20)) {
                      var2_intLifetime1 = 0;
                      break L10;
                    }
                    if (this.field_h[this.field_z] != 1) {
                      discarded$2 = this.a((byte) 112, this.field_z, 2);
                    }
                    if (1 != this.field_h[this.field_z]) {
                      var6 = new ne();
                      var6.field_h = (long)this.field_z;
                      this.field_j.a(var6, false);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_z = this.field_z + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_r = false;
                this.field_z = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_j = null;
            }
          }
        }
        if (this.field_k &&
          kd.c(param0 ^ 9138) >= this.field_m) {
          var2 = (vf) (this.field_l.a(true));
          while (var2 != null) {
            if (!var2.field_v) {
              if (!var2.field_z) {
                var2.field_z = true;
              } else {
                if (!var2.field_B) {
                  throw new RuntimeException();
                }
                var2.a(false);
              }
            }
            var2 = (vf) (this.field_l.a(param0 + 15108));
          }
          this.field_m = kd.c(-2456) + 1000L;
        }
        if (param0 != -10790) {
          this.field_k = false;
        }
    }

    final byte[] a(int param0, int param1) {
        vf var3 = this.a((byte) 90, param0, 0);
        if (var3 == null) {
          return null;
        }
        if (param1 != -7249) {
          return (byte[]) null;
        }
        byte[] var4 = var3.b(true);
        var3.a(false);
        return var4;
    }

    final tm a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = DungeonAssault.field_K;
        if (null != this.field_y) {
          return this.field_y;
        }
        if (this.field_C == null) {
          if (this.field_t.b(-21431)) {
            return null;
          }
          this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 79));
        }
        if (param0 != 26538) {
          return (tm) null;
        }
        if (this.field_C.field_v) {
          return null;
        }
        var7 = this.field_C.b(true);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_C instanceof co) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_y = new tm(var7, this.field_w, this.field_s);
            if (this.field_y.field_s != this.field_o) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_y = null;
            if (this.field_t.b(-21431)) {
              this.field_C = null;
            } else {
              this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 69));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_y = new tm(var7, this.field_w, this.field_s);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_t.f(99);
            this.field_y = null;
            if (this.field_t.b(-21431)) {
              this.field_C = null;
            } else {
              this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 71));
            }
            return null;
          }
          if (this.field_g != null) {
            this.field_B.a(this.field_g, param0 ^ 23036, this.field_p, var7);
          }
        }
        this.field_C = null;
        if (this.field_D != null) {
          this.field_h = new byte[this.field_y.field_l];
        }
        return this.field_y;
    }

    final void d(int param0) {
        if (param0 != 6833) {
          return;
        }
        if (this.field_D == null) {
          return;
        }
        this.field_r = true;
        if (null == this.field_j) {
          this.field_j = new md();
        }
    }

    final void b(boolean param0) {
        int var3 = 0;
        vf discarded$0 = null;
        vf discarded$1 = null;
        int var4 = DungeonAssault.field_K;
        if (null == this.field_j) {
          return;
        }
        if (param0) {
          this.field_y = (tm) null;
        }
        if (null == this.a(26538)) {
          return;
        }
        ne var2 = this.field_u.e(-24172);
        while (var2 != null) {
          var3 = (int)var2.field_h;
          if (var3 < 0) {
            var2.a(param0);
          } else {
            if (var3 >= this.field_y.field_l) {
              var2.a(param0);
            } else {
              if (0 == this.field_y.field_k[var3]) {
                var2.a(param0);
              } else {
                if (this.field_h[var3] == 0) {
                  discarded$0 = this.a((byte) 95, var3, 1);
                }
                if (this.field_h[var3] == -1) {
                  discarded$1 = this.a((byte) 123, var3, 2);
                }
                if (this.field_h[var3] == 1) {
                  var2.a(false);
                }
              }
            }
          }
          var2 = this.field_u.a(4);
        }
    }

    final int b(int param0, int param1) {
        vf var3 = (vf) (this.field_l.a((long)param0, 8));
        if (param1 != 27318) {
          this.field_t = (bb) null;
        }
        if (var3 != null) {
          return var3.d((byte) 107);
        }
        return 0;
    }

    final static void c(boolean param0) {
        if (!param0) {
          return;
        }
        i var1 = (i) (id.field_e.c(0));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        gf.a(var1.field_j, var1.field_i, var1.field_q);
        gf.e(var1.field_m, var1.field_p, var1.field_z, var1.field_k);
        var1.field_j = null;
        cd.field_g.a(var1, !param0 ? true : false);
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
          return;
        }
        field_A = null;
        field_q = null;
        field_n = null;
    }

    ti(int param0, ln param1, ln param2, bb param3, cc param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_l = new wa(16);
        this.field_z = 0;
        this.field_u = new md();
        this.field_m = 0L;
        try {
          this.field_p = param0;
          this.field_D = param1;
          if (null != this.field_D) {
            this.field_x = true;
            this.field_j = new md();
          } else {
            this.field_x = false;
          }
          this.field_o = param7;
          this.field_w = param5;
          this.field_g = param2;
          stackIn_7_1 = (param8);
          this.field_k = stackIn_7_1;
          this.field_s = param6;
          this.field_B = param4;
          this.field_t = param3;
          if (null != this.field_g) {
            this.field_C = (vf) ((Object) this.field_B.a(this.field_g, this.field_p, -6319));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ti.<init>(").append(param0).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_n = "Imps may be small and carry a cheeky, indeed, impish look, but they'll not give a second thought to whether or not to stab your raiders.";
        field_f = false;
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
