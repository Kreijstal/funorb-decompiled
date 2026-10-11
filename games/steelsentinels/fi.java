/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends fa {
    private vk field_B;
    static String field_s;
    static String field_z;
    static String field_t;
    private byte[] field_o;
    private int field_r;
    private fe field_w;
    private int field_F;
    static int field_l;
    private jl field_A;
    private byte[] field_h;
    static RgbSprite field_j;
    private cb field_k;
    private rc field_x;
    static int[] field_g;
    private uh field_m;
    private int field_q;
    static int field_y;
    private rc field_E;
    private boolean field_D;
    private NodeDeque field_C;
    private boolean field_v;
    private NodeDeque field_i;
    private int field_p;
    private long field_n;
    private boolean field_u;

    private final fe a(byte param0, int param1, int param2) {
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        Object stackIn_95_0 = null;
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
        fe var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = SteelSentinels.obfuscationControl;
        var12 = (fe) (this.field_m.a((long)param1, param0 + 232));
        var4 = var12;
        if (param0 != -109) {
          this.field_v = true;
        }
        if (var12 != null &&
          param2 == 0 &&
          !var12.field_B &&
          var12.field_z) {
          var12.unlink(4);
          var4 = null;
        }
        if (var4 == null) {
          if (0 == param2) {
            if (null != this.field_E &&
              this.field_h[param1] != -1) {
              var4 = this.field_k.a(21598, param1, this.field_E);
            } else {
              if (this.field_B.c(param0 - 15)) {
                return null;
              }
              var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) 51);
            }
          } else {
            if (1 == param2) {
              if (null == this.field_E) {
                throw new RuntimeException();
              }
              var4 = this.field_k.a(this.field_E, param1, 3);
            } else {
              if (param2 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_E) {
                throw new RuntimeException();
              }
              if (-1 != this.field_h[param1]) {
                throw new RuntimeException();
              }
              if (this.field_B.b((byte) 126)) {
                return null;
              }
              var4 = this.field_B.a((byte) 2, this.field_r, param1, false, (byte) -94);
            }
          }
          this.field_m.a((long)param1, (IntrusiveNode) (var4), -1816);
        }
        if (((fe) (var4)).field_z) {
          return null;
        }
        var18 = ((fe) (var4)).d((byte) -82);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof df) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              f.field_G.reset();
              f.field_G.update(var5, 0, var18.length - 2);
              var6_int = (int)f.field_G.getValue();
              if (this.field_A.field_a[param1] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_A.field_t &&
                null != this.field_A.field_t[param1]) {
                var30 = this.field_A.field_t[param1];
                var29 = co.a((byte) -37, -2 + var18.length, 0, var18);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = ((var5[-2 + var18.length] & 255) << 8) + (var5[-1 + var18.length] & 255);
              if ((this.field_A.field_m[param1] & 65535) != var7) {
                throw new RuntimeException();
              }
              if (this.field_h[param1] != 1) {
                if (0 != this.field_h[param1]) {
                }
                this.field_h[param1] = (byte) 1;
              }
              if (!((fe) (var4)).field_B) {
                ((fe) (var4)).unlink(4);
              }
              stackIn_95_0 = var4;
              return (fe) (stackIn_95_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_h[param1] = (byte)-1;
            ((fe) (var4)).unlink(param0 ^ -105);
            if (!((fe) (var4)).field_B) {
              return null;
            }
            if (!this.field_B.c(62)) {
              var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) 55);
              this.field_m.a((long)param1, (IntrusiveNode) (var4), -1816);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            f.field_G.reset();
            f.field_G.update(var5, 0, var18.length - 2);
            var6_int = (int)f.field_G.getValue();
            if (var6_int != this.field_A.field_a[param1]) {
              throw new RuntimeException();
            }
            if (null != this.field_A.field_t &&
              null != this.field_A.field_t[param1]) {
              var27 = this.field_A.field_t[param1];
              var28 = co.a((byte) -37, var18.length - 2, 0, var18);
              for (var9 = 0; var9 < 64; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_B.field_f = 0;
            this.field_B.field_t = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_B.a(14900);
          ((fe) (var4)).unlink(4);
          if (((fe) (var4)).field_B) {
            if (this.field_B.c(-93)) {
              return null;
            }
            var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) -128);
            this.field_m.a((long)param1, (IntrusiveNode) (var4), -1816);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_A.field_m[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_A.field_m[param1];
        if (null != this.field_E) {
          this.field_k.a((byte) 98, this.field_E, param1, var18);
          stackIn_63_0 = -2;
          stackIn_63_1 = ~this.field_h[param1];
          if (stackIn_63_0 != stackIn_63_1) {
            this.field_h[param1] = (byte) 1;
          }
        }
        if (!((fe) (var4)).field_B) {
          ((fe) (var4)).unlink(4);
        }
        return (fe) (var4);
    }

    final void d(int param0) {
        int var4 = 0;
        fe discarded$0 = null;
        fe discarded$1 = null;
        int var5 = SteelSentinels.obfuscationControl;
        if (null == this.field_C) {
          return;
        }
        if (null == this.b((byte) 114)) {
          return;
        }
        IntrusiveNode var2 = this.field_i.first(13058);
        int var3 = 51 / ((55 - param0) / 37);
        while (var2 != null) {
          var4 = (int)var2.key;
          if (0 > var4) {
            var2.unlink(4);
          } else {
            if (this.field_A.field_u <= var4) {
              var2.unlink(4);
            } else {
              if (0 == this.field_A.field_j[var4]) {
                var2.unlink(4);
              } else {
                if (this.field_h[var4] == 0) {
                  discarded$0 = this.a((byte) -109, var4, 1);
                }
                if (-1 == this.field_h[var4]) {
                  discarded$1 = this.a((byte) -109, var4, 2);
                }
                if (this.field_h[var4] == 1) {
                  var2.unlink(4);
                }
              }
            }
          }
          var2 = this.field_i.next((byte) -126);
        }
    }

    public static void c(int param0) {
        field_s = null;
        field_t = null;
        field_j = null;
        field_g = null;
        if (param0 != 2) {
          field_z = (String) null;
        }
        field_z = null;
    }

    final static e a(int param0, String param1, int param2) {
        e var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new e(false);
          var3.field_e = param1;
          if (param0 < 4) {
            var4 = (String) null;
            fi.a(-111, (String) null, 49);
          }
          var3.field_a = param2;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final jl b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = SteelSentinels.obfuscationControl;
        if (param0 != 114) {
          return (jl) null;
        }
        if (null != this.field_A) {
          return this.field_A;
        }
        if (this.field_w == null) {
          if (this.field_B.c(param0 ^ -8)) {
            return null;
          }
          this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) -114));
        }
        if (this.field_w.field_z) {
          return null;
        }
        var8 = this.field_w.d((byte) -52);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_w instanceof df) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_A = new jl(var9, this.field_F, this.field_o);
            if (this.field_q != this.field_A.field_k) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_A = null;
            if (this.field_B.c(62)) {
              this.field_w = null;
            } else {
              this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) 33));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_A = new jl(var8, this.field_F, this.field_o);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_B.a(14900);
            this.field_A = null;
            if (!this.field_B.c(89)) {
              this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) -127));
            } else {
              this.field_w = null;
            }
            return null;
          }
          if (null != this.field_x) {
            this.field_k.a((byte) 78, this.field_x, this.field_r, var8);
          }
        }
        this.field_w = null;
        if (null != this.field_E) {
          this.field_h = new byte[this.field_A.field_u];
        }
        return this.field_A;
    }

    final void c(byte param0) {
        fe discarded$0 = null;
        fe discarded$2 = null;
        fe discarded$1 = null;
        fe discarded$4 = null;
        fe discarded$3 = null;
        int var2_int;
        fe var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        if (param0 >= -56) {
          discarded$0 = this.a((byte) -11, 3, -96);
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_C) {
          if (this.b((byte) 114) == null) {
            return;
          }
          if (this.field_D) {
            var2_int = 1;
            var3 = this.field_C.first(13058);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_h[var4] == 0) {
                discarded$2 = this.a((byte) -109, var4, 1);
              }
              if (this.field_h[var4] != 0) {
                var3.unlink(4);
              } else {
                var2_int = 0;
              }
              var3 = this.field_C.next((byte) -101);
            }
            while (this.field_p < this.field_A.field_j.length) {
              if (0 == this.field_A.field_j[this.field_p]) {
                this.field_p = this.field_p + 1;
                continue;
              }
              if (this.field_k.field_f < 250) {
                if (this.field_h[this.field_p] == 0) {
                  discarded$1 = this.a((byte) -109, this.field_p, 1);
                }
                if (this.field_h[this.field_p] == 0) {
                  var7 = new IntrusiveNode();
                  var7.key = (long)this.field_p;
                  this.field_C.addLast(3, var7);
                  var2_int = 0;
                }
                this.field_p = this.field_p + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_D = false;
              this.field_p = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_v) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_C.first(13058);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (1 != this.field_h[var4Lifetime1]) {
                  discarded$4 = this.a((byte) -109, var4Lifetime1, 2);
                }
                if (this.field_h[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.unlink(4);
                }
                var3Lifetime1 = this.field_C.next((byte) -19);
              }
              scanLoop1: while (true) {
                if (this.field_A.field_j.length > this.field_p) {
                  if (this.field_A.field_j[this.field_p] != 0) {
                    if (this.field_B.b((byte) 102)) {
                      var2_intLifetime1 = 0;
                      break scanLoop1;
                    }
                    if (this.field_h[this.field_p] != 1) {
                      discarded$3 = this.a((byte) -109, this.field_p, 2);
                    }
                    if (this.field_h[this.field_p] != 1) {
                      var6 = new IntrusiveNode();
                      var6.key = (long)this.field_p;
                      this.field_C.addLast(3, var6);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_v = false;
                this.field_p = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_C = null;
            }
          }
        }
        if (this.field_u &&
          mm.a(-109) >= this.field_n) {
          var2 = (fe) (this.field_m.b(0));
          while (var2 != null) {
            if (!var2.field_z) {
              if (var2.field_C) {
                if (!var2.field_B) {
                  throw new RuntimeException();
                }
                var2.unlink(4);
              } else {
                var2.field_C = true;
              }
            }
            var2 = (fe) (this.field_m.a((byte) 127));
          }
          this.field_n = 1000L + mm.a(-89);
        }
    }

    final byte[] a(int param0, int param1) {
        fe var3 = this.a((byte) -109, param0, 0);
        if (var3 == null) {
          return null;
        }
        int var4 = -50 % ((40 - param1) / 32);
        byte[] var5 = var3.d((byte) -80);
        var3.unlink(4);
        return var5;
    }

    final int a(boolean param0, int param1) {
        fe var3 = (fe) (this.field_m.a((long)param1, 127));
        if (var3 != null) {
          return var3.g(16);
        }
        if (param0) {
          this.field_C = (NodeDeque) null;
          return 0;
        }
        return 0;
    }

    final void d(byte param0) {
        if (null == this.field_E) {
          return;
        }
        this.field_v = true;
        if (param0 != 74) {
          this.field_r = -97;
        }
        if (this.field_C == null) {
          this.field_C = new NodeDeque();
        }
    }

    final static String e(int param0) {
        int var1 = -29 % ((-61 - param0) / 57);
        String var2 = "";
        if (jd.field_kb != null) {
          var2 = jd.field_kb.h((byte) -70);
        }
        if (0 == var2.length()) {
          var2 = wa.a((byte) -43);
        }
        if (var2.length() == 0) {
          var2 = un.field_a;
        }
        return var2;
    }

    final static int a(boolean param0) {
        if (2 > nj.field_Q) {
          return 0;
        }
        if (dh.field_D != 0) {
          if (ok.field_f != null) {
            if (!ok.field_f.a(param0)) {
              return 14;
            }
            if (!ok.field_f.a(12145, "")) {
              return 29;
            }
            if (!ok.field_f.a("", (byte) 90)) {
              return 29;
            }
          }
          if (!ke.field_k.a(true)) {
            return 43;
          }
          if (!ke.field_k.a("commonui", (byte) 90)) {
            return 57;
          }
          if (!oe.field_d.a(true)) {
            return 71;
          }
          if (!oe.field_d.a("commonui", (byte) 90)) {
            return 80;
          }
          if (!id.field_bc.a(true)) {
            return 82;
          }
          if (!id.field_bc.a(25)) {
            return 86;
          }
        } else {
          if (!ke.field_k.a(true)) {
            return 20;
          }
          if (!ke.field_k.a("commonui", (byte) 90)) {
            return 40;
          }
          if (!oe.field_d.a(true)) {
            return 50;
          }
          if (!oe.field_d.a("commonui", (byte) 90)) {
            return 60;
          }
          if (!id.field_bc.a(true)) {
            return 70;
          }
          if (!id.field_bc.a(25)) {
            return 80;
          }
        }
        if (!param0) {
          fi.c(-55);
        }
        return 100;
    }

    fi(int param0, rc param1, rc param2, vk param3, cb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_m = new uh(16);
        this.field_p = 0;
        this.field_i = new NodeDeque();
        this.field_n = 0L;
        try {
          this.field_E = param1;
          this.field_r = param0;
          if (this.field_E != null) {
            this.field_D = true;
            this.field_C = new NodeDeque();
          } else {
            this.field_D = false;
          }
          this.field_x = param2;
          this.field_k = param4;
          this.field_F = param5;
          this.field_q = param7;
          this.field_B = param3;
          this.field_o = param6;
          stackIn_7_1 = (param8);
          this.field_u = stackIn_7_1;
          if (this.field_x != null) {
            this.field_w = (fe) ((Object) this.field_k.a(21598, this.field_r, this.field_x));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("fi.<init>(").append(param0).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_z = "ADVANCED";
        field_s = "Accept";
        field_y = 2;
    }
}
