/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends w {
    private int field_o;
    private pj field_s;
    private sh field_n;
    private na field_l;
    private dl field_p;
    private na field_q;
    private int field_r;
    private pc field_d;
    private jh field_h;
    private byte[] field_j;
    private byte[] field_k;
    private int field_t;
    private boolean field_m;
    private int field_i;
    private boolean field_e;
    private vo field_c;
    private vo field_g;
    private long field_u;
    private boolean field_f;

    final void b(int param0) {
        pj discarded$0 = null;
        pj discarded$1 = null;
        le var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (this.field_c == null) {
          return;
        }
        if (param0 != 0) {
          return;
        }
        if (null == this.b((byte) -103)) {
          return;
        }
        var2 = this.field_g.b((byte) 26);
        while (var2 != null) {
          var3 = (int)var2.field_f;
          if (0 <= var3 &&
            var3 < this.field_h.field_s &&
            0 != this.field_h.field_t[var3]) {
            if (this.field_j[var3] == 0) {
              discarded$0 = this.a(1, var3, param0 + 66);
            }
            if (this.field_j[var3] == -1) {
              discarded$1 = this.a(2, var3, 19);
            }
            if (1 == this.field_j[var3]) {
              var2.b(param0 - 27598);
            }
          } else {
            var2.b(param0 - 27598);
          }
          var2 = this.field_g.a(false);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vn var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        var31 = ZombieDawn.field_J;
        try {
          param5 = param5 << 1;
          var8_int = param2 - param6 - param7;
          var9 = -param6 + (param1 - param7);
          var10 = param6 + (param2 + param7);
          if (var8_int < bi.field_g) {
            var8_int = bi.field_g;
          }
          if (bi.field_b < var10) {
            var10 = bi.field_b;
          }
          var11 = param1 - (-param6 - param7);
          if (bi.field_l > var9) {
            var9 = bi.field_l;
          }
          if (bi.field_d < var11) {
            var11 = bi.field_d;
          }
          var12 = new int[32];
          var13 = 16711935 & param3;
          var14 = 65280 & param3;
          for (var15 = 0; var15 < 16; var15++) {
            var16 = var15 * param4 >> 4;
            var12[var15] = hi.a(eg.a(-16711936, var16 * var13), eg.a(var16 * var14, 16711680)) >>> 8;
            var12[31 - var15] = hi.a(eg.a(var13 * var16, -16711936), eg.a(var14 * var16, 16711680)) >>> 8;
          }
          var15Lifetime1 = var10 - var8_int;
          var16Lifetime1 = -var9 + var11;
          if (0 < var15Lifetime1 &&
            var16Lifetime1 > 0) {
            var17 = new vn(var15Lifetime1, var16Lifetime1);
            var18 = param6 * param6;
            var19 = (param7 + param6) * (param6 + param7);
            var20 = 0;
            var21 = -param1 + var9;
            if (param0 != -1) {
              return;
            }
            var22 = 0;
            while (var22 < var16Lifetime1) {
              var23 = -param2 + var8_int;
              var24 = var23 * var23 + var21 * var21;
              var25 = 0;
              while (var25 < var15Lifetime1) {
                var26 = var22 + var9;
                var27 = var25 + var8_int;
                if (var24 != 0) {
                  if (var18 > var24) {
                    var28 = uf.a(var24 << 12, 12832);
                    var29 = -var28 + (param6 << 6);
                    var30 = -((65536 - fb.a(1311979239, (var29 << 7) / param6)) * param5 >> 11) + var28;
                    var30 = var30 - na.field_c[var25 % 256 + var22 % 256 * 256];
                    var27 = var23 * var30 / var28 + param2;
                    var26 = param1 + var21 * var30 / var28;
                    if (var27 < bi.field_g) {
                      var27 = bi.field_g;
                    }
                    if (var26 < bi.field_l) {
                      var26 = bi.field_l;
                    }
                    if (var27 >= bi.field_b) {
                      var27 = -1 + bi.field_b;
                    }
                    if (bi.field_d <= var26) {
                      var26 = -1 + bi.field_d;
                    }
                  } else {
                    if (var19 > var24) {
                      var28 = uf.a(var24 << 12, 12832);
                      var29 = -(param6 << 6) + var28;
                      var30 = -(param5 * (-fb.a(1311979239, (var29 << 7) / param7) + 65536) >> 11) + var28;
                      var26 = param1 + var30 * var21 / var28;
                      var27 = param2 + var23 * var30 / var28;
                      if (bi.field_l > var26) {
                        var26 = bi.field_l;
                      }
                      if (bi.field_g > var27) {
                        var27 = bi.field_g;
                      }
                      if (var27 >= bi.field_b) {
                        var27 = -1 + bi.field_b;
                      }
                      if (bi.field_d > var26) {
                        var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                        var20++;
                        var25++;
                        var23++;
                        var24 = var24 + (2 * var23 - 1);
                        continue;
                      }
                      var26 = bi.field_d - 1;
                    }
                  }
                }
                var17.field_z[var20] = bi.field_c[var27 + bi.field_f * var26];
                var20++;
                var25++;
                var23++;
                var24 = var24 + (2 * var23 - 1);
              }
              var22++;
              var21++;
            }
            var17.e(var8_int, var9);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var8), "om.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(boolean param0) {
        if (this.field_l == null) {
          return;
        }
        if (param0) {
          return;
        }
        this.field_m = true;
        if (this.field_c == null) {
          this.field_c = new vo();
        }
    }

    final byte[] a(int param0, byte param1) {
        pj var3 = this.a(0, param0, 118);
        if (param1 != 112) {
          return (byte[]) null;
        }
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.d(0);
        var3.b(-27598);
        return var4;
    }

    private final pj a(int param0, int param1, int param2) {
        Object stackIn_59_0 = null;
        int stackIn_88_0 = 0;
        byte stackIn_88_1 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pj var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = ZombieDawn.field_J;
        if (param2 < 10) {
          this.field_l = (na) null;
        }
        var12 = (pj) (this.field_p.a((long)param1, 56));
        var4 = var12;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_r &&
          var12.field_q) {
          var12.b(-27598);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 == 0) {
            if (this.field_l != null &&
              this.field_j[param1] != -1) {
              var4 = this.field_n.a(param1, this.field_l, -114);
            } else {
              if (this.field_d.b(111)) {
                return null;
              }
              var4 = this.field_d.a((byte) 2, true, this.field_o, (byte) -128, param1);
            }
          } else {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              if (this.field_j[param1] != -1) {
                throw new RuntimeException();
              }
              if (this.field_d.a((byte) 123)) {
                return null;
              }
              var4 = this.field_d.a((byte) 2, false, this.field_o, (byte) -88, param1);
            } else {
              if (null == this.field_l) {
                throw new RuntimeException();
              }
              var4 = this.field_n.a((byte) -119, this.field_l, param1);
            }
          }
          this.field_p.a(-110, (long)param1, (le) (var4));
        }
        if (((pj) (var4)).field_q) {
          return null;
        }
        var18 = ((pj) (var4)).d(0);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof wd) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              ep.field_h.reset();
              ep.field_h.update(var5, 0, -2 + var18.length);
              var6_int = (int)ep.field_h.getValue();
              if (var6_int != this.field_h.field_j[param1]) {
                throw new RuntimeException();
              }
              if (null != this.field_h.field_f &&
                null != this.field_h.field_f[param1]) {
                var27 = this.field_h.field_f[param1];
                var28 = nl.a(0, -2 + var18.length, -119, var18);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (var5[var18.length - 1] & 255) + ((var5[-2 + var18.length] & 255) << 8);
              if (var7 != (65535 & this.field_h.field_c[param1])) {
                throw new RuntimeException();
              }
              if (this.field_j[param1] != 1) {
                if (this.field_j[param1] != 0) {
                }
                this.field_j[param1] = (byte) 1;
              }
              if (!((pj) (var4)).field_r) {
                ((pj) (var4)).b(-27598);
              }
              stackIn_59_0 = var4;
              return (pj) (stackIn_59_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_j[param1] = (byte)-1;
            ((pj) (var4)).b(-27598);
            if (((pj) (var4)).field_r) {
              if (this.field_d.b(122)) {
                return null;
              }
              var4 = this.field_d.a((byte) 2, true, this.field_o, (byte) -95, param1);
              this.field_p.a(-108, (long)param1, (le) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            ep.field_h.reset();
            ep.field_h.update(var5, 0, var18.length - 2);
            var6_int = (int)ep.field_h.getValue();
            if (this.field_h.field_j[param1] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_h.field_f != null &&
              null != this.field_h.field_f[param1]) {
              var29 = this.field_h.field_f[param1];
              var30 = nl.a(0, var18.length - 2, -116, var18);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_d.field_h = 0;
            this.field_d.field_e = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_d.a(-90);
          ((pj) (var4)).b(-27598);
          if (!((pj) (var4)).field_r) {
            return null;
          }
          if (this.field_d.b(127)) {
            return null;
          }
          var4 = this.field_d.a((byte) 2, true, this.field_o, (byte) 111, param1);
          this.field_p.a(-102, (long)param1, (le) (var4));
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_h.field_c[param1] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_h.field_c[param1];
        if (this.field_l != null) {
          this.field_n.a((byte) 63, param1, this.field_l, var18);
          stackIn_88_0 = 1;
          stackIn_88_1 = this.field_j[param1];
          if (stackIn_88_0 != stackIn_88_1) {
            this.field_j[param1] = (byte) 1;
          }
        }
        if (!((pj) (var4)).field_r) {
          ((pj) (var4)).b(-27598);
        }
        return (pj) (var4);
    }

    final int a(int param0, int param1) {
        if (param0 > -76) {
          this.field_d = (pc) null;
        }
        pj var3 = (pj) (this.field_p.a((long)param1, 54));
        if (var3 == null) {
          return 0;
        }
        return var3.e(-31478);
    }

    final void a(int param0) {
        pj discarded$3 = null;
        pj discarded$2 = null;
        pj discarded$1 = null;
        pj discarded$0 = null;
        int var2_int;
        pj var2;
        le var3;
        int var4;
        int var5;
        le var6;
        le var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        le var3Lifetime1;
        var5 = ZombieDawn.field_J;
        if (param0 <= 13) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_c != null) {
          if (this.b((byte) -23) == null) {
            return;
          }
          if (this.field_e) {
            var2_int = 1;
            var3 = this.field_c.b((byte) 26);
            while (var3 != null) {
              var4 = (int)var3.field_f;
              if (this.field_j[var4] == 0) {
                discarded$3 = this.a(1, var4, 106);
              }
              if (0 != this.field_j[var4]) {
                var3.b(-27598);
              } else {
                var2_int = 0;
              }
              var3 = this.field_c.a(false);
            }
            L10: while (true) {
              if (this.field_h.field_t.length > this.field_i) {
                if (this.field_h.field_t[this.field_i] != 0) {
                  if (this.field_n.field_k >= 250) {
                    var2_int = 0;
                    break L10;
                  }
                  if (this.field_j[this.field_i] == 0) {
                    discarded$2 = this.a(1, this.field_i, 68);
                  }
                  if (this.field_j[this.field_i] == 0) {
                    var6 = new le();
                    var6.field_f = (long)this.field_i;
                    this.field_c.a(0, var6);
                    var2_int = 0;
                  }
                }
                this.field_i = this.field_i + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_i = 0;
              this.field_e = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_c.b((byte) 26);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_f;
                if (this.field_j[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, var4Lifetime1, 127);
                }
                if (this.field_j[var4Lifetime1] == 1) {
                  var3Lifetime1.b(-27598);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_c.a(false);
              }
              while (this.field_i < this.field_h.field_t.length) {
                if (this.field_h.field_t[this.field_i] == 0) {
                  this.field_i = this.field_i + 1;
                  continue;
                }
                if (!this.field_d.a((byte) 121)) {
                  if (1 != this.field_j[this.field_i]) {
                    discarded$0 = this.a(2, this.field_i, 72);
                  }
                  if (this.field_j[this.field_i] != 1) {
                    var7 = new le();
                    var7.field_f = (long)this.field_i;
                    var2_intLifetime1 = 0;
                    this.field_c.a(0, var7);
                  }
                  this.field_i = this.field_i + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = false;
                this.field_i = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_c = null;
            }
          }
        }
        if (this.field_f &&
          pd.a(-22826) >= this.field_u) {
          var2 = (pj) (this.field_p.a((byte) -113));
          while (var2 != null) {
            if (!var2.field_q) {
              if (!var2.field_t) {
                var2.field_t = true;
              } else {
                if (!var2.field_r) {
                  throw new RuntimeException();
                }
                var2.b(-27598);
              }
            }
            var2 = (pj) (this.field_p.b((byte) -40));
          }
          this.field_u = 1000L + pd.a(-22826);
        }
    }

    final jh b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2 = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        var5 = ZombieDawn.field_J;
        if (this.field_h != null) {
          return this.field_h;
        }
        var2 = -95 % ((47 - param0) / 49);
        if (null == this.field_s) {
          if (this.field_d.b(120)) {
            return null;
          }
          this.field_s = (pj) ((Object) this.field_d.a((byte) 0, true, 255, (byte) 70, this.field_o));
        }
        if (this.field_s.field_q) {
          return null;
        }
        var7 = this.field_s.d(0);
        var6 = var7;
        var3 = var6;
        if (!(this.field_s instanceof wd)) {
          try {
            if (var3 == null) {
              throw new RuntimeException();
            }
            this.field_h = new jh(var7, this.field_t, this.field_k);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = decompiledCaughtException;
            this.field_d.a(-126);
            this.field_h = null;
            if (this.field_d.b(125)) {
              this.field_s = null;
            } else {
              this.field_s = (pj) ((Object) this.field_d.a((byte) 0, true, 255, (byte) 107, this.field_o));
            }
            return null;
          }
          if (this.field_q != null) {
            this.field_n.a((byte) 95, this.field_o, this.field_q, var7);
          }
        } else {
          try {
            if (var3 == null) {
              throw new RuntimeException();
            }
            this.field_h = new jh(var7, this.field_t, this.field_k);
            if (this.field_r != this.field_h.field_e) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = decompiledCaughtException;
            this.field_h = null;
            if (!this.field_d.b(107)) {
              this.field_s = (pj) ((Object) this.field_d.a((byte) 0, true, 255, (byte) 104, this.field_o));
            } else {
              this.field_s = null;
            }
            return null;
          }
        }
        if (this.field_l != null) {
          this.field_j = new byte[this.field_h.field_s];
        }
        this.field_s = null;
        return this.field_h;
    }

    om(int param0, na param1, na param2, pc param3, sh param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_p = new dl(16);
        this.field_i = 0;
        this.field_g = new vo();
        this.field_u = 0L;
        try {
          this.field_l = param1;
          this.field_o = param0;
          if (null == this.field_l) {
            this.field_e = false;
          } else {
            this.field_e = true;
            this.field_c = new vo();
          }
          this.field_d = param3;
          stackIn_7_1 = (param8);
          this.field_f = stackIn_7_1;
          this.field_k = param6;
          this.field_t = param5;
          this.field_n = param4;
          this.field_q = param2;
          this.field_r = param7;
          if (this.field_q != null) {
            this.field_s = (pj) ((Object) this.field_n.a(this.field_o, this.field_q, -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("om.<init>(").append(param0).append(',');
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
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
    }
}
