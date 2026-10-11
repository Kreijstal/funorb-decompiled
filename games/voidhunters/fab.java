/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fab {
    static String field_b;
    bra field_e;
    private fs[] field_c;
    private boolean field_d;
    private d field_a;

    final static void a(int param0, byte[] param1) {
        String var4 = null;
        kc var2_ref = null;
        nkb.a(false, "Reading gamedata from server");
        Object var2 = null;
        try {
          var2_ref = (kc) (beb.a(param1, 6429, jpa.field_c));
        } catch (Exception exception) {
          var4 = ila.a(param1, param0 ^ 29411);
          var2_ref = new kc();
          eg.e((byte) -69);
          gna.a((Throwable) ((Object) exception), "Gamedata is corrupted - " + var4, 0);
        }
        if (var2_ref == null) {
          return;
        }
        if (!(1 >= var2_ref.field_d)) {
          gna.a((Throwable) null, "Gamedata is for a version that doesn't exist yet (" + var2_ref.field_d + ")! The clientdata is probably corrupted.", 0);
          return;
        }
        try {
          nkb.a(false, "Player gamedata=" + var2_ref);
          if (var2_ref != null) {
            nkb.a(false, "Player gamedata blueprint=" + var2_ref.field_f);
          }
          if (param0 != -29365) {
            field_b = (String) null;
          }
          es.field_b = var2_ref;
          dt.a(-118);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fab.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static arb a(asb param0, String param1, int param2, asb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        arb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.b(param4, -95);
          var6 = param3.a(true, var5_int, param1);
          if (param2 != 0) {
            field_b = (String) null;
          }
          stackIn_3_0 = le.a(param3, (byte) -35, param0, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("fab.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        int var5 = 0;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        fs[] var4 = null;
        fs var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        bra var8 = null;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        var10 = VoidHunters.field_G;
        try {
          var3 = null;
          if (param1 >= -77) {
            return;
          }
          var4 = this.field_c;
          for (var5 = 0; var5 < var4.length; var5++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = var4[var5];
            if (var6.field_b) {
              var7_int = var6.field_a;
              if (var7_int != 0) {
                if (var7_int != 5) {
                  if (var7_int == 1) {
                    if (!akb.field_a.b((byte) 87)) {
                      return;
                    }
                    var7_int = ada.a("jaclib", true);
                    if (var7_int == -1) {
                      var6.field_b = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (100 > var7_int) {
                        return;
                      }
                      var8_int = ada.a("jaggl", true);
                      if (var8_int == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var8_int < 100) {
                          return;
                        }
                      }
                    }
                  } else {
                    if (3 == var7_int) {
                      if (!akb.field_a.b((byte) -57)) {
                        return;
                      }
                      var7_int = ada.a("jaclib", true);
                      if (var7_int == -1) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = ada.a("jagdx", true);
                        if (-1 == var8_int) {
                          var6.field_b = false;
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          if (100 > var8_int) {
                            return;
                          }
                          var9 = ada.a("hw3d", true);
                          if (var9 == -1) {
                            var6.field_b = false;
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
                      if (var7_int != 2) {
                        throw new IllegalStateException("UT" + var6.field_a);
                      }
                      if (!akb.field_a.b((byte) -83)) {
                        return;
                      }
                      var7_int = ada.a("jaclib", true);
                      if (-1 == var7_int) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var7_int < 100) {
                          return;
                        }
                        var8_int = ada.a("sw3d", true);
                        if (var8_int == -1) {
                          var6.field_b = false;
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
                } else {
                  if (!akb.field_a.b((byte) 121)) {
                    return;
                  }
                  var7_int = ada.a("hw3d", true);
                  if (var7_int == -1) {
                    var6.field_b = false;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var7_int < 100) {
                      return;
                    }
                    var8_int = ada.a("jaclib", true);
                    if (-1 == var8_int) {
                      var6.field_b = false;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var8_int < 100) {
                        return;
                      }
                      var9 = ada.a("jaggl", true);
                      if (-1 == var9) {
                        var6.field_b = false;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        if (var9 < 100) {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != this.field_e) {
                  if (this.field_e.field_b.a((byte) -94, var6) &&
                    null != this.field_e.field_g &&
                    this.field_e.field_a == param0 &&
                    var6.a(this.field_e, -78)) {
                    this.field_d = true;
                    return;
                  }
                  if (var6.field_a == this.field_e.field_b.field_a &&
                    this.field_e.field_g != null) {
                    var3 = this.field_e.a((byte) -126);
                    this.field_e.field_g.a((byte) 30);
                    this.field_e = null;
                  }
                }
                try {
                  var11 = hr.a(false, param0, var6.field_c, this.field_a, lwa.field_xb, var6.field_a);
                  if (var11 != null) {
                    var8 = new bra(var11, var6, param0);
                    if (var6.a(var8, -97)) {
                      if (this.field_e != null) {
                        if (this.field_e.field_g == var8.field_g &&
                          this.field_e.field_a == var8.field_a) {
                          this.field_d = true;
                          this.field_e = var8;
                          return;
                        }
                        var3 = this.field_e.a((byte) -114);
                        this.field_e.field_g.a((byte) 30);
                      }
                      if (var8.field_g.a()) {
                        var8.field_g.a(var8.field_g.e(100663296));
                      }
                      if (var3 == null) {
                        var8.field_e = wt.a(false);
                      } else {
                        ((t) (var3)).b(1, var8);
                      }
                      this.field_e = var8;
                      this.field_d = true;
                      return;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var7 = decompiledCaughtException;
                  var7.printStackTrace();
                }
                var6.field_b = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_118_0 = var3;
          stackIn_118_1 = new StringBuilder().append("fab.E(");
          if (param0 == null) {
            stackIn_119_2 = "null";
          } else {
            stackIn_119_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_118_0), ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 10970) {
          field_b = (String) null;
        }
    }

    final static void a(int param0, int param1, ds param2, byte[] param3, java.math.BigInteger param4, byte param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          var7_int = kob.a(param1, -18262);
          if (jo.field_a == null) {
            jo.field_a = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param5 != 47) {
            field_b = (String) null;
          }
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = jo.field_a.nextInt();
          }
          if (null == bt.field_a ||
            !(bt.field_a.field_h.length >= var7_int)) {
            bt.field_a = new ds(var7_int);
          }
          bt.field_a.field_e = 0;
          bt.field_a.a(param0, param3, -1, param1);
          bt.field_a.b(var7_int, (byte) 66);
          bt.field_a.a(var13, (byte) 127);
          if (null == pha.field_o ||
            !(pha.field_o.field_h.length >= 100)) {
            pha.field_o = new ds(100);
          }
          pha.field_o.field_e = 0;
          pha.field_o.c(param5 ^ 47, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            pha.field_o.d(var13[var11], param5 ^ 332614567);
            var11++;
          }
          pha.field_o.a(param1, true);
          pha.field_o.a(param6, param4, 16711680);
          param2.a(0, pha.field_o.field_h, -1, pha.field_o.field_e);
          param2.a(0, bt.field_a.field_h, param5 - 48, bt.field_a.field_e);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("fab.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(boolean param0, fs[] param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            fab.a(23);
          }
          if (param1 != this.field_c) {
            if (param1.length == 0) {
              throw new IllegalArgumentException();
            }
            this.field_d = false;
            this.field_c = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("fab.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    fab(d param0, fs[] param1) {
        this(g.a(0), qc.b(0), param0, bm.field_o, param1);
    }

    private fab(asb param0, asb param1, d param2, eab param3, fs[] param4) {
        this.field_d = false;
        try {
          lwa.field_xb = param1;
          akb.field_a = param0;
          this.field_a = param2;
          eu.a(param3, (byte) 127, param0);
          this.a(false, param4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, java.awt.Canvas param1) {
        bra var3 = null;
        RuntimeException var3_ref = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -110) {
            field_b = (String) null;
          }
          var3 = this.field_e;
          if (var3 == null ||
            !this.field_d ||
            var3.field_a != param1) {
            this.a(param1, (byte) -119);
          }
          if (null != this.field_e) {
            this.field_e.field_g.c((int)(wt.a(false) - this.field_e.field_e));
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_e != null && (var3 == null ||
            var3.field_g != this.field_e.field_g)) {
            stackIn_15_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_15_0 = false;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
