/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ga {
    oh field_b;
    boolean field_y;
    oh field_A;
    int field_w;
    int field_u;
    int field_d;
    int field_q;
    static jj field_k;
    int field_e;
    int field_t;
    int field_B;
    int field_v;
    static int field_j;
    static java.math.BigInteger field_o;
    int field_g;
    String field_n;
    pc field_m;
    int field_s;
    oh field_i;
    int field_h;
    String field_z;
    static String field_p;
    int field_f;
    static jj field_r;
    static String field_l;
    int field_x;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            dh var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_39_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_38_0 = 0;
            if (4 <= jg.field_kb.field_i) {
              if (jg.field_kb.field_l != -1) {
                if (-2 != jg.field_kb.field_l) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (-1 == (hm.field_N ^ -1)) {
                      bj.field_c = mc.field_b.a(lg.field_h, eb.field_B, (byte) 60);
                      hm.field_N = hm.field_N + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != hm.field_N) {
                      break L2;
                    } else {
                      if ((bj.field_c.field_d ^ -1) == -3) {
                        stackOut_13_0 = o.a(-1, (byte) -112);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (bj.field_c.field_d == 1) {
                          hm.field_N = hm.field_N + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (-3 != (hm.field_N ^ -1)) {
                      break L3;
                    } else {
                      gi.field_l = new tf((java.net.Socket) (bj.field_c.field_e), mc.field_b);
                      var2 = new dh(13);
                      ej.a(ng.field_y, -25563, var2, tj.field_wb, ai.field_c);
                      var2.i(15, -121);
                      var2.e(rf.field_v, 8959);
                      gi.field_l.a(13, 0, (byte) -97, var2.field_i);
                      hm.field_N = hm.field_N + 1;
                      t.field_b = 30000L + ll.a(1000);
                      break L3;
                    }
                  }
                  L4: {
                    if (hm.field_N == 3) {
                      if ((gi.field_l.a(0) ^ -1) < -1) {
                        var1_int = gi.field_l.b(0);
                        if (var1_int != 0) {
                          stackOut_29_0 = o.a(var1_int, (byte) -112);
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          hm.field_N = hm.field_N + 1;
                          break L4;
                        }
                      } else {
                        if (t.field_b < ll.a(1000)) {
                          stackOut_25_0 = o.a(-2, (byte) -127);
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (hm.field_N == 4) {
                    jg.field_kb.a(-1456343840, gi.field_l, dg.field_b);
                    bj.field_c = null;
                    gi.field_l = null;
                    hm.field_N = 0;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L5: {
                      if (param0 <= -104) {
                        break L5;
                      } else {
                        field_l = (String) null;
                        break L5;
                      }
                    }
                    stackOut_38_0 = -1;
                    stackIn_39_0 = stackOut_38_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return o.a(-3, (byte) -119);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_35_0;
                    } else {
                      return stackIn_39_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(byte param0) {
        int var2 = 0;
        if (!(this.field_b == null)) {
            var2 = var2 + od.field_c[this.field_b.field_g].field_s;
        }
        if (this.field_A != null) {
            var2 = var2 + od.field_c[this.field_A.field_g].field_s;
        }
        int var3 = -15 / ((param0 - -30) / 42);
        if (!(this.field_i == null)) {
            var2 = var2 + this.field_i.field_d * od.field_c[this.field_i.field_g].field_s;
        }
        if (!(null == this.field_m)) {
            var2 = var2 + sj.field_a[this.field_m.field_f].field_f;
        }
        this.field_x = var2;
        var2 = var2 - this.field_v;
        if (-1 < (var2 ^ -1)) {
            var2 = 0;
        }
        this.field_u = var2 + this.field_v;
        this.field_s = this.field_w * this.field_v / this.field_u;
        if (!(-1 >= (this.field_s ^ -1))) {
            this.field_s = 0;
        }
        if (-101 > (this.field_u ^ -1)) {
            this.field_u = 100;
        }
        return this.field_x;
    }

    final void a(rk param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                this.field_m = (pc) null;
                break L1;
              }
            }
            L2: {
              if (null != this.field_b) {
                this.field_b.field_d = 8;
                this.field_b.field_c = od.field_c[this.field_b.field_g].field_o;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_A == null) {
                break L3;
              } else {
                this.field_A.field_d = 8;
                this.field_A.field_c = od.field_c[this.field_A.field_g].field_o;
                break L3;
              }
            }
            L4: {
              if (null != this.field_i) {
                if ((this.field_i.field_d ^ -1) > -3) {
                  this.field_i.field_d = 2;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ga.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 97 % ((-19 - param0) / 58);
          this.field_d = (this.field_f + this.field_g) % 12;
          if (this.field_y) {
            L1: {
              if ((this.field_d ^ -1) == -2) {
                this.field_d = 3;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (2 != this.field_d) {
                break L2;
              } else {
                this.field_d = 5;
                break L2;
              }
            }
            if (-10 != (this.field_d ^ -1)) {
              break L0;
            } else {
              this.field_d = 7;
              break L0;
            }
          } else {
            L3: {
              if (this.field_d != 0) {
                break L3;
              } else {
                this.field_d = 1;
                break L3;
              }
            }
            L4: {
              if (this.field_d == 3) {
                this.field_d = 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_d ^ -1) == -5) {
                this.field_d = 9;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-6 != (this.field_d ^ -1)) {
                break L6;
              } else {
                this.field_d = 1;
                break L6;
              }
            }
            L7: {
              if ((this.field_d ^ -1) == -7) {
                this.field_d = 2;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_d == 7) {
                this.field_d = 9;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-9 != (this.field_d ^ -1)) {
                break L9;
              } else {
                this.field_d = 1;
                break L9;
              }
            }
            if (-12 != (this.field_d ^ -1)) {
              break L0;
            } else {
              this.field_d = 2;
              break L0;
            }
          }
        }
    }

    final static void b(byte param0) {
        if (null == a.field_b) {
            return;
        }
        if (param0 < 19) {
            return;
        }
        hk.a(a.field_b, (byte) -91);
        a.field_b.a(nj.field_l, 4);
        a.field_b = null;
        if (!(ab.field_b == null)) {
            ab.field_b.a(101);
        }
        ae.field_G.requestFocus();
    }

    final static void d(int param0) {
        int var1 = mk.a(-1);
        int var2 = mc.a(55);
        ck.field_a.a(var1 + (nb.field_e << 834423489), vi.field_o + -nb.field_e, var2 - -(eb.field_D << 1491761953), 0, -eb.field_D + jh.field_m);
        if (param0 != -6513) {
            field_p = (String) null;
        }
        sh.a(param0 ^ 6512);
    }

    private final void a(byte param0) {
        String[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            this.field_y = true;
            var2 = ph.field_r;
            if (this.field_d == 1) {
              break L1;
            } else {
              if (this.field_d == 2) {
                break L1;
              } else {
                if ((this.field_d ^ -1) != -10) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_y = false;
          var2 = rl.field_b;
          break L0;
        }
        L2: {
          this.field_g = (int)(Math.random() * (double)var2.length);
          if (param0 == 85) {
            break L2;
          } else {
            field_j = 12;
            break L2;
          }
        }
        L3: {
          this.field_f = (int)(Math.random() * (double)af.field_d.length);
          var3 = this.field_g & 127;
          if (var3 <= var2.length) {
            break L3;
          } else {
            var3 = var3 % var2.length;
            break L3;
          }
        }
        L4: {
          var4 = this.field_f;
          if (af.field_d.length >= var4) {
            break L4;
          } else {
            var4 = var4 % af.field_d.length;
            break L4;
          }
        }
        L5: {
          this.field_n = var2[var3];
          this.field_z = af.field_d[var4];
          if (!this.field_y) {
            break L5;
          } else {
            this.field_g = this.field_g | 128;
            break L5;
          }
        }
        L6: {
          L7: {
            if (this.field_n.compareTo("Yi") == 0) {
              break L7;
            } else {
              if (0 != this.field_n.compareTo("Thomas")) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          if (-1 != (this.field_z.compareTo("de Rivaz") ^ -1)) {
            break L6;
          } else {
            this.field_t = (int)(20.0 * Math.random()) + 50;
            this.field_w = 50 + (int)(20.0 * Math.random());
            this.field_v = 50 + (int)(20.0 * Math.random());
            this.field_B = (int)(Math.random() * 20.0) + 50;
            this.field_q = (int)(20.0 * Math.random()) + 50;
            break L6;
          }
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_l = null;
        field_p = null;
        field_a = null;
        field_r = null;
        field_o = null;
        if (param0) {
            field_p = (String) null;
        }
    }

    final static bg[] a(byte param0, int param1, fa param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bg[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bg[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (vh.a(param3, param1, param2, true)) {
              var4_int = 35 / ((-65 - param0) / 58);
              stackOut_3_0 = uc.o(-28336);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("ga.L(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bg[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, int param1, cc param2) {
        try {
            qb.field_a.a(param2, -16611);
            if (param0 != 7) {
                ga.d(113);
            }
            ia.a(param1, param2, -74);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ga.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        this.field_y = -1 > (128 & this.field_g ^ -1) ? true : false;
        if (param0 != 50) {
            this.field_g = 19;
        }
        String[] var2 = ph.field_r;
        if (!(this.field_y)) {
            var2 = rl.field_b;
        }
        int var3 = 127 & this.field_g;
        if (var3 > var2.length) {
            var3 = var3 % var2.length;
        }
        int var4 = this.field_f;
        if (!(af.field_d.length >= var4)) {
            var4 = var4 % af.field_d.length;
        }
        this.field_n = var2[var3];
        this.field_z = af.field_d[var4];
    }

    final String a(int param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        L0: {
          var6 = Terraphoenix.field_V;
          var7 = this.field_n + " " + this.field_z;
          var3 = var7;
          var3 = var7;
          var3 = var7;
          if (-2 != (this.field_h ^ -1)) {
            break L0;
          } else {
            var3 = "# " + var7;
            break L0;
          }
        }
        L1: {
          if ((this.field_h ^ -1) != -3) {
            break L1;
          } else {
            var3 = "$ " + var3;
            break L1;
          }
        }
        L2: {
          if ((this.field_h ^ -1) != -4) {
            break L2;
          } else {
            var3 = "@ " + var3;
            break L2;
          }
        }
        L3: {
          var4 = 20;
          if (param0 == -1426) {
            break L3;
          } else {
            this.field_h = 55;
            break L3;
          }
        }
        L4: while (true) {
          L5: {
            if (param1 >= og.field_f.b(var3)) {
              break L5;
            } else {
              if ((var4 ^ -1) >= -2) {
                break L5;
              } else {
                var3 = mm.a(this.field_n.charAt(0), 0);
                var5 = 1;
                L6: while (true) {
                  if (var5 >= var4) {
                    L7: {
                      var8 = var3 + "." + this.field_z;
                      var3 = var8;
                      var3 = var8;
                      var3 = var8;
                      if (1 != this.field_h) {
                        break L7;
                      } else {
                        var3 = "# " + var8;
                        break L7;
                      }
                    }
                    L8: {
                      if (2 != this.field_h) {
                        break L8;
                      } else {
                        var3 = "$ " + var3;
                        break L8;
                      }
                    }
                    if (-4 == (this.field_h ^ -1)) {
                      var3 = "@ " + var3;
                      var4--;
                      continue L4;
                    } else {
                      var4--;
                      continue L4;
                    }
                  } else {
                    if (this.field_n.length() > var5) {
                      var3 = var3 + this.field_n.charAt(var5);
                      var5++;
                      continue L6;
                    } else {
                      var5++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
          var4 = 20;
          L9: while (true) {
            L10: {
              if (param1 >= og.field_f.b(var3)) {
                break L10;
              } else {
                if (var4 <= 0) {
                  break L10;
                } else {
                  var3 = this.field_n.charAt(0) + ".";
                  var5 = 0;
                  L11: while (true) {
                    if (var5 >= var4) {
                      L12: {
                        if (this.field_h == 1) {
                          var3 = "# " + var3;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (2 == this.field_h) {
                          var3 = "$ " + var3;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var4--;
                      if ((this.field_h ^ -1) != -4) {
                        continue L9;
                      } else {
                        var3 = "@ " + var3;
                        continue L9;
                      }
                    } else {
                      if (var5 < this.field_z.length()) {
                        var3 = var3 + this.field_z.charAt(var5);
                        var5++;
                        continue L11;
                      } else {
                        var5++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
            L14: {
              if (param1 >= og.field_f.b(var3)) {
                break L14;
              } else {
                L15: {
                  var9 = mm.a(this.field_z.charAt(0), 0);
                  var3 = var9;
                  var3 = var9;
                  var3 = var9;
                  if (-2 != (this.field_h ^ -1)) {
                    break L15;
                  } else {
                    var3 = "# " + var9;
                    break L15;
                  }
                }
                L16: {
                  if ((this.field_h ^ -1) == -3) {
                    var3 = "$ " + var3;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                if ((this.field_h ^ -1) != -4) {
                  break L14;
                } else {
                  var3 = "@ " + var3;
                  break L14;
                }
              }
            }
            return var3;
          }
        }
    }

    final String b(int param0) {
        if (!(param0 != this.field_h)) {
            return og.field_g + this.field_n + " " + this.field_z;
        }
        if (-3 == (this.field_h ^ -1)) {
            return wj.field_d + this.field_n + " " + this.field_z;
        }
        if (!(this.field_h != 3)) {
            return cf.field_c + this.field_n + " " + this.field_z;
        }
        return this.field_n + " " + this.field_z;
    }

    ga() {
        this.field_b = null;
        this.field_A = null;
        this.field_i = null;
        this.field_m = null;
        this.field_t = (int)(15.0 * Math.random()) + 25;
        this.field_w = 40 - -(int)(Math.random() * 20.0);
        this.field_v = (int)(Math.random() * 45.0) + 15;
        this.field_B = 25 - -(int)(Math.random() * 35.0);
        this.field_w = this.field_w + ha.field_q * 5;
        this.field_e = 0;
        this.field_t = this.field_t + ha.field_q * 10;
        this.field_h = 0;
        this.field_q = 50;
        this.field_v = this.field_v + 8 * ha.field_q;
        this.field_B = this.field_B + ha.field_q * 5;
        this.field_d = (int)(12.0 * Math.random());
        this.a((byte) 85);
        this.c((byte) 41);
        this.field_b = new oh((int)(2.0 * Math.random()) + 2);
        this.field_b.field_d = 8;
        this.field_A = new oh(0);
        this.field_A.field_d = 8;
        this.field_i = new oh(5);
        this.field_s = this.field_w;
        this.field_i.field_c = 2;
        this.field_u = this.field_v;
        this.field_i.field_d = 2;
        this.field_m = new pc();
    }

    static {
        field_k = new jj();
        field_j = 0;
        field_p = "Type your email address again to make sure it's correct";
        field_o = new java.math.BigInteger("65537");
        field_r = new jj();
        field_c = -1;
        field_l = "to keep fullscreen or";
        field_a = "to over <%0> great games";
    }
}
