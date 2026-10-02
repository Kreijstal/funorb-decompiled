/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends nh {
    private fi field_g;
    static boolean field_s;
    private int field_h;
    static int[] field_j;
    private ji field_f;
    private pb field_l;
    private int field_p;
    private uf field_i;
    private int field_m;
    private jh field_y;
    static IndexedSprite jewelsBackgroundSprite;
    private byte[] field_k;
    private byte[] field_x;
    private bm field_u;
    private jh field_e;
    private int field_o;
    private boolean field_v;
    private IntrusiveDeque field_t;
    private boolean field_q;
    private IntrusiveDeque field_d;
    private boolean field_w;
    private long field_n;

    final bm a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = Geoblox.field_C;
        if (null != this.field_u) {
          return this.field_u;
        }
        if (this.field_l == null) {
          if (this.field_f.g(20)) {
            return null;
          }
          this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
        }
        if (param0 <= 111) {
          this.b((byte) 65);
        }
        if (this.field_l.field_u) {
          return null;
        }
        {
          var8 = this.field_l.e(397);
          var6 = var8;
          var5 = var6;
          var9 = var5;
          var7 = var9;
          var2 = var7;
          if (this.field_l instanceof o) {
            try {
              if (var2 == null) {
                throw new RuntimeException();
              }
              this.field_u = new bm(var9, this.field_m, this.field_x);
              if (this.field_u.field_g != this.field_h) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_u = null;
              if (!this.field_f.g(20)) {
                this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
              } else {
                this.field_l = null;
              }
              return null;
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_u = new bm(var8, this.field_m, this.field_x);
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_f.e(20);
              this.field_u = null;
              if (this.field_f.g(20)) {
                this.field_l = null;
              } else {
                this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
              }
              return null;
            }
            if (null != this.field_y) {
              this.field_i.a((byte) 88, this.field_p, this.field_y, var8);
            }
          }
          this.field_l = null;
          if (this.field_e != null) {
            this.field_k = new byte[this.field_u.field_b];
          }
          return this.field_u;
        }
    }

    private final pb a(byte param0, int param1, int param2) {
        Object stackIn_55_0 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
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
        pb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Geoblox.field_C;
        var12 = (pb) ((Object) this.field_g.a((long)param2, (byte) -124));
        var4 = var12;
        if (var12 != null) {
          if (param1 == 0) {
            if (!var12.field_q) {
              if (var12.field_u) {
                var12.unlinkNode(false);
                var4 = null;
              }
            }
          }
        }
        if (var4 == null) {
          L2: {
            if (param1 != 0) {
              if (param1 == 1) {
                if (null == this.field_e) {
                  throw new RuntimeException();
                }
                var4 = this.field_i.a(param0 + 131, this.field_e, param2);
              } else {
                if (param1 != 2) {
                  throw new RuntimeException();
                }
                if (null == this.field_e) {
                  throw new RuntimeException();
                }
                if (this.field_k[param2] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_f.b(-21)) {
                  return null;
                }
                var4 = this.field_f.a((byte) 2, this.field_p, param0 + 50, param2, false);
              }
            } else {
              if (null != this.field_e) {
                if (-1 != this.field_k[param2]) {
                  var4 = this.field_i.a(this.field_e, param2, 15079962);
                  break L2;
                }
              }
              if (this.field_f.g(20)) {
                return null;
              }
              var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
            }
          }
          this.field_g.a((byte) 102, (IntrusiveNode) (var4), (long)param2);
        }
        if (((pb) (var4)).field_u) {
          return null;
        }
        {
          var18 = ((pb) (var4)).e(397);
          var13 = var18;
          var5 = var13;
          if (param0 != -71) {
            return (pb) null;
          }
          if (var4 instanceof o) {
            try {
              if (var5 != null) {
                if (var18.length > 2) {
                  WhirlpoolHash.field_f.reset();
                  WhirlpoolHash.field_f.update(var5, 0, var18.length - 2);
                  var6_int = (int)WhirlpoolHash.field_f.getValue();
                  if (var6_int != this.field_u.field_q[param2]) {
                    throw new RuntimeException();
                  }
                  {
                    L12: {
                      if (this.field_u.field_r != null) {
                        if (null != this.field_u.field_r[param2]) {
                          var27 = this.field_u.field_r[param2];
                          var28 = SpriteState.a(-2 + var18.length, 0, var18, 8);
                          for (var9 = 0; var9 < 64; var9++) {
                            if (~var27[var9] != ~var28[var9]) {
                              throw new RuntimeException();
                            }
                          }
                          break L12;
                        }
                      }
                    }
                    var7 = (var5[-2 + var18.length] << 8 & 65280) + (var5[var18.length - 1] & 255);
                    if ((65535 & this.field_u.field_t[param2]) != var7) {
                      throw new RuntimeException();
                    }
                    if (this.field_k[param2] != 1) {
                      if (this.field_k[param2] != 0) {
                      }
                      this.field_k[param2] = (byte) 1;
                    }
                    if (!((pb) (var4)).field_q) {
                      ((pb) (var4)).unlinkNode(false);
                    }
                    stackIn_55_0 = var4;
                    return (pb) ((Object) stackIn_55_0);
                  }
                }
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_k[param2] = (byte)-1;
              ((pb) (var4)).unlinkNode(false);
              if (!((pb) (var4)).field_q) {
                return null;
              }
              if (this.field_f.g(20)) {
                return null;
              }
              var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
              this.field_g.a((byte) 102, (IntrusiveNode) (var4), (long)param2);
              return null;
            }
          }
          try {
            L4: {
              if (var5 != null) {
                if (var18.length > 2) {
                  WhirlpoolHash.field_f.reset();
                  WhirlpoolHash.field_f.update(var5, 0, var18.length - 2);
                  var6_int = (int)WhirlpoolHash.field_f.getValue();
                  if (var6_int != this.field_u.field_q[param2]) {
                    throw new RuntimeException();
                  }
                  L6: {
                    if (null != this.field_u.field_r) {
                      if (null != this.field_u.field_r[param2]) {
                        var30 = this.field_u.field_r[param2];
                        var29 = SpriteState.a(-2 + var18.length, 0, var18, 8);
                        var11 = 0;
                        var9 = var11;
                        L7: while (var11 < 64) {
                          if (~var29[var11] != ~var30[var11]) {
                            throw new RuntimeException();
                          }
                          var11++;
                        }
                        break L6;
                      }
                    }
                  }
                  this.field_f.field_b = 0;
                  this.field_f.field_q = 0;
                  break L4;
                }
              }
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            this.field_f.e(20);
            ((pb) (var4)).unlinkNode(false);
            if (((pb) (var4)).field_q) {
              if (!this.field_f.g(param0 ^ -83)) {
                var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
                this.field_g.a((byte) 102, (IntrusiveNode) (var4), (long)param2);
              }
            }
            return null;
          }
          var5[var18.length - 2] = (byte)(this.field_u.field_t[param2] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_u.field_t[param2];
          if (null != this.field_e) {
            this.field_i.a((byte) 66, param2, this.field_e, var18);
            stackIn_85_0 = ~this.field_k[param2];
            stackIn_85_1 = -2;
            if (stackIn_85_0 != stackIn_85_1) {
              this.field_k[param2] = (byte) 1;
            }
          }
          if (!((pb) (var4)).field_q) {
            ((pb) (var4)).unlinkNode(false);
          }
          return (pb) (var4);
        }
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
          }
          if (param0 < 26) {
            var6 = (String) null;
            bj.a(68, (String) null);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2);
          stackIn_10_1 = new StringBuilder().append("bj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final byte[] b(int param0, int param1) {
        pb var3 = this.a((byte) -71, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(397);
        var3.unlinkNode(false);
        if (param0 != 4) {
            this.b(49);
        }
        return var4;
    }

    final int a(int param0, int param1) {
        pb var3 = (pb) ((Object) this.field_g.a((long)param1, (byte) -102));
        if (param0 < 125) {
            return -119;
        }
        if (var3 != null) {
            return var3.g(0);
        }
        return 0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        jewelsBackgroundSprite = null;
        field_j = null;
    }

    final void b(int param0) {
        if (this.field_e == null) {
            return;
        }
        if (param0 < 80) {
            this.field_n = -51L;
        }
        this.field_v = true;
        if (!(this.field_d != null)) {
            this.field_d = new IntrusiveDeque();
        }
    }

    final void a(int param0) {
        int var3 = 0;
        pb discarded$0 = null;
        pb discarded$1 = null;
        int var4 = Geoblox.field_C;
        if (param0 != 6924) {
            this.b((byte) -7);
        }
        if (!(this.field_d != null)) {
            return;
        }
        if (!(null != this.a((byte) 126))) {
            return;
        }
        IntrusiveNode var2 = this.field_t.firstForIteration(0);
        while (var2 != null) {
            var3 = (int)var2.field_a;
            if (var3 < 0) {
                var2.unlinkNode(false);
            } else {
                if (var3 >= this.field_u.field_b) {
                    var2.unlinkNode(false);
                } else {
                    if (this.field_u.field_a[var3] == 0) {
                        var2.unlinkNode(false);
                    } else {
                        if (this.field_k[var3] == 0) {
                            discarded$0 = this.a((byte) -71, 1, var3);
                        }
                        if (-1 == this.field_k[var3]) {
                            discarded$1 = this.a((byte) -71, 2, var3);
                        }
                        if (!(this.field_k[var3] != 1)) {
                            var2.unlinkNode(false);
                        }
                    }
                }
            }
            var2 = this.field_t.nextForIteration(1);
        }
    }

    final void b(byte param0) {
        pb discarded$1 = null;
        pb discarded$0 = null;
        pb discarded$3 = null;
        pb discarded$2 = null;
        int var2_int;
        pb var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = Geoblox.field_C;
                if (this.field_d != null) {
                  if (null == this.a((byte) 118)) {
                    return;
                  }
                  if (this.field_q) {
                    var2_int = 1;
                    var3 = this.field_d.firstForIteration(0);
                    L4: while (var3 != null) {
                      var4 = (int)var3.field_a;
                      if (this.field_k[var4] == 0) {
                        discarded$1 = this.a((byte) -71, 1, var4);
                      }
                      if (this.field_k[var4] != 0) {
                        var3.unlinkNode(false);
                      } else {
                        var2_int = 0;
                      }
                      var3 = this.field_d.nextForIteration(1);
                    }
                    L5: while (this.field_o < this.field_u.field_a.length) {
                      if (0 == this.field_u.field_a[this.field_o]) {
                        this.field_o = this.field_o + 1;
                        continue L5;
                      }
                      if (this.field_i.field_d < 250) {
                        if (this.field_k[this.field_o] == 0) {
                          discarded$0 = this.a((byte) -71, 1, this.field_o);
                        }
                        if (0 == this.field_k[this.field_o]) {
                          var7 = new IntrusiveNode();
                          var7.field_a = (long)this.field_o;
                          var2_int = 0;
                          this.field_d.addLast(-45, var7);
                        }
                        this.field_o = this.field_o + 1;
                        continue L5;
                      }
                      var2_int = 0;
                      break;
                    }
                    if (var2_int == 0) {
                      break L3;
                    }
                    this.field_o = 0;
                    this.field_q = false;
                    break L3;
                  }
                  if (this.field_v) {
                    var2_int = 1;
                    var3 = this.field_d.firstForIteration(0);
                    L11: while (var3 != null) {
                      var4 = (int)var3.field_a;
                      if (this.field_k[var4] != 1) {
                        discarded$3 = this.a((byte) -71, 2, var4);
                      }
                      if (this.field_k[var4] != 1) {
                        var2_int = 0;
                      } else {
                        var3.unlinkNode(false);
                      }
                      var3 = this.field_d.nextForIteration(1);
                    }
                    L12: while (true) {
                      L13: {
                        if (this.field_o < this.field_u.field_a.length) {
                          if (this.field_u.field_a[this.field_o] != 0) {
                            if (this.field_f.b(-21)) {
                              var2_int = 0;
                              break L13;
                            }
                            if (this.field_k[this.field_o] != 1) {
                              discarded$2 = this.a((byte) -71, 2, this.field_o);
                            }
                            if (this.field_k[this.field_o] != 1) {
                              var6 = new IntrusiveNode();
                              var6.field_a = (long)this.field_o;
                              var2_int = 0;
                              this.field_d.addLast(-97, var6);
                            }
                          }
                          this.field_o = this.field_o + 1;
                          continue L12;
                        }
                      }
                      if (var2_int != 0) {
                        this.field_v = false;
                        this.field_o = 0;
                        break L3;
                      }
                      if (param0 != -38) {
                        this.b(25, 41);
                      }
                      if (!this.field_w) {
                        break L0;
                      }
                      if (~oa.a(-12520) > ~this.field_n) {
                        break L1;
                      }
                      {
                        var2 = (pb) ((Object) this.field_g.a((byte) 125));
                        L17: while (var2 != null) {
                          if (!var2.field_u) {
                            if (var2.field_n) {
                              if (!var2.field_q) {
                                throw new RuntimeException();
                              }
                              var2.unlinkNode(false);
                            } else {
                              var2.field_n = true;
                            }
                          }
                          var2 = (pb) ((Object) this.field_g.b(74));
                        }
                        break L2;
                      }
                    }
                  }
                  this.field_d = null;
                }
              }
              if (param0 != -38) {
                this.b(25, 41);
              }
              if (!this.field_w) {
                break L0;
              }
              if (~oa.a(-12520) > ~this.field_n) {
                break L1;
              }
              var2 = (pb) ((Object) this.field_g.a((byte) 125));
              L22: while (var2 != null) {
                if (!var2.field_u) {
                  if (var2.field_n) {
                    if (!var2.field_q) {
                      throw new RuntimeException();
                    }
                    var2.unlinkNode(false);
                  } else {
                    var2.field_n = true;
                  }
                }
                var2 = (pb) ((Object) this.field_g.b(74));
              }
              break L2;
            }
            this.field_n = 1000L + oa.a(param0 - 12482);
          }
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_g = new fi(16);
        this.field_o = 0;
        this.field_t = new IntrusiveDeque();
        this.field_n = 0L;
        try {
          this.field_e = param1;
          this.field_p = param0;
          if (null == this.field_e) {
            this.field_q = false;
          } else {
            this.field_q = true;
            this.field_d = new IntrusiveDeque();
          }
          this.field_i = param4;
          this.field_y = param2;
          if (!param8) {
            stackIn_7_1 = false;
          } else {
            stackIn_7_1 = true;
          }
          ((bj) (this)).field_w = stackIn_7_1;
          this.field_x = param6;
          this.field_f = param3;
          this.field_h = param7;
          this.field_m = param5;
          if (this.field_y != null) {
            this.field_l = (pb) ((Object) this.field_i.a(this.field_y, this.field_p, 15079962));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var10);
          stackIn_12_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_j = new int[8192];
    }
}
