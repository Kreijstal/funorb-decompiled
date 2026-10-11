/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private boolean field_e;
    private ei[] field_b;
    private d field_c;
    static boolean[] field_f;
    iqa field_i;
    static int field_a;
    static boolean[] field_g;
    static String field_h;
    static iw field_d;

    final void a(int param0, ei[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            return;
          }
          if (param1 != this.field_b) {
            if (param1.length == 0) {
              throw new IllegalArgumentException();
            }
            this.field_e = false;
            this.field_b = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("di.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != -22765) {
          return;
        }
        field_h = null;
        field_d = null;
    }

    di(d param0, ei[] param1) {
        this(tba.a((byte) 98), cfa.e(-1), param0, dsa.field_c, param1);
    }

    final boolean b(int param0) {
        if (param0 != 100663296) {
          return false;
        }
        return this.a(-101, kw.b((byte) -97));
    }

    final static void a(byte param0, boolean param1) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 ||
          uu.field_a == null) {
          tla.field_e = false;
        }
        if (param1) {
          if (mla.field_a > 0) {
            mla.field_a = mla.field_a - 1;
          } else {
            if (gt.field_a > 0) {
              gt.field_a = gt.field_a - 1;
            } else {
              if (fp.field_e > 0) {
                fp.field_e = fp.field_e - 1;
              }
            }
          }
        } else {
          if (null == uu.field_a) {
            if (ifa.field_n == null) {
              tla.field_e = false;
              if (0 < gt.field_a) {
                gt.field_a = gt.field_a - 1;
              } else {
                if (0 < fp.field_e) {
                  fp.field_e = fp.field_e - 1;
                } else {
                  if (mla.field_a < pna.field_q) {
                    if (mla.field_a == 0) {
                      csa.a(false);
                    }
                    mla.field_a = mla.field_a + 1;
                  }
                }
              }
            } else {
              if (mla.field_a > 0) {
                mla.field_a = mla.field_a - 1;
              } else {
                if (fp.field_e <= 0) {
                  if (pna.field_q > gt.field_a) {
                    if (gt.field_a == 0) {
                      iw.a((byte) -64, true);
                    }
                    gt.field_a = gt.field_a + 1;
                  }
                } else {
                  fp.field_e = fp.field_e - 1;
                }
              }
            }
          } else {
            if (0 < mla.field_a) {
              mla.field_a = mla.field_a - 1;
            } else {
              if (gt.field_a > 0) {
                gt.field_a = gt.field_a - 1;
              } else {
                if (fp.field_e < pna.field_q) {
                  if (0 == fp.field_e) {
                    iw.a((byte) -64, false);
                  }
                  fp.field_e = fp.field_e + 1;
                }
              }
            }
          }
        }
        if (param0 != -98) {
          di.a(57);
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        int var6 = 0;
        Object stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4 = 0;
        ei[] var5 = null;
        ei var7 = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        iqa var9 = null;
        int var10 = 0;
        int var11 = 0;
        ha var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = null;
          var4 = -34 / ((53 - param1) / 58);
          var5 = this.field_b;
          for (var6 = 0; var5.length > var6; var6++) {
            boolean decompiledFrameRemainder0 = true;
            var7 = var5[var6];
            if (var7.field_c) {
              var8_int = var7.field_b;
              if (var8_int != 0) {
                if (var8_int == 5) {
                  if (!lga.field_B.b(-35)) {
                    return;
                  }
                  var8_int = sma.a("hw3d", 28893);
                  if (var8_int == -1) {
                    var7.field_c = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var8_int < 100) {
                      return;
                    }
                    var9_int = sma.a("jaclib", 28893);
                    if (var9_int == -1) {
                      var7.field_c = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var9_int < 100) {
                        return;
                      }
                      var10 = sma.a("jaggl", 28893);
                      if (var10 == -1) {
                        var7.field_c = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var10 < 100) {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (1 != var8_int) {
                    if (var8_int != 3) {
                      if (var8_int != 2) {
                        throw new IllegalStateException("UT" + var7.field_b);
                      }
                      if (!lga.field_B.b(-63)) {
                        return;
                      }
                      var8_int = sma.a("jaclib", 28893);
                      if (-1 == var8_int) {
                        var7.field_c = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (100 > var8_int) {
                          return;
                        }
                        var9_int = sma.a("sw3d", 28893);
                        if (var9_int == -1) {
                          var7.field_c = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (var9_int < 100) {
                            return;
                          }
                        }
                      }
                    } else {
                      if (!lga.field_B.b(-63)) {
                        return;
                      }
                      var8_int = sma.a("jaclib", 28893);
                      if (var8_int == -1) {
                        var7.field_c = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var8_int < 100) {
                          return;
                        }
                        var9_int = sma.a("jagdx", 28893);
                        if (var9_int == -1) {
                          var7.field_c = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (100 > var9_int) {
                            return;
                          }
                          var10 = sma.a("hw3d", 28893);
                          if (-1 == var10) {
                            var7.field_c = false;
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (var10 < 100) {
                              return;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (!lga.field_B.b(-53)) {
                      return;
                    }
                    var8_int = sma.a("jaclib", 28893);
                    if (var8_int == -1) {
                      var7.field_c = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (100 > var8_int) {
                        return;
                      }
                      var9_int = sma.a("jaggl", 28893);
                      if (-1 == var9_int) {
                        var7.field_c = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var9_int < 100) {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.field_i) {
                  if (this.field_i.field_b.a(var7, 55) &&
                    null != this.field_i.field_d &&
                    this.field_i.field_a == param0 &&
                    var7.a(this.field_i, (byte) -126)) {
                    this.field_e = true;
                    return;
                  }
                  if (this.field_i.field_b.field_b == var7.field_b &&
                    this.field_i.field_d != null) {
                    var3 = this.field_i.a((byte) -43);
                    this.field_i.field_d.a(true);
                    this.field_i = null;
                  }
                }
                try {
                  var12 = nw.a(var7.field_a, -29355, this.field_c, var7.field_b, ck.field_a, param0);
                  if (var12 != null) {
                    var9 = new iqa(var12, var7, param0);
                    if (var7.a(var9, (byte) -126)) {
                      if (this.field_i != null) {
                        if (var9.field_d == this.field_i.field_d &&
                          this.field_i.field_a == var9.field_a) {
                          this.field_e = true;
                          this.field_i = var9;
                          return;
                        }
                        var3 = this.field_i.a((byte) -124);
                        this.field_i.field_d.a(true);
                      }
                      if (var9.field_d.j()) {
                        var9.field_d.a(var9.field_d.a(100663296));
                      }
                      if (var3 == null) {
                        var9.field_f = bva.b((byte) -107);
                      } else {
                        ((soa) (var3)).a((byte) -77, var9);
                      }
                      this.field_e = true;
                      this.field_i = var9;
                      return;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = decompiledCaughtException;
                  var8.printStackTrace();
                }
                var7.field_c = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_113_0 = var3;
          stackIn_113_1 = new StringBuilder().append("di.E(");
          if (param0 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_113_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, java.awt.Canvas param1) {
        iqa var3 = null;
        RuntimeException var3_ref = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -101) {
            this.field_e = true;
          }
          var3 = this.field_i;
          if (var3 == null ||
            !this.field_e ||
            var3.field_a != param1) {
            this.a(param1, (byte) -70);
          }
          if (null != this.field_i) {
            this.field_i.field_d.c((int)(bva.b((byte) -107) - this.field_i.field_f));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_i && (var3 == null ||
            var3.field_d != this.field_i.field_d)) {
            stackIn_16_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_16_0 = false;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("di.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private di(cn param0, cn param1, d param2, fia param3, ei[] param4) {
        this.field_e = false;
        try {
          this.field_c = param2;
          ck.field_a = param1;
          lga.field_B = param0;
          vsa.a(param0, param3, -55);
          this.a(0, param4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(uia param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.h(255);
          if (param1 != 107) {
            field_g = (boolean[]) null;
          }
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("di.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.applet.Applet a(int param0) {
        if (param0 <= 16) {
          field_d = (iw) null;
        }
        if (cba.field_a != null) {
          return cba.field_a;
        }
        return (java.applet.Applet) ((Object) kua.field_j);
    }

    static {
        field_f = new boolean[13];
        field_g = new boolean[13];
        field_h = "Ask to join <%0>'s game";
        field_g[6] = true;
        field_g[0] = true;
        field_f[0] = true;
        field_f[6] = true;
        field_f[1] = true;
        field_f[12] = true;
        field_f[4] = true;
        field_f[10] = true;
        field_d = new iw();
    }
}
