/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends wda {
    private int field_r;
    static int field_q;
    private int field_p;
    private int field_o;

    final static void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          opa.a(ap.field_d, 0, ola.field_Eb, param0, (byte) -100, ota.field_c, true);
          var2_int = 0;
          do {
            if (!(ola.field_Eb > var2_int)) {
              opa.a(ma.field_g, param0, ola.field_Eb + param0, param0 + param0, (byte) -100, kc.field_a, false);
              break;
            }
            boa.field_n[var2_int + param0] = var2_int;
            var2_int++;
          } while (var3 == 0);
          if (param0 < ola.field_Eb) {
            ola.field_Eb = param0;
          }
          if (param1 != 29) {
            ri.a(10, -96, -65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "ri.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void e(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        mu stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        kh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        mu var6 = null;
        mu var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        mu var6Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var1 = vc.field_q;
          var2 = var1.h(255);
          if (var2 == 0) {
            if (null == bla.field_G) {
              bla.field_G = new af(128);
              tba.field_k = 0;
            }
            stackIn_11_0 = (var1.h(255) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.e((byte) -76);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.e((byte) -76);
            }
            var6 = uh.a(var4_ref_String, param0 ^ -14105);
            var7_ref = var1.e((byte) -76);
            var8 = jd.a(1, (CharSequence) ((Object) var4_ref_String));
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = uh.a(var7_ref, param0 - 14132);
              if (null != var6) {
                bla.field_G.a(-1, var6, (long)var8.hashCode());
              }
            }
            if (null == var6) {
              var6 = new mu();
              bla.field_G.a(param0 ^ -14181, var6, (long)var8.hashCode());
              fieldTemp$1 = tba.field_k;
              tba.field_k = tba.field_k + 1;
              var6.field_Db = fieldTemp$1;
              wv.field_l.b((byte) -116, var6);
            }
            var6.field_yb = var5;
            var6.field_tb = var4_ref_String;
            var6.field_vb = var7_ref;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (1 == ae.field_g) {
                ae.field_g = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == ae.field_g) {
                ae.field_g = 1;
              }
              return;
            }
            if (var2 != 4) {
              ssa.a("F1: " + kk.a(32), (byte) 116, (Throwable) null);
              if (param0 != 14180) {
                field_q = 74;
              }
              dea.a(param0 ^ 14168);
              return;
            }
            ae.field_g = 1;
            var3 = var1.e((byte) -76);
            ol.field_b = ((String) (var3)).intern();
            var4 = var1.h(255);
            ifa.d(var4, 3);
            return;
          }
          if (hia.field_s == null) {
            hia.field_s = new af(128);
            ii.field_a = 0;
          }
          var3Lifetime1 = var1.e((byte) -76);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.e((byte) -76);
          var5Lifetime1 = var1.e((byte) -76);
          var6Lifetime1 = wp.a(121, var4_ref_StringLifetime1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = wp.a(param0 ^ 14095, var5Lifetime1);
            if (var6Lifetime1 != null) {
              hia.field_s.a(-1, var6Lifetime1, (long)jd.a(1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new mu();
            hia.field_s.a(-1, var6Lifetime1, (long)jd.a(1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$0 = ii.field_a;
            ii.field_a = ii.field_a + 1;
            var6Lifetime1.field_Db = fieldTemp$0;
            fla.field_f.b((byte) -61, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_vb = var5Lifetime1;
          var6Lifetime1.field_Cb = (String) (var3Lifetime1);
          var6Lifetime1.field_tb = var4_ref_StringLifetime1;
          var6Lifetime1.p(70);
          var7 = (mu) (fla.field_f.f(-80));
          L9: while (true) {
            if (null != var7) {
              stackIn_55_0 = var7;
              if (var9 != 0) {
                break L9;
              }
              if (ol.a(stackIn_55_0, true, var6Lifetime1)) {
                var7 = (mu) (fla.field_f.e(param0 - 14058));
                continue;
              }
            }
            stackIn_55_0 = var7;
            break;
          }
          if (stackIn_55_0 == null) {
            fla.field_f.b((byte) -112, var6Lifetime1);
            if (var9 == 0) {
              return;
            }
          }
          ln.a(var7, var6Lifetime1, (byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "ri.N(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1) {
        try {
          this.field_r = param1;
          if (param0 != -35) {
            this.field_r = 106;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ri.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = this.field_p / 2;
          var4 = 18 / ((param0 + 69) / 42);
          var3 = 0;
          if ((this.field_r <= 0 ||
            this.field_o + this.field_r >= var2_int) && (this.field_r >= 0 ||
            -var2_int >= -this.field_r + this.field_o)) {
            if (this.field_r > 0) {
              var3Lifetime1 = var2_int - this.field_o;
              if (var5 != 0) {
                var3Lifetime1 = var2_int + this.field_o;
              }
            } else {
              var3Lifetime1 = var2_int + this.field_o;
            }
            this.field_r = -this.field_r;
            if (var5 != 0) {
              var3Lifetime1 = this.field_r;
            }
          } else {
            var3Lifetime1 = this.field_r;
          }
          this.field_o = this.field_o + var3Lifetime1;
          this.field_n.c(false, var3Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "ri.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        try {
          if (param0 != 1) {
            field_q = 91;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ri.V(" + param0 + ')');
        }
    }

    ri(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_r = bla.a(true, 12, param1.b((byte) 44, 12));
          this.field_p = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ri.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param2 <= 1))) {
            stackIn_10_0 = 0;
            stackIn_10_1 = 1 & param2;
            if (var4 == 0) {
              if (stackIn_10_0 != stackIn_10_1) {
                var3_int = var3_int * param0;
              }
              param2 = param2 >> 1;
              param0 = param0 * param0;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = 1;
            stackIn_10_1 = param2;
          }
          if (stackIn_10_0 == stackIn_10_1) {
            stackIn_13_0 = param0 * var3_int;
            return stackIn_13_0;
          }
          if (param1 == 0) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0;
          }
          stackIn_16_0 = -97;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "ri.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            field_q = -97;
          }
          stackIn_4_0 = 16;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ri.P(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        try {
          this.field_p = param1;
          if (!param0) {
            this.field_r = 121;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ri.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -78) {
            return;
          }
          super.a(param0, (byte) -101);
          param0.a((byte) -125, dqa.a(true, this.field_r, 12), 12);
          param0.a((byte) 108, cn.a((byte) -127, this.field_p, 8192, 8), 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ri.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.addMouseListener(wna.field_n);
          param0.addMouseMotionListener(wna.field_n);
          if (!param1) {
            return;
          }
          param0.addFocusListener(wna.field_n);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ri.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        try {
          super.c((byte) -121);
          this.field_r = -this.field_r;
          this.field_o = -this.field_o;
          if (param0 >= -116) {
            this.a((kh) null, (byte) -85);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ri.L(" + param0 + ')');
        }
    }

    ri(la param0, boolean param1) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_r = 16;
          this.field_p = cba.a((byte) -123, 90.0, 8192);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ri.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_r = 54;
          }
          param1 = fs.a((byte) 26, param1, this.field_r);
          stackIn_4_0 = param1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "ri.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final static nh a(ha param0, byte param1, byte[] param2) {
        java.awt.Canvas var3 = null;
        InterruptedException var3_ref = null;
        RuntimeException var3_ref2 = null;
        java.awt.Image var4 = null;
        java.awt.MediaTracker var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        java.awt.image.PixelGrabber var9 = null;
        nh stackIn_2_0 = null;
        nh stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3 = nma.field_l;
            if (param1 >= -59) {
              stackIn_2_0 = (nh) null;
              return stackIn_2_0;
            }
            var4 = java.awt.Toolkit.getDefaultToolkit().createImage(param2);
            var5 = new java.awt.MediaTracker((java.awt.Component) ((Object) nma.field_l));
            var5.addImage(var4, 0);
            var5.waitForAll();
            var6 = var4.getWidth((java.awt.image.ImageObserver) ((Object) var3));
            var7 = var4.getHeight((java.awt.image.ImageObserver) ((Object) var3));
            var8 = new int[var7 * var6];
            var9 = new java.awt.image.PixelGrabber(var4, 0, 0, var6, var7, var8, 0, var6);
            var9.grabPixels();
            stackIn_4_0 = param0.a(var8, var7, 122, var6, var6, 0);
            return stackIn_4_0;
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (InterruptedException) (Object) decompiledCaughtException;
            stackIn_6_0 = null;
            return (nh) (stackIn_6_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref2;
          stackIn_10_1 = new StringBuilder().append("ri.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
