/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    private nj[] field_a;
    private d field_e;
    static ki field_d;
    private boolean field_b;
    private bk field_c;

    private final void a(nj[] param0, int param1) {
        try {
          if (param1 < 89) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            this.a(127, (java.awt.Canvas) null);
          }
          if (param0 != this.field_a) {
            if (param0.length == 0) {
              throw new IllegalArgumentException();
            }
            this.field_a = param0;
            this.field_b = false;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ik.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int c(int param0) {
        if (param0 != -10517) {
          ik.c(113);
        }
        if (!oj.a(false) ||
          null == pu.field_e.e((byte) 54)) {
          return -1;
        }
        return pu.field_e.e((byte) 54).field_r;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.field_e = (d) null;
        }
        return this.a(hk.b(-45), 89);
    }

    public static void b(int param0) {
        if (param0 != -1) {
          return;
        }
        field_d = null;
    }

    private final boolean a(java.awt.Canvas param0, int param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_c;
          if (var3 == null ||
            !this.field_b ||
            param0 != var3.field_c) {
            this.a(-101, param0);
          }
          var4 = 113 / ((12 - param1) / 52);
          if (this.field_c != null) {
            this.field_c.field_g.f((int)(wq.a(-116) - this.field_c.field_f));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_c && (var3 == null ||
            this.field_c.field_g != var3.field_g)) {
            stackIn_13_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = false;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ik.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, java.awt.Canvas param1) {
        int var5 = 0;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        nj[] var4 = null;
        nj var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        bk var8 = null;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3 = null;
          if (param0 != -101) {
            this.a(-39);
          }
          var4 = this.field_a;
          for (var5 = 0; var5 < var4.length; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = var4[var5];
            if (var6.field_f) {
              var7_int = var6.field_c;
              if (var7_int != 0) {
                if (var7_int == 5) {
                  if (!sn.field_d.b((byte) 127)) {
                    return;
                  }
                  var7_int = ig.a("hw3d", true);
                  if (var7_int == -1) {
                    var6.field_f = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (100 > var7_int) {
                      return;
                    }
                    var8_int = ig.a("jaclib", true);
                    if (var8_int == -1) {
                      var6.field_f = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var8_int < 100) {
                        return;
                      }
                      var9 = ig.a("jaggl", true);
                      if (var9 == -1) {
                        var6.field_f = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var9 < 100) {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (1 != var7_int) {
                    if (var7_int == 3) {
                      if (!sn.field_d.b((byte) 127)) {
                        return;
                      }
                      var7_int = ig.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.field_f = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = ig.a("jagdx", true);
                        if (var8_int == -1) {
                          var6.field_f = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var8_int < 100) {
                            return;
                          }
                          var9 = ig.a("hw3d", true);
                          if (var9 == -1) {
                            var6.field_f = false;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (100 > var9) {
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (var7_int != 2) {
                        throw new IllegalStateException("UT" + var6.field_c);
                      }
                      if (!sn.field_d.b((byte) 127)) {
                        return;
                      }
                      var7_int = ig.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.field_f = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (100 > var7_int) {
                          return;
                        }
                        var8_int = ig.a("sw3d", true);
                        if (var8_int == -1) {
                          var6.field_f = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (100 > var8_int) {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!sn.field_d.b((byte) 127)) {
                      return;
                    }
                    var7_int = ig.a("jaclib", true);
                    if (-1 == var7_int) {
                      var6.field_f = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (100 > var7_int) {
                        return;
                      }
                      var8_int = ig.a("jaggl", true);
                      if (var8_int == -1) {
                        var6.field_f = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var8_int < 100) {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.field_c) {
                  if (this.field_c.field_d.a(var6, (byte) 95) &&
                    null != this.field_c.field_g &&
                    this.field_c.field_c == param1 &&
                    var6.a(this.field_c, (byte) -123)) {
                    this.field_b = true;
                    return;
                  }
                  if (~this.field_c.field_d.field_c == ~var6.field_c &&
                    this.field_c.field_g != null) {
                    var3 = this.field_c.b(-43);
                    this.field_c.field_g.a((byte) -94);
                    this.field_c = null;
                  }
                }
                try {
                  var11 = ks.a(var6.field_c, param1, this.field_e, true, var6.field_g, ha.field_g);
                  if (var11 != null) {
                    var8 = new bk(var11, var6, param1);
                    if (var6.a(var8, (byte) -36)) {
                      if (this.field_c != null) {
                        if (var8.field_g == this.field_c.field_g &&
                          var8.field_c == this.field_c.field_c) {
                          this.field_c = var8;
                          this.field_b = true;
                          return;
                        }
                        var3 = this.field_c.b(79);
                        this.field_c.field_g.a((byte) -109);
                      }
                      if (var8.field_g.c()) {
                        var8.field_g.a(var8.field_g.c(100663296));
                      }
                      if (var3 == null) {
                        var8.field_f = wq.a(param0 + 59);
                      } else {
                        ((cj) (var3)).a(var8, 3);
                      }
                      this.field_b = true;
                      this.field_c = var8;
                      return;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var7 = decompiledCaughtException;
                  var7.printStackTrace();
                }
                var6.field_f = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_115_0 = var3;
          stackIn_115_1 = new StringBuilder().append("ik.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_116_2 = "null";
          } else {
            stackIn_116_2 = "{...}";
          }
          throw qo.a((Throwable) (stackIn_115_0), ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(')').toString());
        }
    }

    final ha a(int param0) {
        if (param0 >= -89) {
          return (ha) null;
        }
        if (this.field_c == null) {
          return null;
        }
        return this.field_c.field_g;
    }

    ik(int param0, int param1, d param2) {
        this(kd.a((byte) -123, param0), vo.b(param1, -1), param2, lt.field_m, ms.b(-16754));
    }

    private ik(ki param0, ki param1, d param2, wi param3, nj[] param4) {
        this.field_b = false;
        try {
          ha.field_g = param1;
          this.field_e = param2;
          sn.field_d = param0;
          ow.a(-18527, param0, param3);
          this.a(param4, 97);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
