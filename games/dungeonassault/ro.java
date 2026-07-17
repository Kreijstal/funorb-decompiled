/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kl {
    private int field_r;
    private int field_A;
    private int field_t;
    private wd field_o;
    private go field_p;
    static boolean field_B;
    private int field_z;
    private cn field_v;
    private pp field_s;
    private sa field_w;
    private cn field_q;
    private eh field_y;
    static boolean field_u;
    private int field_x;
    private int field_C;
    static String field_m;
    private int field_D;
    private dd field_n;

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        super.b(-125);
        var2 = (((ro) this).field_a + -200 >> 1) + ((ro) this).field_k;
        var3 = ((ro) this).field_j + 80;
        gf.b(var2 + -5, -5 + var3, 210, 210, 0);
        rp.a(4, 202, (byte) 108, var2 + -1, 202, kc.field_S, -1 + var3);
        ((ro) this).field_o.a(200, var3, (byte) 102, var2, 200);
        if (((ro) this).field_w != null) {
          ((ro) this).field_w.a((byte) -108);
          if (((ro) this).field_t != 5) {
            if (0 != ((ro) this).field_t) {
              if (4 != ((ro) this).field_t) {
                this.a((byte) -111, ((ro) this).field_k + -18, -60 + ((ro) this).field_i + ((ro) this).field_j, ((ro) this).field_A, false);
                this.a((byte) -109, ((ro) this).field_a + ((ro) this).field_k - 66, -60 + ((ro) this).field_i + ((ro) this).field_j, ((ro) this).field_A + -8, true);
                if (null != ((ro) this).field_v) {
                  var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                  var5 = 192 + (-((ro) this).field_v.field_v + var3);
                  if (100 <= ((ro) this).field_z) {
                    ((ro) this).field_q.b(var4, var5, 256);
                    ((ro) this).field_v.h(var4, var5);
                    var4 = -49 % ((param0 - 41) / 63);
                    return;
                  } else {
                    var6 = (((ro) this).field_z << 8) / 100;
                    ((ro) this).field_q.b(var4, var5, var6);
                    ((ro) this).field_v.d(var4, var5, var6);
                    var4 = -49 % ((param0 - 41) / 63);
                    return;
                  }
                } else {
                  var4 = -49 % ((param0 - 41) / 63);
                  return;
                }
              } else {
                L0: {
                  if (null != ((ro) this).field_v) {
                    var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                    var5 = 192 + (-((ro) this).field_v.field_v + var3);
                    if (100 > ((ro) this).field_z) {
                      var6 = (((ro) this).field_z << 8) / 100;
                      ((ro) this).field_q.b(var4, var5, var6);
                      ((ro) this).field_v.d(var4, var5, var6);
                      break L0;
                    } else {
                      ((ro) this).field_q.b(var4, var5, 256);
                      ((ro) this).field_v.h(var4, var5);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                var4 = -49 % ((param0 - 41) / 63);
                return;
              }
            } else {
              if (null != ((ro) this).field_v) {
                var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                var5 = 192 + (-((ro) this).field_v.field_v + var3);
                if (100 <= ((ro) this).field_z) {
                  ((ro) this).field_q.b(var4, var5, 256);
                  ((ro) this).field_v.h(var4, var5);
                  var4 = -49 % ((param0 - 41) / 63);
                  return;
                } else {
                  var6 = (((ro) this).field_z << 8) / 100;
                  ((ro) this).field_q.b(var4, var5, var6);
                  ((ro) this).field_v.d(var4, var5, var6);
                  var4 = -49 % ((param0 - 41) / 63);
                  return;
                }
              } else {
                var4 = -49 % ((param0 - 41) / 63);
                return;
              }
            }
          } else {
            if (null != ((ro) this).field_v) {
              var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
              var5 = 192 + (-((ro) this).field_v.field_v + var3);
              if (100 <= ((ro) this).field_z) {
                ((ro) this).field_q.b(var4, var5, 256);
                ((ro) this).field_v.h(var4, var5);
                var4 = -49 % ((param0 - 41) / 63);
                return;
              } else {
                var6 = (((ro) this).field_z << 8) / 100;
                ((ro) this).field_q.b(var4, var5, var6);
                ((ro) this).field_v.d(var4, var5, var6);
                var4 = -49 % ((param0 - 41) / 63);
                return;
              }
            } else {
              var4 = -49 % ((param0 - 41) / 63);
              return;
            }
          }
        } else {
          this.a(((ro) this).field_k, -80 + (((ro) this).field_j + ((ro) this).field_i), ((ro) this).field_a, (byte) 4, 80);
          if (((ro) this).field_t != 5) {
            if (0 != ((ro) this).field_t) {
              L1: {
                if (4 != ((ro) this).field_t) {
                  this.a((byte) -111, ((ro) this).field_k + -18, -60 + ((ro) this).field_i + ((ro) this).field_j, ((ro) this).field_A, false);
                  this.a((byte) -109, ((ro) this).field_a + ((ro) this).field_k - 66, -60 + ((ro) this).field_i + ((ro) this).field_j, ((ro) this).field_A + -8, true);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null != ((ro) this).field_v) {
                var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                var5 = 192 + (-((ro) this).field_v.field_v + var3);
                if (100 <= ((ro) this).field_z) {
                  ((ro) this).field_q.b(var4, var5, 256);
                  ((ro) this).field_v.h(var4, var5);
                  var4 = -49 % ((param0 - 41) / 63);
                  return;
                } else {
                  var6 = (((ro) this).field_z << 8) / 100;
                  ((ro) this).field_q.b(var4, var5, var6);
                  ((ro) this).field_v.d(var4, var5, var6);
                  var4 = -49 % ((param0 - 41) / 63);
                  return;
                }
              } else {
                var4 = -49 % ((param0 - 41) / 63);
                return;
              }
            } else {
              L2: {
                if (null != ((ro) this).field_v) {
                  var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                  var5 = 192 + (-((ro) this).field_v.field_v + var3);
                  if (100 > ((ro) this).field_z) {
                    var6 = (((ro) this).field_z << 8) / 100;
                    ((ro) this).field_q.b(var4, var5, var6);
                    ((ro) this).field_v.d(var4, var5, var6);
                    break L2;
                  } else {
                    ((ro) this).field_q.b(var4, var5, 256);
                    ((ro) this).field_v.h(var4, var5);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var4 = -49 % ((param0 - 41) / 63);
              return;
            }
          } else {
            L3: {
              if (null != ((ro) this).field_v) {
                var4 = (-((ro) this).field_v.field_y + 200 >> 1) + var2;
                var5 = 192 + (-((ro) this).field_v.field_v + var3);
                if (100 > ((ro) this).field_z) {
                  var6 = (((ro) this).field_z << 8) / 100;
                  ((ro) this).field_q.b(var4, var5, var6);
                  ((ro) this).field_v.d(var4, var5, var6);
                  break L3;
                } else {
                  ((ro) this).field_q.b(var4, var5, 256);
                  ((ro) this).field_v.h(var4, var5);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var4 = -49 % ((param0 - 41) / 63);
            return;
          }
        }
    }

    private final int e(int param0) {
        int var2 = 0;
        var2 = this.f(-2);
        if (var2 == 0) {
          return 0;
        } else {
          if (param0 > -41) {
            ((ro) this).field_x = -95;
            return (int)((long)((ro) this).field_A * (long)((ro) this).field_D * (long)(var2 * 2 + -((ro) this).field_A) / (long)(var2 * var2));
          } else {
            return (int)((long)((ro) this).field_A * (long)((ro) this).field_D * (long)(var2 * 2 + -((ro) this).field_A) / (long)(var2 * var2));
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, boolean param4) {
        if (param0 < -32) {
          L0: {
            if (!param4) {
              break L0;
            } else {
              if (param3 > 0) {
                this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
                param3 -= 16;
                if (0 < param3) {
                  this.a(tb.field_a, param2 - 9, (byte) 9, param1 + 22, param3);
                  param3 -= 16;
                  param2 -= 24;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
          L1: while (true) {
            if (param3 <= 0) {
              return;
            } else {
              this.a(n.field_e, param2, (byte) 9, param1, param3);
              param3 -= 16;
              if (param3 > 0) {
                this.a(n.field_e, param2 + -15, (byte) 9, param1 - -20, param3);
                param3 -= 16;
                if (param3 <= 0) {
                  return;
                } else {
                  this.a(tb.field_a, param2 - 24, (byte) 9, param1 - -2, param3);
                  param3 -= 16;
                  if (param3 > 0) {
                    this.a(tb.field_a, -24 + (param2 - -15), (byte) 9, 22 + param1, param3);
                    param2 -= 24;
                    param3 -= 16;
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          L2: {
            ((ro) this).field_A = 117;
            if (!param4) {
              break L2;
            } else {
              if (param3 > 0) {
                this.a(tb.field_a, param2 - 24, (byte) 9, param1 + 2, param3);
                param3 -= 16;
                if (0 < param3) {
                  this.a(tb.field_a, param2 - 9, (byte) 9, param1 + 22, param3);
                  param3 -= 16;
                  param2 -= 24;
                  break L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
          L3: while (true) {
            if (param3 <= 0) {
              return;
            } else {
              this.a(n.field_e, param2, (byte) 9, param1, param3);
              param3 -= 16;
              if (param3 > 0) {
                this.a(n.field_e, param2 + -15, (byte) 9, param1 - -20, param3);
                param3 -= 16;
                if (param3 <= 0) {
                  return;
                } else {
                  this.a(tb.field_a, param2 - 24, (byte) 9, param1 - -2, param3);
                  param3 -= 16;
                  if (param3 > 0) {
                    this.a(tb.field_a, -24 + (param2 - -15), (byte) 9, 22 + param1, param3);
                    param2 -= 24;
                    param3 -= 16;
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final void a(q param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (((ro) this).field_t == 1) {
                break L1;
              } else {
                if (param4 >= 20) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (param2 == 9) {
                break L2;
              } else {
                ((ro) this).field_s = null;
                break L2;
              }
            }
            L3: {
              if (param4 < 16) {
                param0.a(param3, (param4 << 2) + param1 + -64, param4 << 4);
                break L3;
              } else {
                if (param4 >= 18) {
                  if (param4 < 20) {
                    param0.a(param3, param4 + (-20 + param1));
                    break L3;
                  } else {
                    param0.a(param3, param1);
                    break L3;
                  }
                } else {
                  param0.a(param3, -param4 - -16 + param1);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ro.R(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void d(int param0) {
        L0: {
          ((ro) this).field_t = 4;
          ((ro) this).field_D = 0;
          if (null != ((ro) this).field_n) {
            ((ro) this).field_n.b((byte) 30);
            break L0;
          } else {
            break L0;
          }
        }
        ((ro) this).field_n = null;
        ((ro) this).field_s.b((byte) 30);
        ((ro) this).field_s = tn.a(((ro) this).field_k - -(-jm.field_i.field_y + ((ro) this).field_a >> 1), -jm.field_i.field_v + ((ro) this).field_i + ((ro) this).field_j, (se) (Object) ne.field_c, jm.field_i, -124, tf.field_g);
        ((ro) this).field_f.a((ne) (Object) ((ro) this).field_s, false);
        ((ro) this).field_y.a((byte) -19);
        System.gc();
        ((ro) this).field_o.a(ga.field_n, bo.field_Lb, -10872);
        ((ro) this).field_A = 0;
        if (param0 != 2) {
          return;
        } else {
          this.a(true, 16711680, al.field_n);
          return;
        }
    }

    public static void f(byte param0) {
        field_m = null;
    }

    final void a(byte param0, int param1) {
        ((ro) this).field_C = 0;
        ((ro) this).field_x = -1;
        ((ro) this).field_t = 1;
        ((ro) this).field_D = param1;
        if (param0 != 101) {
          L0: {
            ((ro) this).field_w = null;
            if (((ro) this).field_n != null) {
              ((ro) this).field_n.b((byte) 30);
              break L0;
            } else {
              break L0;
            }
          }
          ((ro) this).field_n = null;
          return;
        } else {
          L1: {
            if (((ro) this).field_n != null) {
              ((ro) this).field_n.b((byte) 30);
              break L1;
            } else {
              break L1;
            }
          }
          ((ro) this).field_n = null;
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var4 = 37 % ((65 - param2) / 45);
          ((ro) this).field_D = param1;
          ((ro) this).field_t = 1;
          ((ro) this).field_C = param0;
          var5 = this.f(-2);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var5 == 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = oi.b(0, this.f(-2));
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ro) this).field_x = stackIn_3_1;
        if (null != ((ro) this).field_n) {
          ((ro) this).field_n.b((byte) 30);
          ((ro) this).field_n = null;
          return;
        } else {
          ((ro) this).field_n = null;
          return;
        }
    }

    final void b(byte param0) {
        int[] var2 = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        ph var6 = null;
        cn var7 = null;
        cn var8 = null;
        int var9 = 0;
        int[] var10 = null;
        var9 = DungeonAssault.field_K;
        var10 = new int[64];
        var2 = var10;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= 64) {
            var3 = te.a(((ro) this).field_a + -32, ((ro) this).field_i - 28, var10, 16, 8, 0.125);
            var4 = te.b(((ro) this).field_a - 32, -28 + ((ro) this).field_i, 0.125);
            var5 = new cn(0, 0);
            var5.field_B = var4;
            var5.field_v = ((ro) this).field_i - 28;
            var5.field_y = ((ro) this).field_a + -32;
            var6 = new ph(var3, var5);
            var7 = new cn(((ro) this).field_a, ((ro) this).field_i);
            var8 = new cn(((ro) this).field_a, ((ro) this).field_i);
            ((ro) this).field_l = new ph(var7, var8);
            jh.a(((ro) this).field_l);
            if (param0 != 37) {
              this.a(-55, 119, -92, (byte) -82, -62);
              var6.b(16, 16);
              qe.a(23, 13, ((ro) this).field_a + -46, -34 + ((ro) this).field_i, 256, 32, 8, 128);
              jc.a(-26 + ((ro) this).field_i, 16, 14, 1, 2, 1);
              jc.a(((ro) this).field_i - 26, ((ro) this).field_a + -24, 14, 1, param0 ^ 39, 1);
              vd.a(-16 + ((ro) this).field_a, 2, -14561, 2, 8, 0);
              vd.a(((ro) this).field_a, 2, -14561, 2, 0, 6);
              vd.a(((ro) this).field_a, 2, param0 + -14598, 2, 0, 54);
              vd.a(-16 + ((ro) this).field_a, 2, -14561, 2, 8, ((ro) this).field_i - 16);
              vd.a(((ro) this).field_a, 2, -14561, 2, 0, -22 + ((ro) this).field_i);
              jc.a(40, 70, 14, 1, 2, 1);
              jc.a(40, ((ro) this).field_a + -78, 14, 1, 2, 1);
              oe.field_m.h(8, 21);
              oe.field_m.j(-63 + ((ro) this).field_a, 21);
              ad.field_e.i(23, -38 + ((ro) this).field_i);
              ad.field_e.f(-39 + ((ro) this).field_a, ((ro) this).field_i - 38);
              da.a(ak.field_p, cm.field_M, ((ro) this).field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, (se) (Object) ne.field_c);
              jh.b();
              return;
            } else {
              var6.b(16, 16);
              qe.a(23, 13, ((ro) this).field_a + -46, -34 + ((ro) this).field_i, 256, 32, 8, 128);
              jc.a(-26 + ((ro) this).field_i, 16, 14, 1, 2, 1);
              jc.a(((ro) this).field_i - 26, ((ro) this).field_a + -24, 14, 1, param0 ^ 39, 1);
              vd.a(-16 + ((ro) this).field_a, 2, -14561, 2, 8, 0);
              vd.a(((ro) this).field_a, 2, -14561, 2, 0, 6);
              vd.a(((ro) this).field_a, 2, param0 + -14598, 2, 0, 54);
              vd.a(-16 + ((ro) this).field_a, 2, -14561, 2, 8, ((ro) this).field_i - 16);
              vd.a(((ro) this).field_a, 2, -14561, 2, 0, -22 + ((ro) this).field_i);
              jc.a(40, 70, 14, 1, 2, 1);
              jc.a(40, ((ro) this).field_a + -78, 14, 1, 2, 1);
              oe.field_m.h(8, 21);
              oe.field_m.j(-63 + ((ro) this).field_a, 21);
              ad.field_e.i(23, -38 + ((ro) this).field_i);
              ad.field_e.f(-39 + ((ro) this).field_a, ((ro) this).field_i - 38);
              da.a(ak.field_p, cm.field_M, ((ro) this).field_a >> 1, 1917623617, (36 + ne.field_c.field_H >> 1) + 14, (se) (Object) ne.field_c);
              jh.b();
              return;
            }
          } else {
            var10[var3_int] = mp.a(-2147483648, 1579032 + var3_int * 65793);
            var3_int++;
            continue L0;
          }
        }
    }

    final void c(int param0) {
        eh[] var2 = null;
        int var3 = 0;
        eh var4 = null;
        int var5 = 0;
        eh[] var6 = null;
        var5 = DungeonAssault.field_K;
        super.c(-125);
        var6 = rg.field_M;
        var2 = var6;
        var3 = 0;
        if (param0 < -115) {
          L0: while (true) {
            if (var6.length <= var3) {
              bo.field_Lb.a((byte) -19);
              ce.field_v.a((byte) -19);
              kf.field_j.a((byte) -19);
              return;
            } else {
              var4 = var6[var3];
              var4.a((byte) -19);
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    ro(go param0) {
        super(300, 420);
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((ro) this).field_t = 0;
        try {
          L0: {
            L1: {
              ((ro) this).field_p = param0;
              ((ro) this).field_r = 16777215;
              ((ro) this).field_D = 0;
              var2_int = ((ro) this).field_p.field_Y.field_o;
              ((ro) this).field_n = new dd(40 + ((ro) this).field_k, ((ro) this).field_i + ((ro) this).field_j - 118, 0, ((ro) this).field_a + -80, var2_int, ((ro) this).field_D);
              t.a(64, gl.field_Ib, true, true);
              ((ro) this).field_y = rg.field_M[0];
              ((ro) this).field_o = new wd(((ro) this).field_y);
              if (((ro) this).field_p.field_Y.field_l <= 0) {
                ((ro) this).field_s = tn.a((((ro) this).field_a - jm.field_i.field_y >> 1) + ((ro) this).field_k, -jm.field_i.field_v + ((ro) this).field_j + ((ro) this).field_i, (se) (Object) ne.field_c, jm.field_i, -75, pe.field_n);
                ((ro) this).field_f.a((ne) (Object) ((ro) this).field_s, false);
                ((ro) this).field_f.a((ne) (Object) ((ro) this).field_n, false);
                ((ro) this).field_t = 0;
                break L1;
              } else {
                ((ro) this).field_s = tn.a(((ro) this).field_k - -(-jm.field_i.field_y + ((ro) this).field_a >> 1), ((ro) this).field_j + ((ro) this).field_i + -jm.field_i.field_v, (se) (Object) ne.field_c, jm.field_i, -47, hj.field_X);
                ((ro) this).field_f.a((ne) (Object) ((ro) this).field_s, false);
                ((ro) this).field_t = 5;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ro.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final int f(int param0) {
        return (int)(Math.log((double)(((ro) this).field_D - -1)) * 250.0 / Math.log(10.0));
    }

    private final void d(byte param0) {
        ((ro) this).field_s.b((byte) 30);
        ((ro) this).field_s = tn.a((((ro) this).field_a + -jm.field_i.field_y >> 1) + ((ro) this).field_k, -jm.field_i.field_v + (((ro) this).field_i + ((ro) this).field_j), (se) (Object) ne.field_c, jm.field_i, -64, tf.field_g);
        if (param0 > -86) {
            ((ro) this).b((byte) -86);
            ((ro) this).field_f.a((ne) (Object) ((ro) this).field_s, false);
            bo.field_Lb.a((byte) -19);
            ((ro) this).field_t = 3;
            ((ro) this).field_s.field_w = true;
            return;
        }
        ((ro) this).field_f.a((ne) (Object) ((ro) this).field_s, false);
        bo.field_Lb.a((byte) -19);
        ((ro) this).field_t = 3;
        ((ro) this).field_s.field_w = true;
    }

    private final void a(boolean param0, int param1, String param2) {
        cn var5 = null;
        try {
            if (((ro) this).field_w == null) {
                ((ro) this).field_w = new sa(60 + ((ro) this).field_k, (la.field_b.field_H >> 1) + -120 + (((ro) this).field_i + ((ro) this).field_j), ((ro) this).field_a + -120, 80);
                ((ro) this).field_w.field_k = 0;
                var5 = new cn(((ro) this).field_a - 120, 80);
                jh.a(var5);
                this.a(-60, -(la.field_b.field_H >> 1) + 40, ((ro) this).field_a, (byte) 4, 120);
                jh.b();
                ((ro) this).field_w.a(1929, true, var5);
            }
            ((ro) this).field_w.a(param0, (String) null, (byte) 91, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ro.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(String param0, int param1, int param2) {
        int var4_int = ne.field_c.b(param0);
        int var5 = ne.field_c.field_E + ne.field_c.field_H;
        if (param2 > -75) {
            return;
        }
        try {
            ((ro) this).field_v = new cn(var4_int, var5);
            jh.a(((ro) this).field_v);
            ne.field_c.b(param0, 0, ne.field_c.field_H, param1, -1);
            ((ro) this).field_q = rb.a(16, ((ro) this).field_v, param1, (byte) 86);
            ((ro) this).field_v.d(65793);
            jh.b();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ro.P(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        Object var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        var8 = DungeonAssault.field_K;
        super.c((byte) -97);
        ((ro) this).field_o.a((byte) 109, 20);
        if (null != ((ro) this).field_w) {
          L0: {
            ((ro) this).field_w.a(false);
            var2 = 93 % ((-34 - param0) / 57);
            if (((ro) this).field_v != null) {
              ((ro) this).field_z = ((ro) this).field_z + 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((ro) this).field_t != 5) {
              if (((ro) this).field_t != -1) {
                if (((ro) this).field_t == 1) {
                  L2: {
                    ((ro) this).field_A = ((ro) this).field_A + 1;
                    if (18 > ((ro) this).field_A) {
                      break L2;
                    } else {
                      if (0 == (7 & -18 + ((ro) this).field_A)) {
                        o discarded$2 = je.a(0, eb.field_O);
                        break L2;
                      } else {
                        L3: {
                          if (((ro) this).field_x == -1) {
                            break L3;
                          } else {
                            if (((ro) this).field_A < ((ro) this).field_x) {
                              break L3;
                            } else {
                              ((ro) this).field_y.a((byte) -19);
                              System.gc();
                              ((ro) this).field_o.a(ga.field_n, bo.field_Lb, -10872);
                              ((ro) this).field_t = 2;
                              ((ro) this).field_s.field_w = true;
                              return;
                            }
                          }
                        }
                        if (((ro) this).field_A >= this.f(-2)) {
                          System.gc();
                          ((ro) this).field_p.c((byte) -121);
                          this.a(true, 16744448, jk.a(new String[1], wi.field_qb, 30496));
                          this.a(ac.field_h, 16744448, -84);
                          this.d((byte) -94);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    if (((ro) this).field_x == -1) {
                      break L4;
                    } else {
                      if (((ro) this).field_A < ((ro) this).field_x) {
                        break L4;
                      } else {
                        ((ro) this).field_y.a((byte) -19);
                        System.gc();
                        ((ro) this).field_o.a(ga.field_n, bo.field_Lb, -10872);
                        ((ro) this).field_t = 2;
                        ((ro) this).field_s.field_w = true;
                        return;
                      }
                    }
                  }
                  if (((ro) this).field_A >= this.f(-2)) {
                    System.gc();
                    ((ro) this).field_p.c((byte) -121);
                    this.a(true, 16744448, jk.a(new String[1], wi.field_qb, 30496));
                    this.a(ac.field_h, 16744448, -84);
                    this.d((byte) -94);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (2 == ((ro) this).field_t) {
                    if (ga.field_n == ((ro) this).field_o.field_k) {
                      ((ro) this).field_o.a(ga.field_n, ce.field_v, -10872);
                      var3 = ((ro) this).field_p.a(1, ((ro) this).field_C);
                      var4 = in.a(var3, 8);
                      if (var3 != 0) {
                        if (var4 <= 1) {
                          var14 = null;
                          var7 = 0;
                          L5: while (true) {
                            if (var7 >= 4) {
                              var15 = jk.a(new String[1], rp.field_a, 30496);
                              this.a(true, 16711680, sm.field_e + "<br><br>" + var15);
                              this.a(lp.field_n, 8421504, -103);
                              this.d((byte) -88);
                              return;
                            } else {
                              if ((1 << var7 & var3) == 0) {
                                var7++;
                                continue L5;
                              } else {
                                var16 = ((ro) this).field_p.field_Y.field_A[var7].field_n.field_F;
                                var17 = jk.a(new String[1], rp.field_a, 30496);
                                this.a(true, 16711680, sm.field_e + "<br><br>" + var17);
                                this.a(lp.field_n, 8421504, -103);
                                this.d((byte) -88);
                                return;
                              }
                            }
                          }
                        } else {
                          var13 = jk.a(new String[1], od.field_c, 30496);
                          var16 = var13;
                          var16 = var13;
                          this.a(true, 16711680, sm.field_e + "<br><br>" + var13);
                          this.a(lp.field_n, 8421504, -103);
                          this.d((byte) -88);
                          return;
                        }
                      } else {
                        var12 = l.field_f;
                        var16 = var12;
                        var16 = var12;
                        this.a(true, 16711680, sm.field_e + "<br><br>" + var12);
                        this.a(lp.field_n, 8421504, -103);
                        this.d((byte) -88);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (-5 == ((ro) this).field_t) {
                      if (((ro) this).field_o.field_k == ga.field_n) {
                        ((ro) this).field_o.a(ga.field_n, ce.field_v, -10872);
                        this.d((byte) -108);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                ((ro) this).field_D = ((ro) this).field_n.field_F;
                this.e((byte) -97);
                return;
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          L6: {
            var2 = 93 % ((-34 - param0) / 57);
            if (((ro) this).field_v != null) {
              ((ro) this).field_z = ((ro) this).field_z + 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (((ro) this).field_t != 5) {
              if (((ro) this).field_t != -1) {
                if (((ro) this).field_t == 1) {
                  L8: {
                    ((ro) this).field_A = ((ro) this).field_A + 1;
                    if (18 > ((ro) this).field_A) {
                      break L8;
                    } else {
                      if (0 == (7 & -18 + ((ro) this).field_A)) {
                        o discarded$3 = je.a(0, eb.field_O);
                        break L8;
                      } else {
                        L9: {
                          L10: {
                            if (((ro) this).field_x == -1) {
                              break L10;
                            } else {
                              if (((ro) this).field_A < ((ro) this).field_x) {
                                break L10;
                              } else {
                                ((ro) this).field_y.a((byte) -19);
                                System.gc();
                                ((ro) this).field_o.a(ga.field_n, bo.field_Lb, -10872);
                                ((ro) this).field_t = 2;
                                ((ro) this).field_s.field_w = true;
                                break L9;
                              }
                            }
                          }
                          if (((ro) this).field_A < this.f(-2)) {
                            break L9;
                          } else {
                            System.gc();
                            ((ro) this).field_p.c((byte) -121);
                            this.a(true, 16744448, jk.a(new String[1], wi.field_qb, 30496));
                            this.a(ac.field_h, 16744448, -84);
                            this.d((byte) -94);
                            break L9;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L11: {
                    if (((ro) this).field_x == -1) {
                      break L11;
                    } else {
                      if (((ro) this).field_A < ((ro) this).field_x) {
                        break L11;
                      } else {
                        ((ro) this).field_y.a((byte) -19);
                        System.gc();
                        ((ro) this).field_o.a(ga.field_n, bo.field_Lb, -10872);
                        ((ro) this).field_t = 2;
                        ((ro) this).field_s.field_w = true;
                        return;
                      }
                    }
                  }
                  if (((ro) this).field_A >= this.f(-2)) {
                    System.gc();
                    ((ro) this).field_p.c((byte) -121);
                    this.a(true, 16744448, jk.a(new String[1], wi.field_qb, 30496));
                    this.a(ac.field_h, 16744448, -84);
                    this.d((byte) -94);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (2 == ((ro) this).field_t) {
                    if (ga.field_n == ((ro) this).field_o.field_k) {
                      L12: {
                        ((ro) this).field_o.a(ga.field_n, ce.field_v, -10872);
                        var3 = ((ro) this).field_p.a(1, ((ro) this).field_C);
                        var4 = in.a(var3, 8);
                        if (var3 != 0) {
                          if (var4 <= 1) {
                            var9 = null;
                            var7 = 0;
                            L13: while (true) {
                              if (var7 >= 4) {
                                var5 = jk.a(new String[1], rp.field_a, 30496);
                                break L12;
                              } else {
                                if ((1 << var7 & var3) == 0) {
                                  var7++;
                                  continue L13;
                                } else {
                                  var10 = ((ro) this).field_p.field_Y.field_A[var7].field_n.field_F;
                                  var11 = jk.a(new String[1], rp.field_a, 30496);
                                  var5 = var11;
                                  this.a(true, 16711680, sm.field_e + "<br><br>" + var11);
                                  this.a(lp.field_n, 8421504, -103);
                                  this.d((byte) -88);
                                  return;
                                }
                              }
                            }
                          } else {
                            var5 = jk.a(new String[1], od.field_c, 30496);
                            var10 = var5;
                            var10 = var5;
                            break L12;
                          }
                        } else {
                          var5 = l.field_f;
                          break L12;
                        }
                      }
                      this.a(true, 16711680, sm.field_e + "<br><br>" + var5);
                      this.a(lp.field_n, 8421504, -103);
                      this.d((byte) -88);
                      return;
                    } else {
                      break L7;
                    }
                  } else {
                    if (-5 == ((ro) this).field_t) {
                      if (((ro) this).field_o.field_k == ga.field_n) {
                        ((ro) this).field_o.a(ga.field_n, ce.field_v, -10872);
                        this.d((byte) -108);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              } else {
                ((ro) this).field_D = ((ro) this).field_n.field_F;
                this.e((byte) -97);
                return;
              }
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        super.a(param0);
        if ((Object) (Object) hh.field_s == (Object) (Object) ((ro) this).field_s) {
          if (((ro) this).field_t != 5) {
            if (0 != ((ro) this).field_t) {
              if (((ro) this).field_t <= 1) {
                return;
              } else {
                ((ro) this).field_d = true;
                return;
              }
            } else {
              ((ro) this).field_n.field_w = false;
              ((ro) this).field_s.field_w = false;
              ((ro) this).field_p.b(((ro) this).field_D, 69);
              return;
            }
          } else {
            ((ro) this).field_f.a((ne) (Object) ((ro) this).field_n, param0);
            mi.a(((ro) this).field_s, pe.field_n, (se) (Object) ne.field_c, 13195, jm.field_i);
            ((ro) this).field_t = 0;
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        var14 = DungeonAssault.field_K;
        var6 = ((ro) this).field_D;
        if (((ro) this).field_t == 5) {
          int discarded$2 = db.field_v.a(jk.a(new String[1], wm.field_e, 30496), 30 + param0, param1 + -20, param2 - 60, 40, 16777215, -1, 1, 1, la.field_b.field_H);
          if (param3 == 4) {
            return;
          } else {
            ((ro) this).c((byte) 44);
            return;
          }
        } else {
          if (((ro) this).field_t != 0) {
            if (((ro) this).field_t != 4) {
              var7 = (param2 * 5 >> 3) + param0;
              var8 = param1 + 10;
              db.field_v.a(eh.field_a, var7, var8, 16777215, -1);
              db.field_v.b(Integer.toString(this.e(param3 + -60)), var7, var8, 16777215, -1);
              if (param3 == 4) {
                return;
              } else {
                ((ro) this).c((byte) 44);
                return;
              }
            } else {
              if (param3 == 4) {
                return;
              } else {
                ((ro) this).c((byte) 44);
                return;
              }
            }
          } else {
            var7 = (3 * param2 >> 2) + param0;
            var8 = param1;
            db.field_v.a(ab.field_b, var7, var8, ((ro) this).field_r, -1);
            db.field_v.b(Integer.toString(((ro) this).field_D), var7, var8, ((ro) this).field_r, -1);
            var8 = var8 + (2 + db.field_v.field_H);
            db.field_v.a(li.field_e, var7, var8, ((ro) this).field_r, -1);
            db.field_v.b((int)(0.5 + 100.0 * ((ro) this).field_p.field_Y.b(gm.field_d.field_N, ((ro) this).field_D, 82)) + "%", var7, var8, ((ro) this).field_r, -1);
            var8 = var8 + (2 + db.field_v.field_H);
            if (var6 <= ((ro) this).field_p.field_Y.c(-82)) {
              if (var6 < 0) {
                db.field_v.a(jc.field_a, var7, var8, ((ro) this).field_r, -1);
                db.field_v.b(gh.a(-var6, (byte) -123), var7, var8, ((ro) this).field_r, -1);
                var8 = var8 + (2 + db.field_v.field_H);
                if (param3 == 4) {
                  return;
                } else {
                  ((ro) this).c((byte) 44);
                  return;
                }
              } else {
                L0: {
                  db.field_v.a(kl.field_e, var7, var8, ((ro) this).field_r, -1);
                  db.field_v.b(gh.a(var6, (byte) -122), var7, var8, ((ro) this).field_r, -1);
                  var8 = var8 + (2 + db.field_v.field_H);
                  var9 = (double)gm.field_d.field_b / (double)gm.field_d.field_l;
                  var11 = Math.sqrt(var9);
                  var13 = (int)Math.ceil((double)var6 * var11);
                  if (var13 <= gm.field_d.field_b) {
                    break L0;
                  } else {
                    var13 = gm.field_d.field_b;
                    break L0;
                  }
                }
                var6 = var6 - var13;
                db.field_v.a(nm.field_jb, var7, var8, ((ro) this).field_r, -1);
                db.field_v.b(gh.a(var6, (byte) -106), var7, var8, ((ro) this).field_r, -1);
                var8 = var8 + (db.field_v.field_H - -2);
                if (param3 == 4) {
                  return;
                } else {
                  ((ro) this).c((byte) 44);
                  return;
                }
              }
            } else {
              int discarded$3 = db.field_v.a(oo.field_b, 30 + param0, -db.field_v.field_H + var8, param2 - 60, 30, ((ro) this).field_r, -1, 1, 1, db.field_v.field_H);
              if (param3 == 4) {
                return;
              } else {
                ((ro) this).c((byte) 44);
                return;
              }
            }
          }
        }
    }

    final static void a(pm param0, int param1, int param2) {
        wj var3 = null;
        try {
            var3 = ac.field_B;
            int var4 = -85 % ((-8 - param2) / 52);
            var3.d((byte) -126, param1);
            var3.a(6, param0.field_j);
            var3.a(6, param0.field_i);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ro.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void e(byte param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        pp stackIn_9_0 = null;
        pp stackIn_10_0 = null;
        pp stackIn_26_0 = null;
        pp stackIn_27_0 = null;
        pp stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        pp stackOut_8_0 = null;
        pp stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        pp stackOut_9_0 = null;
        pp stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        L0: {
          var2 = ((ro) this).field_p.field_Y.b(gm.field_d.field_N, ((ro) this).field_D, 69);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (1.0 > var2) {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var2 < 0.5) {
              stackOut_4_0 = this;
              stackOut_4_1 = 16777215;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 16776960;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 16711680;
            stackIn_5_0 = stackOut_1_0;
            stackIn_5_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ro) this).field_r = stackIn_5_1;
          if (((ro) this).field_p.field_Y.b(gm.field_d.field_N, 0, 53) != 1.0) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_8_0;
          stackOut_8_0 = ((ro) this).field_s;
          stackIn_26_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (var4 != 0) {
            stackOut_26_0 = (pp) (Object) stackIn_26_0;
            stackOut_26_1 = 1;
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            break L2;
          } else {
            stackOut_9_0 = (pp) (Object) stackIn_9_0;
            stackIn_27_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (var2 >= 1.0) {
              stackOut_27_0 = (pp) (Object) stackIn_27_0;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L2;
            } else {
              stackIn_10_0.field_w = true;
              if (((ro) this).field_D <= ((ro) this).field_p.field_Y.c(-114)) {
                L3: {
                  var5 = (int)(var2 * 4.0);
                  if (var5 > 3) {
                    var5 = 3;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (rg.field_M[var5] != ((ro) this).field_y) {
                    ((ro) this).field_y = rg.field_M[var5];
                    ((ro) this).field_o = new wd(((ro) this).field_y);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  ((ro) this).field_s.field_w = false;
                  ((ro) this).field_r = 16711680;
                  var5 = (int)(var2 * 4.0);
                  if (var5 > 3) {
                    var5 = 3;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (rg.field_M[var5] != ((ro) this).field_y) {
                    ((ro) this).field_y = rg.field_M[var5];
                    ((ro) this).field_o = new wd(((ro) this).field_y);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            }
          }
        }
        stackIn_28_0.field_w = stackIn_28_1 != 0;
        if (((ro) this).field_D > ((ro) this).field_p.field_Y.c(-114)) {
          L7: {
            ((ro) this).field_s.field_w = false;
            ((ro) this).field_r = 16711680;
            var5 = (int)(var2 * 4.0);
            if (var5 > 3) {
              var5 = 3;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (rg.field_M[var5] != ((ro) this).field_y) {
              ((ro) this).field_y = rg.field_M[var5];
              ((ro) this).field_o = new wd(((ro) this).field_y);
              break L8;
            } else {
              break L8;
            }
          }
          return;
        } else {
          L9: {
            var5 = (int)(var2 * 4.0);
            if (var5 > 3) {
              var5 = 3;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (rg.field_M[var5] != ((ro) this).field_y) {
              ((ro) this).field_y = rg.field_M[var5];
              ((ro) this).field_o = new wd(((ro) this).field_y);
              break L10;
            } else {
              break L10;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = false;
        field_u = false;
        field_m = "Black Knight";
    }
}
