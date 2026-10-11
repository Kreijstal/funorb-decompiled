/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tk {
    private pc field_o;
    static String field_E;
    private int field_u;
    private byte[] field_B;
    static al field_n;
    private byte[] field_p;
    private rl field_y;
    private vh field_i;
    private int field_x;
    private ae field_v;
    private ae field_s;
    static int[] field_z;
    static int[][] field_l;
    static String field_F;
    private int field_D;
    static int[] field_A;
    private we field_h;
    private jf field_q;
    private boolean field_m;
    private mn field_r;
    private int field_j;
    private boolean field_k;
    private mn field_C;
    private long field_t;
    private boolean field_w;

    final int a(int param0, boolean param1) {
        rl var3 = (rl) (this.field_i.a(1, (long)param0));
        if (!param1) {
          String var4 = (String) null;
          tj.a(17, (String) null, (String) null);
        }
        if (var3 != null) {
          return var3.f((byte) 100);
        }
        return 0;
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 != -1) {
          return;
        }
        try {
          if (null != ki.field_c) {
            ki.field_c.n(10);
          }
          om.field_p = new w(param1, param2, false, true, true);
          dn.field_b.a((fj) (om.field_p), (byte) -72);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final rl a(int param0, int param1, int param2) {
        Object stackIn_90_0 = null;
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
        rl var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Confined.field_J ? 1 : 0;
        var12 = (rl) (this.field_i.a(param0 - 13859, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_t &&
          var12.field_v) {
          var12.a(true);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param1) {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_s == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_p[param2]) {
                throw new RuntimeException();
              }
              if (this.field_q.b(-125)) {
                return null;
              }
              var4 = this.field_q.a(this.field_u, false, -1911606496, param2, (byte) 2);
            } else {
              if (null == this.field_s) {
                throw new RuntimeException();
              }
              var4 = this.field_o.a(this.field_s, 0, param2);
            }
          } else {
            if (this.field_s != null &&
              -1 != this.field_p[param2]) {
              var4 = this.field_o.a(param2, this.field_s, (byte) 53);
            } else {
              if (this.field_q.c(93)) {
                return null;
              }
              var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
            }
          }
          this.field_i.a((rk) (var4), param0 ^ 13871, (long)param2);
        }
        if (((rl) (var4)).field_v) {
          return null;
        }
        var18 = ((rl) (var4)).e((byte) 94);
        var13 = var18;
        var5 = var13;
        if (param0 != 13860) {
          this.a((byte) 127);
        }
        if (var4 instanceof sm) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              al.field_e.reset();
              al.field_e.update(var5, 0, -2 + var18.length);
              var6_int = (int)al.field_e.getValue();
              if (var6_int != this.field_h.field_l[param2]) {
                throw new RuntimeException();
              }
              if (null != this.field_h.field_d &&
                this.field_h.field_d[param2] != null) {
                var29 = this.field_h.field_d[param2];
                var30 = in.a(0, var5, var18.length - 2, -26879);
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
              if (var7 != (this.field_h.field_o[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_p[param2] != 1) {
                if (this.field_p[param2] != 0) {
                }
                this.field_p[param2] = (byte) 1;
              }
              if (!((rl) (var4)).field_t) {
                ((rl) (var4)).a(true);
              }
              stackIn_90_0 = var4;
              return (rl) (stackIn_90_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_p[param2] = (byte)-1;
            ((rl) (var4)).a(true);
            if (((rl) (var4)).field_t) {
              if (this.field_q.c(92)) {
                return null;
              }
              var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
              this.field_i.a((rk) (var4), 11, (long)param2);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            al.field_e.reset();
            al.field_e.update(var5, 0, var18.length - 2);
            var6_int = (int)al.field_e.getValue();
            if (var6_int != this.field_h.field_l[param2]) {
              throw new RuntimeException();
            }
            if (null != this.field_h.field_d &&
              null != this.field_h.field_d[param2]) {
              var27 = this.field_h.field_d[param2];
              var28 = in.a(0, var5, var18.length - 2, -26879);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_q.field_a = 0;
            this.field_q.field_e = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_q.a(true);
          ((rl) (var4)).a(true);
          if (!((rl) (var4)).field_t) {
            return null;
          }
          if (!this.field_q.c(param0 - 13755)) {
            var4 = this.field_q.a(this.field_u, true, -1911606496, param2, (byte) 2);
            this.field_i.a((rk) (var4), 11, (long)param2);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_h.field_o[param2] >>> 8);
        var5[var18.length - 1] = (byte)this.field_h.field_o[param2];
        if (this.field_s != null) {
          this.field_o.a(this.field_s, -127, var18, param2);
          if (this.field_p[param2] != 1) {
            this.field_p[param2] = (byte) 1;
          }
        }
        if (!((rl) (var4)).field_t) {
          ((rl) (var4)).a(true);
        }
        return (rl) (var4);
    }

    final byte[] a(int param0, int param1) {
        rl var3 = this.a(13860, param1, param0);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.e((byte) 119);
        var3.a(true);
        return var4;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        fn.f(-1 + param4, param1 - 1, param3 - 1, -1 + param5, param0);
        fn.f(param4, param1 - 1, param3, -1 + param5, param0);
        fn.f(param4 - 1, param1, param3 - 1, param5, param0);
        if (param2 <= 13) {
          field_l = (int[][]) null;
        }
        fn.f(param4, param1, param3, param5, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Confined.field_J ? 1 : 0;
        try {
          var5_int = param2 + param4;
          if (param1 != 1) {
            return;
          }
          var6 = param3 + param0;
          if (param2 > fn.field_c) {
            stackIn_6_0 = param2;
          } else {
            stackIn_6_0 = fn.field_c;
          }
          var7 = stackIn_6_0;
          if (param3 <= fn.field_b) {
            stackIn_9_0 = fn.field_b;
          } else {
            stackIn_9_0 = param3;
          }
          var8 = stackIn_9_0;
          if (var5_int >= fn.field_i) {
            stackIn_12_0 = fn.field_i;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 >= fn.field_j) {
            stackIn_15_0 = fn.field_j;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (fn.field_c <= param2 &&
            fn.field_i > param2) {
            var11 = param2 + fn.field_g * var8;
            var12 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              fn.field_h[var11] = 16777215;
              var11 = var11 + 2 * fn.field_g;
            }
          }
          if (fn.field_b <= param3 &&
            fn.field_j > var6) {
            var11Lifetime1 = var7 + fn.field_g * param3;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              fn.field_h[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (fn.field_c <= var5_int &&
            fn.field_i > var5_int) {
            var11Lifetime2 = fn.field_g * ((1 & -param2 + var5_int) + var8) + var5_int;
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (0 > var12Lifetime2) {
                break;
              }
              fn.field_h[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + fn.field_g * 2;
            }
          }
          if (param3 >= fn.field_b &&
            fn.field_j > var6) {
            var11Lifetime3 = (1 & -param3 + var6) + var7 + fn.field_g * var6;
            var12Lifetime3 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              fn.field_h[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "tj.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        rl discarded$1 = null;
        rl discarded$0 = null;
        rl discarded$3 = null;
        rl discarded$2 = null;
        int var2;
        rk var3;
        rl var3_ref;
        int var4;
        int var5;
        rk var6;
        rk var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        rk var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Confined.field_J ? 1 : 0;
        if (this.field_r != null) {
          if (this.a((byte) -61) == null) {
            return;
          }
          if (this.field_m) {
            var2 = 1;
            var3 = this.field_r.a(-125);
            while (var3 != null) {
              var4 = (int)var3.field_i;
              if (this.field_p[var4] == 0) {
                discarded$1 = this.a(13860, 1, var4);
              }
              if (this.field_p[var4] != 0) {
                var3.a(true);
              } else {
                var2 = 0;
              }
              var3 = this.field_r.d(2123);
            }
            L3: while (true) {
              if (this.field_j < this.field_h.field_t.length) {
                if (this.field_h.field_t[this.field_j] != 0) {
                  if (this.field_o.field_b >= 250) {
                    var2 = 0;
                    break L3;
                  }
                  if (this.field_p[this.field_j] == 0) {
                    discarded$0 = this.a(13860, 1, this.field_j);
                  }
                  if (0 == this.field_p[this.field_j]) {
                    var7 = new rk();
                    var7.field_i = (long)this.field_j;
                    this.field_r.a(var7, (byte) -98);
                    var2 = 0;
                  }
                }
                this.field_j = this.field_j + 1;
                continue;
              }
              break;
            }
            if ((var2 != 0)) {
              this.field_m = false;
              this.field_j = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_k) {
              var2Lifetime2 = 1;
              var3Lifetime1 = this.field_r.a(87);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_i;
                if (this.field_p[var4Lifetime1] != 1) {
                  discarded$3 = this.a(13860, 2, var4Lifetime1);
                }
                if (this.field_p[var4Lifetime1] == 1) {
                  var3Lifetime1.a(true);
                } else {
                  var2Lifetime2 = 0;
                }
                var3Lifetime1 = this.field_r.d(2123);
              }
              L10: while (true) {
                if (this.field_j < this.field_h.field_t.length) {
                  if (this.field_h.field_t[this.field_j] != 0) {
                    if (this.field_q.b(-124)) {
                      var2Lifetime2 = 0;
                      break L10;
                    }
                    if (this.field_p[this.field_j] != 1) {
                      discarded$2 = this.a(13860, 2, this.field_j);
                    }
                    if (this.field_p[this.field_j] != 1) {
                      var6 = new rk();
                      var6.field_i = (long)this.field_j;
                      this.field_r.a(var6, (byte) -84);
                      var2Lifetime2 = 0;
                    }
                  }
                  this.field_j = this.field_j + 1;
                  continue;
                }
                break;
              }
              if ((var2Lifetime2 != 0)) {
                this.field_k = false;
                this.field_j = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_r = null;
            }
          }
        }
        var2Lifetime1 = -50 / ((-13 - param0) / 63);
        if (this.field_w &&
          this.field_t <= ri.a(-3)) {
          var3_ref = (rl) (this.field_i.a(true));
          while (var3_ref != null) {
            if (!var3_ref.field_v) {
              if (!var3_ref.field_w) {
                var3_ref.field_w = true;
              } else {
                if (!var3_ref.field_t) {
                  throw new RuntimeException();
                }
                var3_ref.a(true);
              }
            }
            var3_ref = (rl) (this.field_i.a(70));
          }
          this.field_t = ri.a(-3) + 1000L;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 != 480) {
          return;
        }
        if (0 >= sg.field_x) {
          var2 = (!tj.a(true)) ? 1 : 0;
        } else {
          if (null == gg.field_m) {
            dn.field_d = id.a(2401, ki.field_d, 640, 0, 0, 480);
          } else {
            dn.field_d = gg.field_m.a(20742);
            jk.a(2, false);
          }
          if (dn.field_d == null) {
            var2 = 3;
          } else {
            ac.a(dn.field_d, (byte) -79);
            var2 = 2;
          }
        }
        if (null == gg.field_m &&
          eh.field_gb) {
          q.a(var2, param0, (byte) -107);
        }
    }

    final we a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Confined.field_J ? 1 : 0;
        if (null != this.field_h) {
          return this.field_h;
        }
        if (null == this.field_y) {
          if (this.field_q.c(91)) {
            return null;
          }
          this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
        }
        if (param0 >= -26) {
          return (we) null;
        }
        if (this.field_y.field_v) {
          return null;
        }
        var7 = this.field_y.e((byte) 116);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_y instanceof sm)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_h = new we(var7, this.field_x, this.field_B);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_q.a(true);
            this.field_h = null;
            if (this.field_q.c(-45)) {
              this.field_y = null;
            } else {
              this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
            }
            return null;
          }
          if (null != this.field_v) {
            this.field_o.a(this.field_v, -123, var7, this.field_u);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_h = new we(var7, this.field_x, this.field_B);
            if (this.field_h.field_m != this.field_D) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_h = null;
            if (!this.field_q.c(-69)) {
              this.field_y = (rl) ((Object) this.field_q.a(255, true, -1911606496, this.field_u, (byte) 0));
            } else {
              this.field_y = null;
            }
            return null;
          }
        }
        this.field_y = null;
        if (this.field_s != null) {
          this.field_p = new byte[this.field_h.field_i];
        }
        return this.field_h;
    }

    final void c(byte param0) {
        int var3 = 0;
        rl discarded$0 = null;
        rl discarded$1 = null;
        int var4 = Confined.field_J ? 1 : 0;
        if (this.field_r == null) {
          return;
        }
        if (this.a((byte) -49) == null) {
          return;
        }
        if (param0 >= -106) {
          return;
        }
        rk var2 = this.field_C.a(-115);
        while (var2 != null) {
          var3 = (int)var2.field_i;
          if (var3 < 0) {
            var2.a(true);
          } else {
            if (this.field_h.field_i <= var3) {
              var2.a(true);
            } else {
              if (this.field_h.field_t[var3] == 0) {
                var2.a(true);
              } else {
                if (this.field_p[var3] == 0) {
                  discarded$0 = this.a(13860, 1, var3);
                }
                if (this.field_p[var3] == -1) {
                  discarded$1 = this.a(13860, 2, var3);
                }
                if (this.field_p[var3] == 1) {
                  var2.a(true);
                }
              }
            }
          }
          var2 = this.field_C.d(2123);
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_n = null;
        field_l = (int[][]) null;
        int var1 = 115 % ((param0 + 31) / 61);
        field_E = null;
        field_F = null;
        field_A = null;
    }

    final void b(int param0) {
        if (null == this.field_s) {
          return;
        }
        this.field_k = true;
        if (param0 != -2) {
          field_A = (int[]) null;
        }
        if (null == this.field_r) {
          this.field_r = new mn();
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return fd.field_j;
    }

    tj(int param0, ae param1, ae param2, jf param3, pc param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_i = new vh(16);
        this.field_j = 0;
        this.field_C = new mn();
        this.field_t = 0L;
        try {
          this.field_u = param0;
          this.field_s = param1;
          if (this.field_s == null) {
            this.field_m = false;
          } else {
            this.field_m = true;
            this.field_r = new mn();
          }
          this.field_q = param3;
          stackIn_7_1 = (param8);
          this.field_w = stackIn_7_1;
          this.field_o = param4;
          this.field_x = param5;
          this.field_v = param2;
          this.field_D = param7;
          this.field_B = param6;
          if (this.field_v != null) {
            this.field_y = (rl) ((Object) this.field_o.a(this.field_u, this.field_v, (byte) 53));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("tj.<init>(").append(param0).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_E = "If you get it right, the bolt of#energy it delivers is devastating.#Do not fly through the explosion!";
        field_n = new al("usename");
        field_F = "Extra lives";
        field_A = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_z = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
