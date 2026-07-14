/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lk {
    private int[] field_E;
    private ek field_n;
    int[] field_O;
    private int field_H;
    int[] field_u;
    private int[] field_C;
    private int[] field_v;
    private int[] field_l;
    static String field_p;
    private int[] field_J;
    private int[] field_M;
    private int[] field_T;
    private int[] field_x;
    static boolean field_F;
    private na field_A;
    private cb[][] field_R;
    private int field_K;
    private int[] field_r;
    private cb[][] field_L;
    static int field_B;
    private int[] field_S;
    private int[] field_G;
    static int[] field_N;
    private int[] field_w;
    int[] field_q;
    static byte[][] field_o;
    private int[] field_t;
    private long field_P;
    private kj field_y;
    private int field_z;
    private boolean field_D;
    private int field_m;
    private long field_U;
    private boolean field_I;
    private int field_Q;
    private ih field_s;

    private final void a(int param0, byte param1, int param2) {
        ((hl) this).field_G[param2] = param0;
        ((hl) this).field_t[param2] = vg.a(param0, -128);
        if (param1 <= 30) {
            return;
        }
        this.a(param2, 2, param0);
    }

    private final void a(boolean param0, int param1, int param2) {
        ((hl) this).field_M[param2] = param1;
        if (param0) {
            return;
        }
        ((hl) this).field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
    }

    final boolean b(cb param0, int param1) {
        if (param1 != 0) {
            ((hl) this).field_J = null;
        }
        if (param0.field_C != null) {
            return false;
        }
        if (!((param0.field_h ^ -1) > -1)) {
            param0.b((byte) -128);
            if (param0.field_u > 0) {
                if (!(((hl) this).field_L[param0.field_z][param0.field_u] != param0)) {
                    ((hl) this).field_L[param0.field_z][param0.field_u] = null;
                }
            }
        }
        return true;
    }

    final synchronized void b(int param0, int param1) {
        ((hl) this).field_K = param1;
        if (param0 != -180) {
            Object var4 = null;
            boolean discarded$0 = ((hl) this).a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_o = null;
        if (!param0) {
            hl.d(-92);
        }
        field_N = null;
    }

    final static boolean a(boolean param0, th param1) {
        if (!param0) {
            hl.f(53, 103);
        }
        return (param1.g(1, 26527) ^ -1) == -2 ? true : false;
    }

    private final void e(int param0, int param1) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 <= 39) {
            ((hl) this).field_I = false;
        }
        cb var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpne L167
            }
            if (!(null == var3.field_C)) {
                var3.field_C.h(b.field_r / 100);
                if (!(!var3.field_C.h())) {
                    ((hl) this).field_y.field_m.a((lk) (Object) var3.field_C);
                }
                var3.c(0);
            }
            if (!(-1 >= (var3.field_h ^ -1))) {
                ((hl) this).field_R[var3.field_z][var3.field_q] = null;
            }
            var3.b((byte) -116);
            var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
        }
    }

    final synchronized boolean a(int param0, ih param1, byte param2, ja param3, sh param4) {
        int[] var7_array = null;
        int var9 = 0;
        wj var10 = null;
        wj var10_ref = null;
        int var11 = Lexicominos.field_L ? 1 : 0;
        param1.b();
        int var6 = 1;
        if (param2 != 102) {
            return false;
        }
        Object var7 = null;
        if (!(0 >= param0)) {
            var7_array = new int[]{param0};
        }
        cj var8 = (cj) (Object) param1.field_i.c((byte) -111);
        while (var8 != null) {
            var9 = (int)var8.field_d;
            var10 = (wj) (Object) ((hl) this).field_A.a((long)var9, (byte) 120);
            if (var10 == null) {
                var10_ref = ug.a(param4, var9, true);
                if (var10_ref == null) {
                    var6 = 0;
                } else {
                    ((hl) this).field_A.a((kd) (Object) var10_ref, (byte) -48, (long)var9);
                }
            }
            if (var10_ref != null) {
                if (!var10_ref.a(var8.field_h, param3, (byte) 116, var7_array)) {
                    var6 = 0;
                }
            }
            var8 = (cj) (Object) param1.field_i.a((byte) -91);
        }
        if (!(var6 == 0)) {
            param1.a();
        }
        return var6 != 0;
    }

    final void a(byte param0, cb param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = param1.field_w.field_i.length;
          if (param0 == 92) {
            break L0;
          } else {
            ((hl) this).field_v = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!param2) {
              break L2;
            } else {
              if (!param1.field_w.field_l) {
                break L2;
              } else {
                var6 = -param1.field_w.field_k + var4 + var4;
                var5 = (int)((long)var6 * (long)((hl) this).field_u[param1.field_z] >> 1425469254);
                var4 = var4 << 8;
                if ((var4 ^ -1) >= (var5 ^ -1)) {
                  param1.field_C.c(true);
                  var5 = var4 + (var4 - (1 - -var5));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)var4 * (long)((hl) this).field_u[param1.field_z] >> -839552186);
          break L1;
        }
        param1.field_C.b(var5);
    }

    private final synchronized void a(boolean param0, int param1) {
        ((hl) this).field_n.g();
        ((hl) this).field_s = null;
        this.a(param0, (byte) -87);
        if (param1 != 43) {
            ((hl) this).a(-117);
        }
    }

    final synchronized void d(boolean param0) {
        if (param0) {
            field_B = -22;
        }
        this.a(true, 43);
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var3 = 240 & param1;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param1;
          var5 = param1 >> 1474627272 & 127;
          var6 = (8341718 & param1) >> -1751248496;
          this.a(var6, var5, var4, 0);
          return;
        } else {
          L0: {
            if ((var3 ^ -1) != -145) {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = 127 & param1 >> 2038571976;
                var6 = 127 & param1 >> -1219503024;
                this.a((byte) -103, var6, var4, var5);
                return;
              } else {
                L1: {
                  if (param0 <= -21) {
                    break L1;
                  } else {
                    ((hl) this).field_n = null;
                    break L1;
                  }
                }
                if ((var3 ^ -1) == -177) {
                  L2: {
                    var4 = 15 & param1;
                    var5 = param1 >> -1878661176 & 127;
                    var6 = (8388315 & param1) >> 1749186736;
                    if (0 == var5) {
                      ((hl) this).field_t[var4] = (var6 << 91688110) + vg.a(((hl) this).field_t[var4], -2080769);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 != var5) {
                      break L3;
                    } else {
                      ((hl) this).field_t[var4] = vg.a(-16257, ((hl) this).field_t[var4]) - -(var6 << 737964263);
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -2) {
                      break L4;
                    } else {
                      ((hl) this).field_x[var4] = vg.a(-16257, ((hl) this).field_x[var4]) - -(var6 << 1375367);
                      break L4;
                    }
                  }
                  L5: {
                    if (-34 == (var5 ^ -1)) {
                      ((hl) this).field_x[var4] = var6 + vg.a(-128, ((hl) this).field_x[var4]);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != var5) {
                      break L6;
                    } else {
                      ((hl) this).field_S[var4] = vg.a(((hl) this).field_S[var4], -16257) + (var6 << 1325931399);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 37) {
                      ((hl) this).field_S[var4] = vg.a(((hl) this).field_S[var4], -128) - -var6;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      ((hl) this).field_J[var4] = vg.a(-16257, ((hl) this).field_J[var4]) - -(var6 << 1535161991);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (39 != var5) {
                      break L9;
                    } else {
                      ((hl) this).field_J[var4] = vg.a(((hl) this).field_J[var4], -128) - -var6;
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -11) {
                      break L10;
                    } else {
                      ((hl) this).field_C[var4] = vg.a(((hl) this).field_C[var4], -16257) + (var6 << -1606040409);
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 == (var5 ^ -1)) {
                      ((hl) this).field_C[var4] = var6 + vg.a(-128, ((hl) this).field_C[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (11 != var5) {
                      break L12;
                    } else {
                      ((hl) this).field_l[var4] = (var6 << 857588871) + vg.a(-16257, ((hl) this).field_l[var4]);
                      break L12;
                    }
                  }
                  L13: {
                    if (43 == var5) {
                      ((hl) this).field_l[var4] = vg.a(-128, ((hl) this).field_l[var4]) + var6;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (64 != var5) {
                      break L14;
                    } else {
                      if (-65 < (var6 ^ -1)) {
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -2);
                        break L14;
                      } else {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 1);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 65) {
                      if (64 <= var6) {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 2);
                        break L15;
                      } else {
                        this.a(var4, 16384);
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((var5 ^ -1) != -100) {
                      break L16;
                    } else {
                      ((hl) this).field_v[var4] = (var6 << -1274034457) + vg.a(127, ((hl) this).field_v[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) != -99) {
                      break L17;
                    } else {
                      ((hl) this).field_v[var4] = var6 + vg.a(16256, ((hl) this).field_v[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 101) {
                      ((hl) this).field_v[var4] = (var6 << -1515964537) + vg.a(((hl) this).field_v[var4], 127) + 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 100) {
                      ((hl) this).field_v[var4] = vg.a(16256, ((hl) this).field_v[var4]) + 16384 - -var6;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (120 == var5) {
                      this.e(99, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if ((var5 ^ -1) != -122) {
                      break L21;
                    } else {
                      this.h(var4, 16645);
                      break L21;
                    }
                  }
                  L22: {
                    if (123 == var5) {
                      this.d(112, var4);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (6 != var5) {
                      break L23;
                    } else {
                      var7 = ((hl) this).field_v[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L23;
                      } else {
                        ((hl) this).field_r[var4] = vg.a(((hl) this).field_r[var4], -16257) + (var6 << 1478163335);
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-39 != (var5 ^ -1)) {
                      break L24;
                    } else {
                      var7 = ((hl) this).field_v[var4];
                      if (16384 == var7) {
                        ((hl) this).field_r[var4] = var6 + vg.a(((hl) this).field_r[var4], -128);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (16 != var5) {
                      break L25;
                    } else {
                      ((hl) this).field_u[var4] = vg.a(-16257, ((hl) this).field_u[var4]) + (var6 << 1328337447);
                      break L25;
                    }
                  }
                  L26: {
                    if (48 == var5) {
                      ((hl) this).field_u[var4] = var6 + vg.a(((hl) this).field_u[var4], -128);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 81) {
                      if ((var6 ^ -1) > -65) {
                        this.c(-785046068, var4);
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -5);
                        break L27;
                      } else {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (var5 == 17) {
                      this.a(false, (var6 << -339395385) + (-16257 & ((hl) this).field_M[var4]), var4);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(false, (((hl) this).field_M[var4] & -128) + var6, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> -1054065688;
                    this.a(var4, 2, var5 + ((hl) this).field_t[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> 702448904;
                      this.c(120, var4, var5);
                      return;
                    } else {
                      if (-225 == (var3 ^ -1)) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 866224809 & 16256) + ((32570 & param1) >> -1359342872);
                        this.b(var5, -16257, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.a(true, (byte) -87);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var4 = param1 & 15;
              var5 = (32699 & param1) >> 32032232;
              var6 = (param1 & 8384220) >> 1691962288;
              if (-1 > (var6 ^ -1)) {
                this.a(var4, var6, (byte) -111, var5);
                return;
              } else {
                this.a(64, var5, var4, 0);
                break L0;
              }
            }
          }
          return;
        }
    }

    final synchronized lk b() {
        return null;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -32) {
            return false;
        }
        return ((hl) this).field_n.d();
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 120) {
            ((hl) this).field_y = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var6 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (param3 != 0) {
            ((hl) this).field_q = null;
        }
        cb var8 = ((hl) this).field_R[param2][param1];
        if (var8 == null) {
            return;
        }
        ((hl) this).field_R[param2][param1] = null;
        if ((2 & ((hl) this).field_q[param2] ^ -1) == -1) {
            var8.field_h = 0;
        } else {
            var6 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var6 != null) {
                if ((var8.field_z ^ -1) == (var6.field_z ^ -1)) {
                    if (0 > var6.field_h) {
                        if (!(var6 == var8)) {
                            var8.field_h = 0;
                            break;
                        }
                    }
                }
                var6 = (cb) (Object) ((hl) this).field_y.field_n.f(param3 ^ 2);
            }
        }
    }

    private final int a(cb param0, int param1) {
        int var3 = ((hl) this).field_C[param0.field_z];
        int var4 = -57 / ((param1 - 21) / 32);
        if ((var3 ^ -1) > -8193) {
            return 32 + param0.field_k * var3 >> 1760926662;
        }
        return -(32 + (-param0.field_k + 128) * (-var3 + 16384) >> -1453334842) + 16384;
    }

    final static void f(int param0, int param1) {
        int var3 = Lexicominos.field_L ? 1 : 0;
        wa var4 = (wa) (Object) ki.field_b.a(true);
        while (var4 != null) {
            na.a((byte) -126, var4, param0);
            var4 = (wa) (Object) ki.field_b.f(2);
        }
        if (param1 != -2212) {
            return;
        }
        mc var5 = (mc) (Object) vh.field_a.a(true);
        while (var5 != null) {
            fj.a(param0, var5, false);
            var5 = (mc) (Object) vh.field_a.f(param1 ^ -2210);
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (-1 >= (param0 ^ -1)) {
            ((hl) this).field_w[param0] = param1;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                ((hl) this).field_w[var4] = param1;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            ((hl) this).field_u = null;
            break L2;
          }
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        this.a(param2, 43);
        ((hl) this).field_n.a(param0.field_h);
        if (param3 != -5953) {
            ((hl) this).field_t = null;
        }
        ((hl) this).field_D = param1 ? true : false;
        ((hl) this).field_P = 0L;
        int var5 = ((hl) this).field_n.e();
        for (var6 = 0; (var5 ^ -1) < (var6 ^ -1); var6++) {
            ((hl) this).field_n.c(var6);
            ((hl) this).field_n.a(var6);
            ((hl) this).field_n.b(var6);
        }
        ((hl) this).field_z = ((hl) this).field_n.a();
        ((hl) this).field_m = ((hl) this).field_n.field_a[((hl) this).field_z];
        ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
    }

    final synchronized int a() {
        return 0;
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        nc var6_ref_nc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        th var28 = null;
        var26 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 0) {
          L0: {
            var28 = ig.field_a;
            var2 = var28.d(true);
            if (-1 == (var2 ^ -1)) {
              var3 = var28.b(param0 + -1698573656);
              var4 = (sj) (Object) il.field_b.a(true);
              L1: while (true) {
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    if ((var3 ^ -1) != (var4.field_h ^ -1)) {
                      var4 = (sj) (Object) il.field_b.f(param0 + 2);
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var4 == null) {
                  ck.b((byte) -32);
                  return;
                } else {
                  L3: {
                    var5 = var28.d(true);
                    if ((var5 ^ -1) == -1) {
                      break L3;
                    } else {
                      var6 = var4.field_o;
                      var7 = var4.field_m;
                      f.field_l[0].field_b = false;
                      f.field_l[0].field_f = null;
                      f.field_l[0].field_d = og.field_c;
                      var8_int = 1;
                      L4: while (true) {
                        if (var5 <= var8_int) {
                          var4.field_j = new String[3][var6];
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var4.field_i = new long[3][var6];
                          var10 = new long[3][var6];
                          var4.field_n = new int[3][var7 * var6];
                          var11 = new int[3][var7 * var6];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var28.d(true);
                          if (-1 <= (var18 ^ -1)) {
                            break L3;
                          } else {
                            var19 = 0;
                            L5: while (true) {
                              if (var19 >= var18) {
                                break L3;
                              } else {
                                L6: {
                                  var20 = var28.d(true);
                                  var21 = f.field_l[var20].field_d;
                                  var22 = var28.f((byte) -86);
                                  var24 = var28.field_h;
                                  if (var19 >= var6) {
                                    break L6;
                                  } else {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = f.field_l[var20].field_f;
                                    var10[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L7: while (true) {
                                      if ((var7 ^ -1) >= (var25 ^ -1)) {
                                        break L6;
                                      } else {
                                        var15++;
                                        var11[0][var15] = var28.d((byte) 19);
                                        var25++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                L8: {
                                  if (var21 == null) {
                                    break L8;
                                  } else {
                                    if (!md.a(var21, -105)) {
                                      break L8;
                                    } else {
                                      var8[1][var13] = og.field_c;
                                      var9[1][var13] = null;
                                      var10[1][var13] = var22;
                                      var13++;
                                      var28.field_h = var24;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var25 >= var7) {
                                          break L8;
                                        } else {
                                          var16++;
                                          var11[1][var16] = var28.d((byte) 19);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (var14 >= var6) {
                                    break L10;
                                  } else {
                                    if (f.field_l[var20].field_b) {
                                      break L10;
                                    } else {
                                      f.field_l[var20].field_b = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = f.field_l[var20].field_f;
                                      var10[2][var14] = var22;
                                      var28.field_h = var24;
                                      var14++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var25 >= var7) {
                                          break L10;
                                        } else {
                                          var17++;
                                          var11[2][var17] = var28.d((byte) 19);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          L12: {
                            f.field_l[var8_int].field_d = var28.c(false);
                            f.field_l[var8_int].field_b = false;
                            if (-2 != (var28.d(true) ^ -1)) {
                              f.field_l[var8_int].field_f = null;
                              break L12;
                            } else {
                              f.field_l[var8_int].field_f = var28.c(false);
                              break L12;
                            }
                          }
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                  var4.field_k = true;
                  var4.b((byte) -117);
                  break L0;
                }
              }
            } else {
              if (-2 == (var2 ^ -1)) {
                var3 = var28.b(-1698573656);
                var4_long = var28.f((byte) -102);
                var6_ref_nc = (nc) (Object) ok.field_b.a(true);
                L13: while (true) {
                  L14: {
                    if (var6_ref_nc == null) {
                      break L14;
                    } else {
                      if ((var3 ^ -1) == (var6_ref_nc.field_j ^ -1)) {
                        break L14;
                      } else {
                        var6_ref_nc = (nc) (Object) ok.field_b.f(param0 + 2);
                        continue L13;
                      }
                    }
                  }
                  if (var6_ref_nc != null) {
                    var6_ref_nc.field_h = var4_long;
                    var6_ref_nc.b((byte) -118);
                    break L0;
                  } else {
                    ck.b((byte) -95);
                    return;
                  }
                }
              } else {
                uj.a("HS1: " + qj.h(param0 + -117), (Throwable) null, 1);
                ck.b((byte) -70);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
            this.d(-33, -1);
        } else {
            this.e(71, -1);
        }
        this.h(-1, 16645);
        if (param1 != -87) {
            return;
        }
        for (var3 = 0; var3 < 16; var3++) {
            ((hl) this).field_E[var3] = ((hl) this).field_G[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            ((hl) this).field_t[var5] = vg.a(((hl) this).field_G[var5], -128);
            var5++;
        }
    }

    private final void d(int param0, int param1) {
        int var5 = Lexicominos.field_L ? 1 : 0;
        cb var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpeq L42
            } else {
                if (!(0 <= var3.field_h)) {
                    ((hl) this).field_R[var3.field_z][var3.field_q] = null;
                    var3.field_h = 0;
                }
            }
            var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
        }
        int var4 = -29 % ((param0 - 60) / 51);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -83) {
            ((hl) this).field_S = null;
        }
    }

    final boolean a(int[] param0, int param1, cb param2, int param3, int param4) {
        int var6 = 0;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Lexicominos.field_L ? 1 : 0;
          param2.field_m = b.field_r / 100;
          if ((param2.field_h ^ -1) > -1) {
            break L0;
          } else {
            L1: {
              if (param2.field_C == null) {
                break L1;
              } else {
                if (!param2.field_C.f()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param2.c(0);
              param2.b((byte) -123);
              if (-1 <= (param2.field_u ^ -1)) {
                break L2;
              } else {
                if (((hl) this).field_L[param2.field_z][param2.field_u] != param2) {
                  break L2;
                } else {
                  ((hl) this).field_L[param2.field_z][param2.field_u] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param2.field_v;
          if (var6 > 0) {
            L4: {
              var6 = var6 - (int)(0.5 + Math.pow(2.0, (double)((hl) this).field_S[param2.field_z] * 0.0004921259842519685) * 16.0);
              if (0 <= var6) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param2.field_v = var6;
            break L3;
          } else {
            break L3;
          }
        }
        param2.field_C.g(this.a((byte) -120, param2));
        var7 = param2.field_r;
        param2.field_x = param2.field_x + 1;
        if (param4 >= 54) {
          L5: {
            param2.field_i = param2.field_i + var7.field_d;
            var8 = 0;
            var9 = (double)((param2.field_l * param2.field_v >> -1175855284) + (-60 + param2.field_q << -812459704)) * 0.000005086263020833333;
            if ((var7.field_e ^ -1) >= -1) {
              break L5;
            } else {
              L6: {
                if (0 >= var7.field_b) {
                  param2.field_j = param2.field_j + 128;
                  break L6;
                } else {
                  param2.field_j = param2.field_j + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                  break L6;
                }
              }
              if (-819201 >= (var7.field_e * param2.field_j ^ -1)) {
                var8 = 1;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L7: {
            if (null == var7.field_c) {
              break L7;
            } else {
              L8: {
                if (0 >= var7.field_j) {
                  param2.field_F = param2.field_F + 128;
                  break L8;
                } else {
                  param2.field_F = param2.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_j));
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (var7.field_c.length - 2 <= param2.field_B) {
                    break L10;
                  } else {
                    if (param2.field_F <= (var7.field_c[param2.field_B + 2] << -1082231256 & 65280)) {
                      break L10;
                    } else {
                      param2.field_B = param2.field_B + 2;
                      continue L9;
                    }
                  }
                }
                if ((param2.field_B ^ -1) != (-2 + var7.field_c.length ^ -1)) {
                  break L7;
                } else {
                  if (0 != var7.field_c[param2.field_B + 1]) {
                    break L7;
                  } else {
                    var8 = 1;
                    break L7;
                  }
                }
              }
            }
          }
          L11: {
            if (-1 < (param2.field_h ^ -1)) {
              break L11;
            } else {
              if (var7.field_g == null) {
                break L11;
              } else {
                if (-1 != (1 & ((hl) this).field_q[param2.field_z] ^ -1)) {
                  break L11;
                } else {
                  L12: {
                    if (param2.field_u < 0) {
                      break L12;
                    } else {
                      if (param2 == ((hl) this).field_L[param2.field_z][param2.field_u]) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if ((var7.field_l ^ -1) >= -1) {
                      param2.field_h = param2.field_h + 128;
                      break L13;
                    } else {
                      param2.field_h = param2.field_h + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if ((var7.field_g.length + -2 ^ -1) >= (param2.field_y ^ -1)) {
                        break L15;
                      } else {
                        if ((var7.field_g[param2.field_y + 2] & 255) << -1357795512 >= param2.field_h) {
                          break L15;
                        } else {
                          param2.field_y = param2.field_y + 2;
                          continue L14;
                        }
                      }
                    }
                    if (var7.field_g.length - 2 == param2.field_y) {
                      var8 = 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
            }
          }
          if (var8 == 0) {
            param2.field_C.a(param2.field_m, this.c(param2, 1554), this.a(param2, 87));
            return false;
          } else {
            L16: {
              param2.field_C.h(param2.field_m);
              if (param0 == null) {
                param2.field_C.a(param3);
                break L16;
              } else {
                param2.field_C.b(param0, param1, param3);
                break L16;
              }
            }
            L17: {
              if (param2.field_C.h()) {
                ((hl) this).field_y.field_m.a((lk) (Object) param2.field_C);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              param2.c(0);
              if (-1 < (param2.field_h ^ -1)) {
                break L18;
              } else {
                param2.b((byte) -118);
                if (param2.field_u <= 0) {
                  break L18;
                } else {
                  if (((hl) this).field_L[param2.field_z][param2.field_u] != param2) {
                    break L18;
                  } else {
                    ((hl) this).field_L[param2.field_z][param2.field_u] = null;
                    break L18;
                  }
                }
              }
            }
            return true;
          }
        } else {
          return true;
        }
    }

    private final int c(cb param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (-1 == (((hl) this).field_w[param0.field_z] ^ -1)) {
            return 0;
        }
        rc var10 = param0.field_r;
        rc var11 = var10;
        int var4 = 4096 + ((hl) this).field_J[param0.field_z] * ((hl) this).field_l[param0.field_z] >> 1082569645;
        var4 = var4 * var4 + 16384 >> 1369862127;
        var4 = var4 * param0.field_s - -16384 >> 62750607;
        var4 = ((hl) this).field_H * var4 + 128 >> 1015971880;
        var4 = var4 * ((hl) this).field_w[param0.field_z] + 128 >> 330576328;
        if (!(var11.field_e <= 0)) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var11.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
        }
        if (param1 != 1554) {
            Object var9 = null;
            boolean discarded$0 = ((hl) this).a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
        }
        if (var11.field_c != null) {
            var5 = param0.field_F;
            var6 = var11.field_c[1 + param0.field_B];
            if (!(-2 + var11.field_c.length <= param0.field_B)) {
                var7 = var10.field_c[param0.field_B] << -630288184 & 65280;
                var8 = (var11.field_c[2 + param0.field_B] & 255) << 1468459880;
                var6 = var6 + (-var7 + var5) * (-var6 + var11.field_c[3 + param0.field_B]) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> -1164080218;
        }
        if (-1 > (param0.field_h ^ -1)) {
            if (var11.field_g != null) {
                var5 = param0.field_h;
                var6 = var11.field_g[1 + param0.field_y];
                if (!((param0.field_y ^ -1) <= (-2 + var11.field_g.length ^ -1))) {
                    var7 = var10.field_g[param0.field_y] << -1489113752 & 65280;
                    var8 = (255 & var11.field_g[2 + param0.field_y]) << -239171224;
                    var6 = var6 + (-var6 + var11.field_g[param0.field_y - -3]) * (var5 - var7) / (-var7 + var8);
                }
                var4 = 32 + var4 * var6 >> 100541830;
            }
        }
        return var4;
    }

    private final void c(int param0, int param1) {
        cb var3 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -785046068) {
            return;
        }
        if (!(0 == (4 & ((hl) this).field_q[param1]))) {
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var3 != null) {
                if (!((var3.field_z ^ -1) != (param1 ^ -1))) {
                    var3.field_E = 0;
                }
                var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            }
        }
    }

    private final void a(int param0, int param1) {
        cb var3 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 16384) {
            return;
        }
        if (!((((hl) this).field_q[param0] & 2) == 0)) {
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var3 != null) {
                if (var3.field_z == param0) {
                    if (((hl) this).field_R[param0][var3.field_q] == null) {
                        if (!(-1 >= (var3.field_h ^ -1))) {
                            var3.field_h = 0;
                        }
                    }
                }
                var3 = (cb) (Object) ((hl) this).field_y.field_n.f(param1 + -16382);
            }
        }
    }

    final synchronized lk d() {
        return (lk) (Object) ((hl) this).field_y;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (!((hl) this).field_n.d()) {
            break L0;
          } else {
            var4 = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
            L1: while (true) {
              var5 = ((hl) this).field_P - -((long)param2 * (long)var4);
              if ((((hl) this).field_U - var5 ^ -1L) > -1L) {
                var7 = (int)((((hl) this).field_U + -((hl) this).field_P - (-(long)var4 - -1L)) / (long)var4);
                ((hl) this).field_P = ((hl) this).field_P + (long)var4 * (long)var7;
                ((hl) this).field_y.b(param0, param1, var7);
                param1 = param1 + var7;
                this.b(-11);
                param2 = param2 - var7;
                if (!((hl) this).field_n.d()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((hl) this).field_P = var5;
                break L0;
              }
            }
          }
        }
        ((hl) this).field_y.b(param0, param1, param2);
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
        this.a(param2, param1, true, -5953);
        if (param0 < 26) {
            ((hl) this).a(-128, false, -53);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Lexicominos.field_L ? 1 : 0;
            if (((hl) this).field_n.d()) {
              var2 = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
              L2: while (true) {
                var3 = ((hl) this).field_P + (long)param0 * (long)var2;
                if ((((hl) this).field_U + -var3 ^ -1L) <= -1L) {
                  ((hl) this).field_P = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + ((hl) this).field_U - (((hl) this).field_P - (long)var2)) / (long)var2);
                  ((hl) this).field_P = ((hl) this).field_P + (long)var2 * (long)var5;
                  ((hl) this).field_y.a(var5);
                  param0 = param0 - var5;
                  this.b(-11);
                  if (((hl) this).field_n.d()) {
                    continue L2;
                  } else {
                    ((hl) this).field_y.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((hl) this).field_y.a(param0);
          break L0;
        }
    }

    private final void h(int param0, int param1) {
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            ((hl) this).field_J[param0] = 12800;
            ((hl) this).field_C[param0] = 8192;
            ((hl) this).field_l[param0] = 16383;
            ((hl) this).field_T[param0] = 8192;
            ((hl) this).field_x[param0] = 0;
            ((hl) this).field_S[param0] = 8192;
            this.a(param0, 16384);
            if (param1 == 16645) {
              break L0;
            } else {
              ((hl) this).field_L = null;
              break L0;
            }
          }
          this.c(param1 + -785062713, param0);
          ((hl) this).field_q[param0] = 0;
          ((hl) this).field_v[param0] = 32767;
          ((hl) this).field_r[param0] = 256;
          ((hl) this).field_u[param0] = 0;
          this.a(false, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.h(param0, param1 ^ 0);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -16257) {
            return;
        }
        ((hl) this).field_T[param2] = param0;
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        cb var5 = null;
        ke var6 = null;
        int var6_int = 0;
        cb var7 = null;
        cb var8 = null;
        int var9 = 0;
        wj var10 = null;
        wj var11 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cb stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cb stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cb stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cb stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cb stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        L0: {
          var9 = Lexicominos.field_L ? 1 : 0;
          this.a(64, param3, param0, 0);
          if (-1 == (((hl) this).field_q[param0] & 2 ^ -1)) {
            break L0;
          } else {
            var5 = (cb) (Object) ((hl) this).field_y.field_n.c(2);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_z != param0) {
                    break L2;
                  } else {
                    if ((var5.field_h ^ -1) <= -1) {
                      break L2;
                    } else {
                      ((hl) this).field_R[param0][var5.field_q] = null;
                      ((hl) this).field_R[param0][param3] = var5;
                      var6_int = var5.field_o + (var5.field_l * var5.field_v >> 702668556);
                      var5.field_o = var5.field_o + (param3 - var5.field_q << -742728824);
                      var5.field_q = param3;
                      var5.field_v = 4096;
                      var5.field_l = var6_int + -var5.field_o;
                      return;
                    }
                  }
                }
                var5 = (cb) (Object) ((hl) this).field_y.field_n.d(0);
                continue L1;
              }
            }
          }
        }
        var10 = (wj) (Object) ((hl) this).field_A.a((long)((hl) this).field_E[param0], (byte) 118);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new cb();
            var7.field_w = var6;
            var7.field_z = param0;
            var7.field_p = var10;
            var7.field_r = var10.field_h[param3];
            var7.field_u = var10.field_r[param3];
            var7.field_q = param3;
            var7.field_s = 1024 + var10.field_n[param3] * var11.field_m * (param1 * param1) >> -1489629717;
            var7.field_k = var10.field_q[param3] & 255;
            var7.field_o = (param3 << 375772168) + -(32767 & var10.field_k[param3]);
            var7.field_j = 0;
            if (param2 < -78) {
              L3: {
                var7.field_h = -1;
                var7.field_y = 0;
                var7.field_F = 0;
                var7.field_B = 0;
                if (0 == ((hl) this).field_u[param0]) {
                  var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
                  break L3;
                } else {
                  L4: {
                    var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
                    stackOut_16_0 = this;
                    stackOut_16_1 = 92;
                    stackOut_16_2 = (cb) var7;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    if (0 <= var10.field_k[param3]) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = (cb) (Object) stackIn_18_2;
                      stackOut_18_3 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      break L4;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = (cb) (Object) stackIn_17_2;
                      stackOut_17_3 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_19_3 = stackOut_17_3;
                      break L4;
                    }
                  }
                  ((hl) this).a((byte) stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                  break L3;
                }
              }
              L5: {
                if (0 <= var10.field_k[param3]) {
                  break L5;
                } else {
                  var7.field_C.e(-1);
                  break L5;
                }
              }
              L6: {
                if ((var7.field_u ^ -1) > -1) {
                  break L6;
                } else {
                  L7: {
                    var8 = ((hl) this).field_L[param0][var7.field_u];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if (0 <= var8.field_h) {
                        break L7;
                      } else {
                        ((hl) this).field_R[param0][var8.field_q] = null;
                        var8.field_h = 0;
                        break L7;
                      }
                    }
                  }
                  ((hl) this).field_L[param0][var7.field_u] = var7;
                  break L6;
                }
              }
              ((hl) this).field_y.field_n.b(115, (kd) (Object) var7);
              ((hl) this).field_R[param0][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 2) {
            return;
        }
        if (param2 != ((hl) this).field_E[param0]) {
            ((hl) this).field_E[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((hl) this).field_L[param0][var4] = null;
            }
        }
    }

    final synchronized void c(int param0) {
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > -73) {
            return;
        }
        wj var4 = (wj) (Object) ((hl) this).field_A.c((byte) -95);
        while (var4 != null) {
            var4.a(-122);
            var4 = (wj) (Object) ((hl) this).field_A.a((byte) -91);
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        this.a(param0, (byte) 90, param2);
        if (!param1) {
            Object var5 = null;
            int discarded$0 = this.c((cb) null, -91);
        }
    }

    private final int a(byte param0, cb param1) {
        int var3 = 0;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = (param1.field_v * param1.field_l >> -785046068) + param1.field_o;
          var3 = var3 + (((hl) this).field_r[param1.field_z] * (-8192 + ((hl) this).field_T[param1.field_z]) >> 1736778060);
          if (param0 < -105) {
            break L0;
          } else {
            lk discarded$1 = ((hl) this).d();
            break L0;
          }
        }
        L1: {
          var4 = param1.field_r;
          if ((var4.field_d ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              if (0 < var4.field_k) {
                break L2;
              } else {
                if (-1 <= (((hl) this).field_x[param1.field_z] ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = var4.field_k << 175776194;
              var6 = var4.field_h << 1090801345;
              if ((var6 ^ -1) >= (param1.field_x ^ -1)) {
                break L3;
              } else {
                var5 = param1.field_x * var5 / var6;
                break L3;
              }
            }
            var5 = var5 + (((hl) this).field_x[param1.field_z] >> 1497020263);
            var7 = Math.sin((double)(511 & param1.field_i) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)((double)(param1.field_w.field_m * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)b.field_r + 0.5);
          if (var5 >= 1) {
            stackOut_11_0 = var5;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = ((hl) this).field_z;
          var3 = ((hl) this).field_m;
          var4 = ((hl) this).field_U;
          if (null == ((hl) this).field_s) {
            break L0;
          } else {
            if (((hl) this).field_Q == var3) {
              this.a(((hl) this).field_s, ((hl) this).field_D, ((hl) this).field_I, param0 ^ 5962);
              this.b(param0 ^ 0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if ((var3 ^ -1) != (((hl) this).field_m ^ -1)) {
            L2: {
              ((hl) this).field_z = var2;
              ((hl) this).field_U = var4;
              ((hl) this).field_m = var3;
              if (param0 == -11) {
                break L2;
              } else {
                ((hl) this).field_m = -105;
                break L2;
              }
            }
            L3: {
              if (((hl) this).field_s == null) {
                break L3;
              } else {
                if (var3 <= ((hl) this).field_Q) {
                  break L3;
                } else {
                  ((hl) this).field_z = -1;
                  ((hl) this).field_m = ((hl) this).field_Q;
                  ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((hl) this).field_n.field_a[var2]) {
                  break L5;
                } else {
                  ((hl) this).field_n.c(var2);
                  var6 = ((hl) this).field_n.f(var2);
                  if (-2 == (var6 ^ -1)) {
                    ((hl) this).field_n.f();
                    ((hl) this).field_n.b(var2);
                    if (!((hl) this).field_n.c()) {
                      break L5;
                    } else {
                      if (((hl) this).field_s == null) {
                        L6: {
                          if (!((hl) this).field_D) {
                            break L6;
                          } else {
                            if (0 == var3) {
                              break L6;
                            } else {
                              ((hl) this).field_n.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, (byte) -87);
                        ((hl) this).field_n.g();
                        return;
                      } else {
                        ((hl) this).a(111, ((hl) this).field_D, ((hl) this).field_s);
                        this.b(param0 + 0);
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if (0 != (128 & var6)) {
                        this.g(param0 + -112, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((hl) this).field_n.a(var2);
                    ((hl) this).field_n.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((hl) this).field_n.a();
              var3 = ((hl) this).field_n.field_a[var2];
              var4 = ((hl) this).field_n.d(var3);
              continue L1;
            }
          }
        }
    }

    public hl() {
        ((hl) this).field_E = new int[16];
        ((hl) this).field_O = new int[16];
        ((hl) this).field_H = 256;
        ((hl) this).field_u = new int[16];
        ((hl) this).field_C = new int[16];
        ((hl) this).field_l = new int[16];
        ((hl) this).field_M = new int[16];
        ((hl) this).field_T = new int[16];
        ((hl) this).field_L = new cb[16][128];
        ((hl) this).field_S = new int[16];
        ((hl) this).field_w = new int[16];
        ((hl) this).field_G = new int[16];
        ((hl) this).field_v = new int[16];
        ((hl) this).field_q = new int[16];
        ((hl) this).field_J = new int[16];
        ((hl) this).field_r = new int[16];
        ((hl) this).field_x = new int[16];
        ((hl) this).field_t = new int[16];
        ((hl) this).field_R = new cb[16][128];
        ((hl) this).field_K = 1000000;
        ((hl) this).field_n = new ek();
        ((hl) this).field_y = new kj((hl) this);
        ((hl) this).field_A = new na(128);
        ((hl) this).a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    hl(hl param0) {
        ((hl) this).field_E = new int[16];
        ((hl) this).field_O = new int[16];
        ((hl) this).field_H = 256;
        ((hl) this).field_u = new int[16];
        ((hl) this).field_C = new int[16];
        ((hl) this).field_l = new int[16];
        ((hl) this).field_M = new int[16];
        ((hl) this).field_T = new int[16];
        ((hl) this).field_L = new cb[16][128];
        ((hl) this).field_S = new int[16];
        ((hl) this).field_w = new int[16];
        ((hl) this).field_G = new int[16];
        ((hl) this).field_v = new int[16];
        ((hl) this).field_q = new int[16];
        ((hl) this).field_J = new int[16];
        ((hl) this).field_r = new int[16];
        ((hl) this).field_x = new int[16];
        ((hl) this).field_t = new int[16];
        ((hl) this).field_R = new cb[16][128];
        ((hl) this).field_K = 1000000;
        ((hl) this).field_n = new ek();
        ((hl) this).field_y = new kj((hl) this);
        ((hl) this).field_A = param0.field_A;
        ((hl) this).a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Try again";
    }
}
