/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wd {
    static String field_z;
    private lb field_y;
    private kh field_g;
    private byte[] field_x;
    private int field_i;
    private tg field_v;
    static il field_q;
    private byte[] field_m;
    private n field_s;
    private ik field_j;
    private ik field_u;
    private int field_t;
    private int field_l;
    private gb field_k;
    private boolean field_h;
    private int field_w;
    private vd field_n;
    private boolean field_p;
    private vd field_A;
    private long field_o;
    private boolean field_r;

    final void f(int param0) {
        if (param0 <= 49) {
          this.field_n = (vd) null;
        }
        if (this.field_j == null) {
          return;
        }
        this.field_h = true;
        if (this.field_A == null) {
          this.field_A = new vd();
        }
    }

    final void a(boolean param0) {
        lb discarded$0 = null;
        lb discarded$1 = null;
        gi var2;
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0) {
          this.a(-70, 35);
        }
        if (this.field_A == null) {
          return;
        }
        if (this.a((byte) -101) == null) {
          return;
        }
        var2 = this.field_n.h(-11151);
        while (var2 != null) {
          var3 = (int)var2.field_g;
          if (var3 >= 0 &&
            var3 < this.field_g.field_m &&
            0 != this.field_g.field_k[var3]) {
            if (this.field_m[var3] == 0) {
              discarded$0 = this.a(65, var3, 1);
            }
            if (this.field_m[var3] == -1) {
              discarded$1 = this.a(65, var3, 2);
            }
            if (this.field_m[var3] == 1) {
              var2.a(-16175);
            }
            var2 = this.field_n.e(0);
            continue;
          }
          var2.a(-16175);
          var2 = this.field_n.e(0);
        }
    }

    public static void d(int param0) {
        if (param0 < 114) {
          field_z = (String) null;
        }
        field_z = null;
        field_q = null;
    }

    final int a(int param0, int param1) {
        lb var3 = (lb) (this.field_v.a(true, (long)param0));
        if (param1 != -1) {
          return 94;
        }
        if (var3 == null) {
          return 0;
        }
        return var3.g(-58);
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_13_0 = false;
        if (param1 != -17321) {
          return true;
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(65 > param0) &&
          !(param0 > 90)) ||
          (!(97 > param0) &&
          !(param0 > 122)));
        return stackIn_13_0;
    }

    final byte[] b(int param0, int param1) {
        if (param1 != 60) {
          return (byte[]) null;
        }
        lb var3 = this.a(65, param0, 0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.i(13095);
        var3.a(-16175);
        return var4;
    }

    final void c(int param0) {
        lb discarded$3 = null;
        lb discarded$2 = null;
        lb discarded$1 = null;
        lb discarded$0 = null;
        int var2_int;
        lb var2;
        gi var3;
        int var4;
        int var5;
        gi var6;
        gi var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        gi var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != this.field_A) {
          if (this.a((byte) -57) == null) {
            return;
          }
          if (this.field_p) {
            var2_int = 1;
            var3 = this.field_A.h(param0 ^ -11248);
            while (var3 != null) {
              var4 = (int)var3.field_g;
              if (this.field_m[var4] == 0) {
                discarded$3 = this.a(65, var4, 1);
              }
              if (this.field_m[var4] == 0) {
                var2_int = 0;
              } else {
                var3.a(-16175);
              }
              var3 = this.field_A.e(param0 - 97);
            }
            L10: while (true) {
              if (this.field_w < this.field_g.field_k.length) {
                if (this.field_g.field_k[this.field_w] != 0) {
                  if (this.field_s.field_e >= 250) {
                    var2_int = 0;
                    break L10;
                  }
                  if (this.field_m[this.field_w] == 0) {
                    discarded$2 = this.a(65, this.field_w, 1);
                  }
                  if (this.field_m[this.field_w] == 0) {
                    var6 = new gi();
                    var6.field_g = (long)this.field_w;
                    var2_int = 0;
                    this.field_A.a(var6, 255);
                  }
                }
                this.field_w = this.field_w + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_p = false;
              this.field_w = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_h) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_A.h(-11151);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_g;
                if (this.field_m[var4Lifetime1] != 1) {
                  discarded$1 = this.a(65, var4Lifetime1, 2);
                }
                if (this.field_m[var4Lifetime1] == 1) {
                  var3Lifetime1.a(-16175);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_A.e(0);
              }
              L3: while (true) {
                if (this.field_g.field_k.length > this.field_w) {
                  if (this.field_g.field_k[this.field_w] != 0) {
                    if (this.field_k.c(20)) {
                      var2_intLifetime1 = 0;
                      break L3;
                    }
                    if (this.field_m[this.field_w] != 1) {
                      discarded$0 = this.a(65, this.field_w, 2);
                    }
                    if (1 != this.field_m[this.field_w]) {
                      var7 = new gi();
                      var7.field_g = (long)this.field_w;
                      var2_intLifetime1 = 0;
                      this.field_A.a(var7, 255);
                    }
                  }
                  this.field_w = this.field_w + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_w = 0;
                this.field_h = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_A = null;
            }
          }
        }
        if (param0 != 97) {
          return;
        }
        if (this.field_r &&
          this.field_o <= la.a(false)) {
          var2 = (lb) (this.field_v.b(-1));
          while (var2 != null) {
            if (!var2.field_u) {
              if (var2.field_E) {
                if (!var2.field_y) {
                  throw new RuntimeException();
                }
                var2.a(-16175);
              } else {
                var2.field_E = true;
              }
            }
            var2 = (lb) (this.field_v.a((byte) -114));
          }
          this.field_o = la.a(false) + 1000L;
        }
    }

    private final lb a(int param0, int param1, int param2) {
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
        lb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var12 = (lb) (this.field_v.a(true, (long)param1));
        var4 = var12;
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_y &&
          var12.field_u) {
          var12.a(-16175);
          var4 = null;
        }
        if (var4 == null) {
          if (param2 == 0) {
            if (null != this.field_j &&
              this.field_m[param1] != -1) {
              var4 = this.field_s.a(6, param1, this.field_j);
            } else {
              if (this.field_k.a(true)) {
                return null;
              }
              var4 = this.field_k.a(this.field_i, 11259, (byte) 2, param1, true);
            }
          } else {
            if (param2 != 1) {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_j) {
                throw new RuntimeException();
              }
              if (this.field_m[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_k.c(20)) {
                return null;
              }
              var4 = this.field_k.a(this.field_i, 11259, (byte) 2, param1, false);
            } else {
              if (null == this.field_j) {
                throw new RuntimeException();
              }
              var4 = this.field_s.a(this.field_j, param1, 7);
            }
          }
          this.field_v.a((gi) (var4), (long)param1, -1);
        }
        if (((lb) (var4)).field_u) {
          return null;
        }
        if (param0 != 65) {
          this.field_j = (ik) null;
        }
        var18 = ((lb) (var4)).i(13095);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof bi) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              ta.field_b.reset();
              ta.field_b.update(var5, 0, -2 + var18.length);
              var6_int = (int)ta.field_b.getValue();
              if (var6_int != this.field_g.field_j[param1]) {
                throw new RuntimeException();
              }
              if (this.field_g.field_q != null &&
                null != this.field_g.field_q[param1]) {
                var29 = this.field_g.field_q[param1];
                var30 = b.a(0, 90, var5, -2 + var18.length);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (var5[var18.length - 1] & 255) + ((var5[var18.length - 2] & 255) << 8);
              if (var7 != (this.field_g.field_l[param1] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_m[param1] != 1) {
                if (this.field_m[param1] == 0) {
                }
                this.field_m[param1] = (byte) 1;
              }
              if (!((lb) (var4)).field_y) {
                ((lb) (var4)).a(-16175);
              }
              stackIn_89_0 = var4;
              return (lb) (stackIn_89_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_m[param1] = (byte)-1;
            ((lb) (var4)).a(-16175);
            if (((lb) (var4)).field_y) {
              if (this.field_k.a(true)) {
                return null;
              }
              var4 = this.field_k.a(this.field_i, param0 + 11194, (byte) 2, param1, true);
              this.field_v.a((gi) (var4), (long)param1, -1);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            ta.field_b.reset();
            ta.field_b.update(var5, 0, -2 + var18.length);
            var6_int = (int)ta.field_b.getValue();
            if (this.field_g.field_j[param1] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_g.field_q &&
              this.field_g.field_q[param1] != null) {
              var27 = this.field_g.field_q[param1];
              var28 = b.a(0, param0 - 9, var5, var18.length - 2);
              for (var9 = 0; 64 > var9; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_k.field_c = 0;
            this.field_k.field_h = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_k.b((byte) 122);
          ((lb) (var4)).a(param0 - 16240);
          if (((lb) (var4)).field_y) {
            if (this.field_k.a(true)) {
              return null;
            }
            var4 = this.field_k.a(this.field_i, 11259, (byte) 2, param1, true);
            this.field_v.a((gi) (var4), (long)param1, -1);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_g.field_l[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_g.field_l[param1];
        if (this.field_j != null) {
          this.field_s.a(param1, this.field_j, var18, -127);
          if (this.field_m[param1] != 1) {
            this.field_m[param1] = (byte) 1;
          }
        }
        if (!((lb) (var4)).field_y) {
          ((lb) (var4)).a(param0 - 16240);
        }
        return (lb) (var4);
    }

    final kh a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 > -36) {
          this.a((byte) 56);
        }
        if (null != this.field_g) {
          return this.field_g;
        }
        if (null == this.field_y) {
          if (this.field_k.a(true)) {
            return null;
          }
          this.field_y = (lb) ((Object) this.field_k.a(255, 11259, (byte) 0, this.field_i, true));
        }
        if (this.field_y.field_u) {
          return null;
        }
        var7 = this.field_y.i(13095);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_y instanceof bi) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_g = new kh(var7, this.field_l, this.field_x);
            if (this.field_t != this.field_g.field_t) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_g = null;
            if (!this.field_k.a(true)) {
              this.field_y = (lb) ((Object) this.field_k.a(255, 11259, (byte) 0, this.field_i, true));
            } else {
              this.field_y = null;
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_g = new kh(var7, this.field_l, this.field_x);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_k.b((byte) 122);
            this.field_g = null;
            if (!this.field_k.a(true)) {
              this.field_y = (lb) ((Object) this.field_k.a(255, 11259, (byte) 0, this.field_i, true));
            } else {
              this.field_y = null;
            }
            return null;
          }
          if (this.field_u != null) {
            this.field_s.a(this.field_i, this.field_u, var7, 49);
          }
        }
        if (null != this.field_j) {
          this.field_m = new byte[this.field_g.field_m];
        }
        this.field_y = null;
        return this.field_g;
    }

    final static void e(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (pj.field_G != null) {
          var1 = pj.field_G;
          synchronized (var1) {
            pj.field_G = null;
          }
        }
        if (param0 > -83) {
          de.e(56);
        }
    }

    de(int param0, ik param1, ik param2, gb param3, n param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_v = new tg(16);
        this.field_w = 0;
        this.field_n = new vd();
        this.field_o = 0L;
        try {
          this.field_j = param1;
          this.field_i = param0;
          if (null == this.field_j) {
            this.field_p = false;
          } else {
            this.field_p = true;
            this.field_A = new vd();
          }
          stackIn_7_1 = (param8);
          this.field_r = stackIn_7_1;
          this.field_t = param7;
          this.field_k = param3;
          this.field_x = param6;
          this.field_s = param4;
          this.field_l = param5;
          this.field_u = param2;
          if (null != this.field_u) {
            this.field_y = (lb) ((Object) this.field_s.a(6, this.field_i, this.field_u));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("de.<init>(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_z = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
