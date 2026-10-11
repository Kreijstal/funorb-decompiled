/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends uk {
    static int[] field_p;
    private um field_n;
    private int field_l;
    private byte[] field_v;
    private jm field_i;
    private wc field_x;
    private int field_B;
    private byte[] field_r;
    static int field_m;
    private ae field_j;
    private um field_q;
    static ji field_s;
    static bd field_y;
    private int field_g;
    private ej field_h;
    private dh field_t;
    private vl field_w;
    private int field_A;
    private boolean field_z;
    private boolean field_o;
    private vl field_u;
    private long field_k;
    private boolean field_f;

    final int b(int param0, int param1) {
        ae var3 = (ae) (this.field_i.a(false, (long)param1));
        int var4 = 5 / ((33 - param0) / 52);
        if (var3 == null) {
          return 0;
        }
        return var3.d(-94);
    }

    private final ae a(int param0, int param1, boolean param2) {
        Object stackIn_88_0 = null;
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
        ae var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        var12 = (ae) (this.field_i.a(param2, (long)param0));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_w &&
          var12.field_v) {
          var12.b(-37);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (this.field_q != null &&
              this.field_r[param0] != -1) {
              var4 = this.field_t.a(this.field_q, param0, -27337);
            } else {
              if (this.field_h.a(20)) {
                return null;
              }
              var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
            }
          } else {
            if (1 != param1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_q == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_r[param0]) {
                throw new RuntimeException();
              }
              if (this.field_h.b(5)) {
                return null;
              }
              var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, false);
            } else {
              if (this.field_q == null) {
                throw new RuntimeException();
              }
              var4 = this.field_t.a(this.field_q, (byte) -127, param0);
            }
          }
          this.field_i.a(-97, (long)param0, (am) (var4));
        }
        if (((ae) (var4)).field_v) {
          return null;
        }
        var18 = ((ae) (var4)).c((byte) 127);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof rh) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              td.field_a.reset();
              td.field_a.update(var5, 0, var18.length - 2);
              var6_int = (int)td.field_a.getValue();
              if (var6_int != this.field_x.field_v[param0]) {
                throw new RuntimeException();
              }
              if (null != this.field_x.field_w &&
                this.field_x.field_w[param0] != null) {
                var30 = this.field_x.field_w[param0];
                var29 = ld.a(var5, 0, 125, -2 + var18.length);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (255 & var5[var18.length - 1]) + ((255 & var5[-2 + var18.length]) << 8);
              if ((65535 & this.field_x.field_i[param0]) != var7) {
                throw new RuntimeException();
              }
              if (this.field_r[param0] != 1) {
                if (this.field_r[param0] != 0) {
                }
                this.field_r[param0] = (byte) 1;
              }
              if (!((ae) (var4)).field_w) {
                ((ae) (var4)).b(-116);
              }
              stackIn_88_0 = var4;
              return (ae) (stackIn_88_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_r[param0] = (byte)-1;
            ((ae) (var4)).b(113);
            if (((ae) (var4)).field_w &&
              !this.field_h.a(20)) {
              var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
              this.field_i.a(-114, (long)param0, (am) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            td.field_a.reset();
            td.field_a.update(var5, 0, var18.length - 2);
            var6_int = (int)td.field_a.getValue();
            if (this.field_x.field_v[param0] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_x.field_w != null &&
              null != this.field_x.field_w[param0]) {
              var27 = this.field_x.field_w[param0];
              var28 = ld.a(var5, 0, 104, var18.length - 2);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_h.field_k = 0;
            this.field_h.field_e = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_h.c(194);
          ((ae) (var4)).b(-9);
          if (!((ae) (var4)).field_w) {
            return null;
          }
          if (!this.field_h.a(20)) {
            var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
            this.field_i.a(-106, (long)param0, (am) (var4));
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_x.field_i[param0] >>> 8);
        var5[var18.length - 1] = (byte)this.field_x.field_i[param0];
        if (null != this.field_q) {
          this.field_t.a(this.field_q, -4, var18, param0);
          if (this.field_r[param0] != 1) {
            this.field_r[param0] = (byte) 1;
          }
        }
        if (!((ae) (var4)).field_w) {
          ((ae) (var4)).b(26);
        }
        return (ae) (var4);
    }

    final static void e(int param0) {
        if (param0 != -2) {
          return;
        }
        vc.field_i[93] = 43;
        vc.field_i[47] = 73;
        vc.field_i[222] = 58;
        vc.field_i[192] = 28;
        vc.field_i[520] = 59;
        vc.field_i[92] = 74;
        vc.field_i[44] = 71;
        vc.field_i[91] = 42;
        vc.field_i[45] = 26;
        vc.field_i[61] = 27;
        vc.field_i[46] = 72;
        vc.field_i[59] = 57;
    }

    final byte[] a(byte param0, int param1) {
        ae var3 = this.a(param1, 0, false);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.c((byte) 127);
        var3.b(-76);
        if (param0 != -50) {
          this.b(-104, 72);
        }
        return var4;
    }

    final void f(int param0) {
        ae discarded$1 = null;
        ae discarded$0 = null;
        ae discarded$3 = null;
        ae discarded$2 = null;
        int var2_int;
        ae var2;
        am var3;
        int var4;
        int var5;
        am var6;
        am var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ae var2Lifetime1;
        am var3Lifetime1;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder3 = true;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_w) {
          if (this.c(3) == null) {
            return;
          }
          if (this.field_o) {
            var2_int = 1;
            var3 = this.field_w.g(-81);
            while (var3 != null) {
              var4 = (int)var3.field_c;
              if (this.field_r[var4] == 0) {
                discarded$1 = this.a(var4, 1, false);
              }
              if (this.field_r[var4] == 0) {
                var2_int = 0;
              } else {
                var3.b(126);
              }
              var3 = this.field_w.a(12684);
            }
            L6: while (true) {
              if (this.field_A < this.field_x.field_o.length) {
                if (this.field_x.field_o[this.field_A] != 0) {
                  if (this.field_t.field_e >= 250) {
                    var2_int = 0;
                    break L6;
                  }
                  if (0 == this.field_r[this.field_A]) {
                    discarded$0 = this.a(this.field_A, 1, false);
                  }
                  if (this.field_r[this.field_A] == 0) {
                    var7 = new am();
                    var7.field_c = (long)this.field_A;
                    var2_int = 0;
                    this.field_w.a(var7, 90);
                  }
                }
                this.field_A = this.field_A + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_A = 0;
              this.field_o = false;
            }
            decompiledFrameRemainder3 = false;
          }
          else {
            if (this.field_z) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_w.g(-100);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_c;
                if (1 != this.field_r[var4Lifetime1]) {
                  discarded$3 = this.a(var4Lifetime1, 2, false);
                }
                if (this.field_r[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b(-124);
                }
                var3Lifetime1 = this.field_w.a(param0 + 12685);
              }
              while (this.field_A < this.field_x.field_o.length) {
                if (this.field_x.field_o[this.field_A] == 0) {
                  this.field_A = this.field_A + 1;
                  continue;
                }
                if (!this.field_h.b(param0 ^ -6)) {
                  if (1 != this.field_r[this.field_A]) {
                    discarded$2 = this.a(this.field_A, 2, false);
                  }
                  if (this.field_r[this.field_A] != 1) {
                    var6 = new am();
                    var6.field_c = (long)this.field_A;
                    this.field_w.a(var6, 81);
                    var2_intLifetime1 = 0;
                  }
                  this.field_A = this.field_A + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if (var2_intLifetime1 != 0) {
                this.field_A = 0;
                this.field_z = false;
                decompiledFrameRemainder3 = false;
              }
              else {
                if (param0 != -1) {
                  field_p = (int[]) null;
                }
                decompiledFrameRemainder1 = (this.field_f);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0 = !(this.field_k > hn.a((byte) 80)))) {
                  var2 = (ae) (this.field_i.a(-93));
                  while (var2 != null) {
                    if (!var2.field_v) {
                      if (!var2.field_t) {
                        var2.field_t = true;
                      } else {
                        if (!var2.field_w) {
                          throw new RuntimeException();
                        }
                        var2.b(20);
                      }
                    }
                    var2 = (ae) (this.field_i.b(param0 + 0));
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.field_w = null;
            }
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (param0 != -1) {
            field_p = (int[]) null;
          }
          decompiledFrameRemainder1 = (this.field_f);
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0 = !(this.field_k > hn.a((byte) 80)))) {
            var2Lifetime1 = (ae) (this.field_i.a(-93));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_v) {
                if (!var2Lifetime1.field_t) {
                  var2Lifetime1.field_t = true;
                } else {
                  if (!var2Lifetime1.field_w) {
                    throw new RuntimeException();
                  }
                  var2Lifetime1.b(20);
                }
              }
              var2Lifetime1 = (ae) (this.field_i.b(param0 + 0));
            }
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          this.field_k = 1000L + hn.a((byte) 80);
        }

    }

    final wc c(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_x != null) {
          return this.field_x;
        }
        if (null == this.field_j) {
          if (this.field_h.a(param0 ^ 23)) {
            return null;
          }
          this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
        }
        if (this.field_j.field_v) {
          return null;
        }
        if (param0 != 3) {
          this.c(-109);
        }
        var7 = this.field_j.c((byte) 127);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_j instanceof rh)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new wc(var7, this.field_l, this.field_v);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_h.c(194);
            this.field_x = null;
            if (this.field_h.a(20)) {
              this.field_j = null;
            } else {
              this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
            }
            return null;
          }
          if (this.field_n != null) {
            this.field_t.a(this.field_n, -4, var7, this.field_g);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_x = new wc(var7, this.field_l, this.field_v);
            if (this.field_B != this.field_x.field_n) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_x = null;
            if (!this.field_h.a(20)) {
              this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
            } else {
              this.field_j = null;
            }
            return null;
          }
        }
        this.field_j = null;
        if (this.field_q != null) {
          this.field_r = new byte[this.field_x.field_c];
        }
        return this.field_x;
    }

    final void d(int param0) {
        int var3 = 0;
        ae discarded$0 = null;
        ae discarded$1 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 20) {
          field_y = (bd) null;
        }
        if (this.field_w == null) {
          return;
        }
        if (null == this.c(3)) {
          return;
        }
        am var2 = this.field_u.g(-6);
        while (var2 != null) {
          var3 = (int)var2.field_c;
          if (var3 < 0) {
            var2.b(113);
          } else {
            if (var3 >= this.field_x.field_c) {
              var2.b(113);
            } else {
              if (this.field_x.field_o[var3] == 0) {
                var2.b(113);
              } else {
                if (this.field_r[var3] == 0) {
                  discarded$0 = this.a(var3, 1, false);
                }
                if (-1 == this.field_r[var3]) {
                  discarded$1 = this.a(var3, 2, false);
                }
                if (1 == this.field_r[var3]) {
                  var2.b(-79);
                }
              }
            }
          }
          var2 = this.field_u.a(12684);
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
          return;
        }
        field_p = null;
        field_y = null;
    }

    final void a(byte param0) {
        if (this.field_q == null) {
          return;
        }
        if (param0 != -50) {
          this.field_r = (byte[]) null;
        }
        this.field_z = true;
        if (null == this.field_w) {
          this.field_w = new vl();
        }
    }

    rb(int param0, um param1, um param2, ej param3, dh param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_i = new jm(16);
        this.field_A = 0;
        this.field_u = new vl();
        this.field_k = 0L;
        try {
          this.field_g = param0;
          this.field_q = param1;
          if (null == this.field_q) {
            this.field_o = false;
          } else {
            this.field_o = true;
            this.field_w = new vl();
          }
          this.field_l = param5;
          this.field_v = param6;
          this.field_t = param4;
          this.field_B = param7;
          stackIn_7_1 = (param8);
          this.field_f = stackIn_7_1;
          this.field_h = param3;
          this.field_n = param2;
          if (null != this.field_n) {
            this.field_j = (ae) ((Object) this.field_t.a(this.field_n, this.field_g, -27337));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');
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
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_p = new int[8192];
        field_m = 0;
    }
}
