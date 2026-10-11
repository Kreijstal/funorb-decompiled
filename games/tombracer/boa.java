/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class boa extends dg {
    private int field_m;
    static pl field_s;
    static long field_t;
    private fla field_w;
    private int field_v;
    static int[] field_n;
    private fla field_r;
    private fla field_q;
    private fla field_x;
    private fla field_u;
    static float[] field_y;
    private int field_p;
    static int field_o;

    final void a(int param0, la param1, kh param2) {
        try {
          if (param0 <= 119) {
            boa.a(false);
          }
          super.a(122, param1, param2);
          this.field_v = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "boa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        super.a((byte) 97, param1);
        this.a(28).b(false).a(this.field_h.e(9648), this.field_h.g((byte) 115), (byte) 46, this.field_h.d(3));
        w var5 = (w) (this.a(30).field_G);
        if (var5 == null) {
          return;
        }
        int var4 = -67 / ((7 - param0) / 36);
        if (this.field_v == 0) {
          var5.a(new fm(3, this.b((byte) -118), this.c((byte) 95), this.e((byte) -89)), -58);
        } else {
          var5.a(new fm(2, this.b((byte) -122), this.c((byte) 109), this.e((byte) -97)), -58);
        }
        if (null != this.field_r) {
          this.field_r.a(-98, var5);
          this.field_r = null;
        }
        if (this.field_q != null) {
          this.field_q.a(-111, var5);
          this.field_q = null;
        }
        if (null != this.field_x) {
          this.field_x.a(27, var5);
          this.field_x = null;
        }
    }

    final void a(int param0, uw param1) {
        w var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          super.a(-61, param1);
          var3 = (w) (this.a(21).field_G);
          if (var3 == null) {
            return;
          }
          if (this.field_r != null) {
            this.field_r.a(50, var3);
            this.field_r = null;
          }
          if (param0 >= -39) {
            return;
          }
          if (null != this.field_q) {
            this.field_q.a(-89, var3);
            this.field_q = null;
          }
          if (this.field_x != null) {
            this.field_x.a(117, var3);
            this.field_x = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("boa.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(gma param0, int param1, gr param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.a(param0, param1, param2);
          if (param2 instanceof mra) {
            this.field_v = 8;
          } else {
            if (4194304 == param0.c(-92) &&
              param0.a((byte) 55) == 4194304) {
              this.field_v = 10;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("boa.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (param0 <= 104) {
          field_o = 62;
        }
        this.field_v = param1;
    }

    boa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_m = 1;
        this.field_p = 1;
    }

    private final boolean i(int param0) {
        boolean stackIn_14_0 = false;
        kh var3;
        if (param0 != 77) {
          var3 = (kh) null;
          this.a(42, (la) null, (kh) null);
        }
        stackIn_14_0 = (this.field_v == 5) || (8 == this.field_v) || (this.field_v == 10) || (this.field_v == 11) || (this.field_v == 12) || (this.field_v == 13) || (this.field_v == 14) || (this.field_v == 15) || (this.field_v == 16);
        return stackIn_14_0;
    }

    public static void a(boolean param0) {
        field_y = null;
        if (param0) {
          return;
        }
        field_s = null;
        field_n = null;
    }

    final void d(int param0) {
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        fsa var3;
        int var4;
        int var7_int;
        nv var7;
        nv var8_ref_nv;
        int var8;
        pc var9;
        int var10;
        w var11;
        vna var12;
        uja var13;
        vna var14;
        uja var15;
        vna var16;
        uja var17;
        int var8Lifetime1;
        pc var9Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = (w) (this.a(111).field_G);
        if (var11 == null) {
          return;
        }
        {
          var3 = (fsa) (this.field_h);
          var4 = var3.d(50, false) ? 1 : 0;
          if ((this.field_r == null ||
            !this.field_r.l((byte) -116)) && var4 != 0) {
            if (this.i(param0 ^ -78)) {
              this.field_r = var11.a(new fm(0, this.b((byte) -113), this.c((byte) 118), this.e((byte) -114)), -58);
            } else if (this.field_v == 9) {
              this.field_r = var11.a(new fm(4, this.b((byte) -112), this.c((byte) 92), this.e((byte) -87)), -58);
            } else {
              this.field_r = var11.a(new fm(1, this.b((byte) 39), this.c((byte) 92), this.e((byte) -109)), -58);
            }
          } else {
            if (null != this.field_r &&
              var4 == 0) {
              this.field_r.a(-96, var11);
              this.field_r = null;
            }
          }
        }
        if (11 == this.field_v) {
          var12 = var3.field_u;
          var13 = new uja(var12);
          var7_int = 0;
          var8_ref_nv = (nv) (var13.a(true));
          while (var8_ref_nv != null) {
            if (var8_ref_nv instanceof ska) {
              var7_int = var7_int != 0 | ((ska) (var8_ref_nv)).g((byte) -68) ? 1 : 0;
            }
            var8_ref_nv = (nv) (var13.a(-1));
          }
          boolean decompiledFrameRemainder0 = true;
          if (var7_int != 0 && (this.field_x == null ||
            !this.field_x.l((byte) -100))) {
            this.field_x = var11.a(new fm(5, this.b((byte) -97), this.c((byte) 107), this.e((byte) -107)), -58);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var7_int == 0 &&
              null != this.field_x) {
              var11.a(new fm(6, this.b((byte) 117), this.c((byte) 108), this.e((byte) -116)), -58);
              this.field_x.a(81, var11);
              this.field_x = null;
            }
          }
          if (null != this.field_x) {
            this.field_x.a(this.b((byte) -114), var11.field_c, -128, var11.field_h, this.c((byte) 105));
          }
        }
        if (16 == this.field_v) {
          var14 = var3.field_u;
          var15 = new uja(var14);
          var7 = (nv) (var15.a(true));
          while (var7 != null) {
            if (var7 instanceof ov) {
              if (((ov) (var7)).b(-98)) {
                var8 = 1;
                var9 = ((ov) (var7)).c(param0 ^ -105);
                while (var9.field_h != null) {
                  if (4 > var8) {
                    var9 = var9.field_h;
                    var8++;
                    continue;
                  }
                  break;
                }
                if (this.field_w != null &&
                  var8 == this.field_m &&
                  this.field_w.l((byte) 91)) {
                  var7 = (nv) (var15.a(-1));
                  continue;
                }
                if (this.field_m < var8) {
                  var11.a(-92, new fm(var8 - 2 + 34, this.b((byte) 30), this.c((byte) 105), this.e((byte) -105)));
                }
                this.field_m = var8;
                if (null != this.field_w) {
                  this.field_w.a(-119, var11);
                  this.field_w = null;
                }
                this.field_w = var11.a(new fm(29 + this.field_m - 1, this.b((byte) -80), this.c((byte) 109), this.e((byte) -97)), -58);
              } else {
                if (null != this.field_w) {
                  this.field_w.a(-94, var11);
                  this.field_w = null;
                  var7 = (nv) (var15.a(-1));
                  continue;
                }
              }
            }
            var7 = (nv) (var15.a(-1));
          }
        }
        if (this.field_v == 15) {
          var16 = var3.field_u;
          var17 = new uja(var16);
          var7 = (nv) (var17.a(true));
          while (var7 != null) {
            if (!(var7 instanceof ov)) {
              var7 = (nv) (var17.a(-1));
              continue;
            }
            if (!((ov) (var7)).b(-19)) {
              if (this.field_u == null) {
                var7 = (nv) (var17.a(-1));
                continue;
              }
              this.field_u.a(param0 - 100, var11);
              this.field_u = null;
              var7 = (nv) (var17.a(-1));
              continue;
            }
            var8Lifetime1 = 1;
            var9Lifetime1 = ((ov) (var7)).c(param0 ^ -110);
            while (var9Lifetime1.field_h != null) {
              if (var8Lifetime1 < 4) {
                var9Lifetime1 = var9Lifetime1.field_h;
                var8Lifetime1++;
                continue;
              }
              break;
            }
            if (null == this.field_u ||
              var8Lifetime1 != this.field_p ||
              !this.field_u.l((byte) -90)) {
              stackIn_75_0 = ~var8Lifetime1;
              stackIn_75_1 = ~this.field_p;
              if (stackIn_75_0 < stackIn_75_1) {
                var11.a(-104, new fm(var8Lifetime1 - 2 + 44, this.b((byte) -85), this.c((byte) 125), this.e((byte) -117)));
              }
              this.field_p = var8Lifetime1;
              if (this.field_u != null) {
                this.field_u.a(-123, var11);
                this.field_u = null;
              }
              this.field_u = var11.a(new fm(39 + this.field_p - 1, this.b((byte) 87), this.c((byte) 127), this.e((byte) -111)), -58);
            }
            var7 = (nv) (var17.a(-1));
          }
        }
        if (var3.j(param0) &&
          null == this.field_q) {
          this.field_q = var11.a(new fm(7, this.b((byte) 122), this.c((byte) 92), this.e((byte) -99)), param0 ^ 57);
        } else {
          if (!var3.j(-1) &&
            null != this.field_q) {
            this.field_q.a(66, var11);
            this.field_q = null;
          }
        }
    }

    final void a(byte param0, kh param1) {
        try {
          super.a((byte) -100, param1);
          param1.a((byte) 42, this.field_v, 4);
          int var3_int = 108 / ((param0 + 8) / 40);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "boa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        super.h(106);
        if (param0 <= 0) {
          field_n = (int[]) null;
        }
    }

    boa(int param0) {
        super(param0);
        this.field_m = 1;
        this.field_p = 1;
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "boa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var9Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = 38 % ((param4 + 38) / 47);
          var7 = 0;
          var8 = null;
          var9 = this.field_v;
          if (var9 == 0) {
            var8 = df.field_J[4];
          } else {
            if (1 == var9) {
              var8 = df.field_J[5];
            } else {
              if (var9 == 2) {
                var8 = df.field_J[7];
              } else {
                if (var9 == 3) {
                  var8 = df.field_J[9];
                  var7 = 4096;
                } else {
                  if (var9 == 4) {
                    var8 = df.field_J[8];
                  } else {
                    if (var9 != 5) {
                      if (var9 == 8) {
                        var8 = df.field_J[6];
                      } else {
                        if (9 == var9) {
                          var7 = 2048;
                          var8 = df.field_J[27];
                        } else {
                          if (var9 != 10) {
                            if (var9 != 12) {
                              if (var9 != 11) {
                                if (var9 != 13) {
                                  if (var9 != 14) {
                                    if (var9 == 15) {
                                      var8 = df.field_J[15];
                                    } else {
                                      if (16 == var9) {
                                        var8 = df.field_J[16];
                                      }
                                    }
                                  } else {
                                    var8 = df.field_J[14];
                                  }
                                } else {
                                  var8 = df.field_J[13];
                                }
                              } else {
                                var8 = df.field_J[11];
                              }
                            } else {
                              var8 = df.field_J[12];
                            }
                          } else {
                            var8 = df.field_J[70];
                          }
                        }
                      }
                    } else {
                      var9 = 77;
                      if (this.field_g < 33) {
                        var9 = 77;
                      }
                      var9 = (this.field_g < 66) ? 78 : 79;
                      var8 = df.field_J[var9];
                    }
                  }
                }
              }
            }
          }
          if (var8 != null) {
            var9Lifetime1 = dfa.a(4096 + (var7 - this.field_h.g(-25787)) >> 2, 2048, -28);
            gqa.a(var9Lifetime1, -83584144, param1, param2, (ka) (var8), param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_49_0 = var6;
          stackIn_49_1 = new StringBuilder().append("boa.D(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_t = 0L;
        field_y = new float[4];
        field_s = new pl(3);
        field_o = 0;
    }
}
