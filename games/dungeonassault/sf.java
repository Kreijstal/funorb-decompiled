/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf implements cl {
    static int field_h;
    static String field_e;
    static int[] field_b;
    private wm field_f;
    static md field_c;
    private int field_a;
    static String field_i;
    private int field_d;
    static int field_g;
    private pj field_j;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          var1_int = gg.field_a[0];
          var2 = 1;
          while (gg.field_a.length > var2) {
            var3 = gg.field_a[var2];
            cj.a(hf.field_yb, var2 << 4, hf.field_yb, var1_int, var3);
            var1_int = var1_int + var3;
            var2++;
            if (var4 != 0) {
              return;
            }
          }
          if (param0 != 3) {
            field_b = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "sf.L(" + param0 + ')');
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = bl.field_d[3].field_y;
          param0 = param0 - (this.field_a + var4_int);
          var5 = var4_int + 32;
          param2 = param2 - (var4_int + this.field_d);
          var6 = param0 / var5;
          var7 = param2 / var5;
          if (param1 != 19091) {
            field_e = (String) null;
          }
          if (0 <= param0 &&
            param2 >= 0 &&
            var6 < 7 &&
            7 > var7) {
            stackIn_16_0 = var6 + 7 * var7;
            return stackIn_16_0;
          }
          stackIn_18_0 = -1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "sf.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1) {
        try {
          if (param0 != 15122) {
            this.a(-109, -25);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.K(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        try {
          if (param0 != 2985) {
            this.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ')');
        }
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = bl.field_d[3].field_y;
          var4 = 32 + var3_int;
          var5 = param0 % 7;
          var6 = param0 / 7;
          if (param1 != -15390) {
            this.field_a = 43;
          }
          stackIn_4_0 = new gg(var5 * var4 + (this.field_a + var3_int) + 16, var6 * var4 + var3_int + (this.field_d + 16));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "sf.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param0) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(j.a((byte) 124, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref2;
            stackIn_9_1 = new StringBuilder().append("sf.O(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(byte param0) {
        try {
          int var2_int = 27 / ((param0 - 4) / 45);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.H(" + param0 + ')');
        }
    }

    public final void a(boolean param0) {
        try {
          if (!param0) {
            this.b((byte) -123);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.C(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 114) {
            field_b = (int[]) null;
          }
          field_e = null;
          field_i = null;
          field_c = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "sf.N(" + param0 + ')');
        }
    }

    public final void b(byte param0) {
        wm stackIn_5_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        ai var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_169_0Lifetime1;
        int stackIn_169_1Lifetime1;
        int stackIn_203_0Lifetime1;
        int stackIn_203_1Lifetime1;
        int var10Lifetime1;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        var16 = DungeonAssault.field_K;
        try {
          var2_int = bl.field_d[3].field_y;
          var3 = var2_int + 32;
          var4 = var2_int + 7 * var3;
          gf.b(this.field_a - 4, this.field_d - 4, 8 + var4, var4 + 8, 0);
          rp.a(8, 2 + var4, (byte) 108, -1 + this.field_a, var4 + 2, kc.field_S, this.field_d - 1);
          if (this.field_j == null) {
            stackIn_5_0 = this.field_f;
          } else {
            stackIn_5_0 = this.field_j.b((byte) -6);
          }
          var5 = stackIn_5_0;
          var6 = 0;
          if (param0 != -55) {
            this.b((byte) 36);
          }
          var7 = this.field_a;
          var8 = this.field_d;
          var9 = 0;
          L2: while (true) {
            if (var9 < 7) {
              stackIn_171_0 = 0;
              if (var16 != 0) {
                break L2;
              }
              var10 = stackIn_171_0;
              while (7 > var10) {
                stackIn_169_0 = -1;
                stackIn_169_1 = ~var9;
                if (stackIn_169_0 <= stackIn_169_1) {
                  bl.field_d[0].h(var2_int + var7, var8);
                } else {
                  var11_int = 0;
                  if (this.field_f.a(35 + var6, (byte) 96)) {
                    var12 = -7 + var6;
                    if (var5.a(35 + var6, (byte) 97)) {
                      boolean decompiledFrameRemainder1 = true;
                      if (null != this.field_j && (!this.field_j.field_j.a(var6, (byte) 104) &&
                        this.field_j.field_B != var6 ||
                        !this.field_j.field_j.a(var12, (byte) 90) &&
                        ~var12 != ~this.field_j.field_B)) {
                        stackIn_40_0 = 0;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        stackIn_40_0 = 1;
                      }
                      var13 = stackIn_40_0;
                      stackIn_44_0 = (var13 != 0) ? 1 : 2;
                      var11_int = stackIn_44_0;
                    }
                  }
                  bl.field_d[var11_int].h(var2_int + var7, var8);
                }
                if (0 >= var10) {
                  bl.field_d[3].h(var7, var2_int + var8);
                } else {
                  var11_intLifetime1 = 3;
                  if (this.field_f.a(-1 - var6 / 7 + var6, (byte) 103)) {
                    var12Lifetime1 = -1 + var6;
                    if (var5.a(-1 + (-(var6 / 7) + var6), (byte) 122)) {
                      boolean decompiledFrameRemainder0 = true;
                      if (null != this.field_j && (!this.field_j.field_j.a(var6, (byte) 115) &&
                        this.field_j.field_B != var6 ||
                        !this.field_j.field_j.a(var12Lifetime1, (byte) 97) &&
                        this.field_j.field_B != var12Lifetime1)) {
                        stackIn_72_0 = 0;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        stackIn_72_0 = 1;
                      }
                      var13Lifetime1 = stackIn_72_0;
                      stackIn_76_0 = (var13Lifetime1 != 0) ? 4 : 5;
                      var11_intLifetime1 = stackIn_76_0;
                    }
                  }
                  bl.field_d[var11_intLifetime1].h(var7, var8 + var2_int);
                }
                if (this.field_j != null) {
                  var11 = this.field_j.field_h[var6];
                } else {
                  var11 = qj.field_c[var6];
                  if (var11 == null) {
                    var11 = gm.field_d.field_L[var6];
                  }
                }
                var12Lifetime2 = var11.field_a;
                if (this.field_j != null &&
                  !this.field_j.field_p.a(var6, (byte) 72)) {
                  stackIn_89_0 = 0;
                } else {
                  stackIn_89_0 = 1;
                }
                var13Lifetime2 = stackIn_89_0;
                if (var13Lifetime2 == 0 &&
                  24 != var6) {
                  var12Lifetime2 = 1;
                }
                if (3 != var12Lifetime2) {
                  if (null != this.field_j &&
                    this.field_j.field_j != null &&
                    this.field_j.field_j.a(var6, (byte) 68)) {
                    stackIn_107_0 = 1;
                  } else {
                    stackIn_107_0 = 0;
                  }
                  var14 = stackIn_107_0;
                  if (var13Lifetime2 == 0) {
                    stackIn_111_0 = 0;
                  } else {
                    stackIn_111_0 = this.c(var6, param0 ^ -87);
                  }
                  var15 = stackIn_111_0;
                  if (var12Lifetime2 == 1) {
                    ja.field_b[1].h(var2_int + var7, var2_int + var8);
                  } else if (0 == var12Lifetime2) {
                    ja.field_b[0].h(var7 + var2_int, var8 + var2_int);
                    p.field_G[var15].d(var7 + var2_int, var2_int + var8, 128);
                    qe.b(var7 + var2_int, var8 + var2_int, 32, 32, 0, 0, 0);
                  } else {
                    ja.field_b[var12Lifetime2].h(var7 + var2_int, var2_int + var8);
                    if (var6 != 24) {
                      p.field_G[var15].d(var2_int + var7, var8 + var2_int, 64);
                    }
                    if (var14 != 0) {
                      sm.field_g.d((-sm.field_g.field_y + 32 >> 1) + (var2_int + var7), (32 - sm.field_g.field_v >> 1) + (var8 + var2_int), 128);
                    }
                  }
                } else if (0 == var6) {
                  ja.field_b[3].h(var2_int + var7, var2_int + var8);
                } else if (var6 != 6) {
                  if (var6 == 42) {
                    ja.field_b[3].g(var2_int + var7, var8 + var2_int);
                  } else if (48 == var6) {
                    ja.field_b[3].b(var7 + var2_int, var8 + var2_int);
                  }
                } else {
                  ja.field_b[3].f(var7 + var2_int, var2_int + var8);
                }
                if (this.field_j != null) {
                  if (var6 == this.field_j.field_q) {
                    rj.field_k.h(var7 - (-2 - (var3 - rj.field_k.field_E >> 1)), 2 + (var8 + (-rj.field_k.field_G + var3 >> 1)));
                  } else {
                    if (~this.field_j.field_B == ~var6) {
                      rj.field_k.d((var3 - rj.field_k.field_E >> 1) + 2 + var7, (var3 - rj.field_k.field_G >> 1) + (2 + var8), 128);
                    }
                  }
                }
                var7 = var7 + var3;
                var10++;
                var6++;
              }
              bl.field_d[3].h(var7, var8 + var2_int);
              var7 = this.field_a;
              var9++;
              stackIn_169_0Lifetime1 = var8;
              stackIn_169_1Lifetime1 = var3;
              var8 = stackIn_169_0Lifetime1 + stackIn_169_1Lifetime1;
              continue L2;
            }
            stackIn_171_0 = 0;
            break;
          }
          var9 = stackIn_171_0;
          do {
            if (var9 >= 7) {
              jh.c();
              gf.e(this.field_a, this.field_d, this.field_a + var4, this.field_d + var4);
              var7 = this.field_a;
              var8 = this.field_d;
              break;
            }
            bl.field_d[0].h(var7 + var2_int, var8);
            var9++;
            var7 = var7 + var3;
          } while (var16 == 0);
          var9 = 0;
          while (8 > var9) {
            if (var16 != 0) {
              return;
            }
            var10Lifetime1 = 0;
            while (var10Lifetime1 < 8) {
              stackIn_203_0 = var9;
              stackIn_203_1 = 3;
              if (stackIn_203_0 != stackIn_203_1 &&
                var9 != 4 ||
                var10Lifetime1 != 3 &&
                var10Lifetime1 != 4) {
                gf.b(-1 + var7, -1 + var8, 2 + var2_int, 2 + var2_int, 8421504);
                gf.b(var7, var8, var2_int, var2_int, 16777215);
              } else {
                gf.b(var7 - 2, -2 + var8, var2_int + 4, var2_int + 4, 8421504);
                gf.b(-1 + var7, -1 + var8, 2 + var2_int, var2_int + 2, 16777215);
              }
              var7 = var7 + var3;
              var10Lifetime1++;
            }
            var9++;
            var7 = this.field_a;
            stackIn_203_0Lifetime1 = var8;
            stackIn_203_1Lifetime1 = var3;
            var8 = stackIn_203_0Lifetime1 + stackIn_203_1Lifetime1;
          }
          jh.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "sf.G(" + param0 + ')');
        }
    }

    public final void c(int param0) {
        try {
          if (param0 != -30876) {
            sf.d(27, 16);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2) {
        try {
          if (param0 != -9398) {
            field_g = -19;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void b(int param0) {
        try {
          if (param0 != -20827) {
            this.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sf.J(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_101_0Lifetime1;
        int stackIn_101_1Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var16 = DungeonAssault.field_K;
        try {
          if (null == this.field_j) {
            return;
          }
          if (param2 <= 0 &&
            !param0) {
            return;
          }
          var4_int = (int)(0.5 + Math.cos((double)((float)mo.field_a / 5.0f)) * 3.0);
          var5 = this.field_j.b((byte) -128).a((byte) -53, this.field_j.field_v);
          if (param1 != -1723) {
            return;
          }
          var6 = 36;
          var7 = 4;
          var8 = 0;
          var9 = var7 + this.field_a;
          var10 = this.field_d + var7;
          var11 = 0;
          while (var11 < 7) {
            if (var16 != 0) {
              return;
            }
            var12 = 0;
            while (7 > var12) {
              stackIn_101_0 = ~var11;
              stackIn_101_1 = -1;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_101_0 < stackIn_101_1 &&
                var5.a(35 + var8, (byte) 106)) {
                var13 = var8 - 7;
                decompiledFrameRemainder1 = !(!this.field_j.field_m.a(var8, (byte) 83));
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = !(!this.field_j.field_m.a(var13, (byte) 68)))) {
                  if (!this.field_j.field_j.a(var8, (byte) 77) &&
                    var8 != this.field_j.field_q) {
                    stackIn_33_0 = 0;
                  } else {
                    stackIn_33_0 = 1;
                  }
                  var14 = stackIn_33_0;
                  if (!this.field_j.field_j.a(var13, (byte) 78) &&
                    ~var13 != ~this.field_j.field_q) {
                    stackIn_40_0 = 0;
                  } else {
                    stackIn_40_0 = 1;
                  }
                  var15 = stackIn_40_0;
                  if (var14 == 0 ||
                    var15 != 0) {
                    if (((var14 == 0)) &&
                      ((var15 != 0))) {
                      i.field_v.h(-1 + (var9 + (var6 - i.field_v.field_y >> 1)), (-i.field_v.field_v - 4 >> 1) + (var4_int + var10));
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    fo.field_a.h((var6 - fo.field_a.field_y >> 1) + (-1 + var9), (-fo.field_a.field_v - 4 >> 1) - var4_int + var10);
                  }
                }
              }
              if ((decompiledFrameRemainder1) && (0 < var12 &&
                var5.a(-1 + var8 - var8 / 7, (byte) 84))) {
                var13Lifetime1 = var8 - 1;
                if (this.field_j.field_m.a(var8, (byte) 110) && (this.field_j.field_m.a(var13Lifetime1, (byte) 79) ||
                  var16 != 0)) {
                  if (!this.field_j.field_j.a(var8, (byte) 84) &&
                    this.field_j.field_q != var8) {
                    stackIn_77_0 = 0;
                  } else {
                    stackIn_77_0 = 1;
                  }
                  var14Lifetime1 = stackIn_77_0;
                  if (!this.field_j.field_j.a(var13Lifetime1, (byte) 93) &&
                    this.field_j.field_q != var13Lifetime1) {
                    stackIn_84_0 = 0;
                  } else {
                    stackIn_84_0 = 1;
                  }
                  var15Lifetime1 = stackIn_84_0;
                  if (var14Lifetime1 != 0 ||
                    var15Lifetime1 == 0) {
                    if (((var14Lifetime1 != 0)) &&
                      ((var15Lifetime1 == 0))) {
                      qi.field_i.h(var9 + (-var4_int + (-qp.field_a.field_y - 2 >> 1)), -1 + var10 + (-qp.field_a.field_v + var6 >> 1));
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    qp.field_a.h((-qp.field_a.field_y - 2 >> 1) + (var9 + var4_int), var10 + (-1 + (var6 - qp.field_a.field_v >> 1)));
                  }
                }
              }
              var8++;
              var9 = var9 + var6;
              var12++;
            }
            var9 = var7 + this.field_a;
            stackIn_101_0Lifetime1 = var10;
            stackIn_101_1Lifetime1 = var6;
            var10 = stackIn_101_0Lifetime1 + stackIn_101_1Lifetime1;
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "sf.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 82) {
            stackIn_2_0 = -82;
            return stackIn_2_0;
          }
          var3_int = 0;
          if (param0 % 7 != 0 &&
            this.field_f.a(-1 + (param0 - param0 / 7), (byte) 99)) {
            var3_int = var3_int | 1;
          }
          if (6 != param0 % 7 &&
            this.field_f.a(param0 - param0 / 7, (byte) 89)) {
            var3_int = var3_int | 2;
          }
          if (param0 > 6 &&
            this.field_f.a(param0 + 35, (byte) 70)) {
            var3_int = var3_int | 4;
          }
          if (param0 < 42 &&
            this.field_f.a(42 + param0, (byte) 74)) {
            var3_int = var3_int | 8;
          }
          stackIn_28_0 = var3_int;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "sf.P(" + param0 + ',' + param1 + ')');
        }
    }

    sf(go param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = DungeonAssault.field_K;
        try {
          var4_int = bl.field_d[3].field_y;
          var5 = 32 + var4_int;
          var6 = var4_int + var5 * 7;
          if (null == param0) {
            this.field_f = gm.field_d.field_k;
            this.field_j = null;
            if (var13 != 0) {
              this.field_j = param0.field_Y;
              this.field_f = this.field_j.field_v;
            }
          } else {
            this.field_j = param0.field_Y;
            this.field_f = this.field_j.field_v;
          }
          this.field_a = param1 - (var6 >> 1);
          this.field_d = param2 - (var6 >> 1);
          this.a(15122, 0);
          this.a(15122, 6);
          this.a(15122, 42);
          this.a(15122, 48);
          this.b(-20827);
          jh.c();
          p.field_G = new cn[16];
          var7 = 0;
          L2: while (true) {
            stackIn_9_0 = 16;
            stackIn_9_1 = var7;
            if (stackIn_9_0 > stackIn_9_1) {
              var8 = new cn(32, 32);
              var8.e();
              gf.b(0, 0, 32, 32, 65793);
              var9 = 16777215;
              var10 = 10;
              var11 = -var10 + (32 - var10);
              if (var13 != 0) {
                return;
              }
              var12 = 0;
              while (var12 < 2) {
                gf.b(var10, var10, var11, var11, var9);
                stackIn_9_0 = -1;
                stackIn_9_1 = ~(var7 & 1);
                if (stackIn_9_0 != stackIn_9_1) {
                  gf.b(0, var10, var11 + var10, var11, var9);
                }
                if ((var7 & 2) != 0) {
                  gf.b(var10, var10, var11 + var10, var11, var9);
                }
                if ((4 & var7) != 0) {
                  gf.b(var10, 0, var11, var10 + var11, var9);
                }
                if ((8 & var7) != 0) {
                  gf.b(var10, var10, var11, var11 + var10, var9);
                }
                var9 = 0;
                var11 -= 2;
                var10++;
                var12++;
              }
              p.field_G[var7] = var8;
              var7++;
              continue L2;
            }
            break;
          }
          jh.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_35_0 = var4;
          stackIn_35_1 = new StringBuilder().append("sf.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        fa var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        fa var2Lifetime1;
        boolean stackIn_19_0Lifetime1;
        var4 = DungeonAssault.field_K;
        try {
          oo.field_d = param1;
          var2 = (fa) (ud.field_v.e(-24172));
          var3 = -72 / ((param0 + 32) / 61);
          while (var2 != null) {
            stackIn_19_0 = var2.field_o.c(-71);
            if (var4 != 0) {
              while (true) {
                if (!stackIn_19_0) {
                  var2.a(false);
                }
                var2.field_n.h(128 + oo.field_d * var2.field_l >> 8);
                var2 = (fa) (oi.field_F.a(4));
                return;
              }
            }
            if (!stackIn_19_0) {
              var2.a(false);
            }
            if (stackIn_19_0 ||
              var4 != 0) {
              var2.field_n.h(oo.field_d * var2.field_l + 128 >> 8);
            }
            var2 = (fa) (ud.field_v.a(4));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          if (oi.field_F != null) {
            var2Lifetime1 = (fa) (oi.field_F.e(-24172));
            while (var2Lifetime1 != null) {
              if (var4 != 0) {
                return;
              }
              stackIn_19_0Lifetime1 = var2Lifetime1.field_o.c(-70);
              if (!stackIn_19_0Lifetime1) {
                var2Lifetime1.a(false);
              } else {
                var2Lifetime1.field_n.h(128 + oo.field_d * var2Lifetime1.field_l >> 8);
              }
              var2Lifetime1 = (fa) (oi.field_F.a(4));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "sf.M(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_g = 0;
        field_b = new int[]{1052688, 1056800, 1056784, 4198416, 2105408, 4202560};
        field_i = "Vampire Bats";
        field_c = new md();
    }
}
