/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl implements mta {
    private jaclib.memory.heap.NativeHeapBuffer field_b;
    private int field_f;
    static String field_i;
    static String field_a;
    kda field_h;
    private int field_g;
    private int field_e;
    private int field_k;
    static oc[] field_c;
    private int field_d;
    private boolean field_j;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        if (param2 != 1) {
            Object var5 = null;
            boolean discarded$0 = ((hl) this).a((jaggl.MapBuffer) null, -94);
        }
        if (!(((hl) this).field_e != 0)) {
            this.d(1);
            if (0 >= ((hl) this).field_f) {
                ((hl) this).field_e = 2;
                return (jaclib.memory.Buffer) (Object) ((hl) this).field_b;
            }
            jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
            if (!(!param1)) {
                jaggl.OpenGL.glBufferDataARBub(((hl) this).field_k, ((hl) this).field_d, (byte[]) null, 0, ((hl) this).field_j ? 35040 : 35044);
                if (((hl) this).field_h.field_o.c >= ((hl) this).field_g) {
                    ((hl) this).field_e = 1;
                    return (jaclib.memory.Buffer) (Object) ((hl) this).field_h.field_o;
                }
            }
            if (param0.b()) {
                return null;
            }
            if (!(!param0.a(((hl) this).field_k, ((hl) this).field_g, 35001))) {
                ((hl) this).field_e = 2;
                return (jaclib.memory.Buffer) (Object) param0;
            }
        }
        return null;
    }

    private final void d(int param0) {
        if (!(0 > ((hl) this).field_f)) {
            return;
        }
        if (param0 != 1) {
            this.d(14);
        }
        if (((hl) this).field_h.field_fd) {
            jaggl.OpenGL.glGenBuffersARB(1, uqa.field_x, 0);
            ((hl) this).field_f = uqa.field_x[0];
            jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
        } else {
            ((hl) this).field_f = 0;
        }
    }

    protected final void finalize() throws Throwable {
        ((hl) this).a(12574);
        super.finalize();
    }

    final void c(int param0) {
        if (param0 != -3) {
            return;
        }
        if (((hl) this).field_h.field_fd) {
            jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var47 = TombRacer.field_G ? 1 : 0;
          var8 = 0;
          var9 = param7;
          var10 = 0;
          var11 = -param6 + param5;
          var12 = param7 - param6;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << -713296351;
          if (param4) {
            break L0;
          } else {
            hl.a(-80, 16, -30, 69, false, -29, -88, -33);
            break L0;
          }
        }
        L1: {
          var18 = var13 << -146044127;
          var19 = var16 << 1233342305;
          var20 = var15 << 1206563009;
          var21 = param7 << 1140297729;
          var22 = var12 << 700102785;
          var23 = var17 + (1 + -var21) * var13;
          var24 = var14 - var18 * (var21 + -1);
          var25 = (1 + -var22) * var15 + var19;
          var26 = -(var20 * (var22 + -1)) + var16;
          var27 = var13 << 216442178;
          var28 = var14 << 116045154;
          var29 = var15 << 343087554;
          var30 = var16 << -776850750;
          var31 = 3 * var17;
          var32 = (-3 + var21) * var18;
          var33 = 3 * var19;
          var34 = var20 * (-3 + var22);
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (var12 - 1);
          if (gca.field_d > param2) {
            break L1;
          } else {
            if (hc.field_h >= param2) {
              var57 = vaa.field_a[param2];
              var40 = rp.a(ss.field_c, -16226, pka.field_b, -param5 + param3);
              var41 = rp.a(ss.field_c, -16226, pka.field_b, param5 + param3);
              var42 = rp.a(ss.field_c, -16226, pka.field_b, param3 + -var11);
              var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 + var11);
              nra.a((byte) -55, param0, var42, var57, var40);
              nra.a((byte) -55, param1, var43, var57, var42);
              nra.a((byte) -55, param0, var41, var57, var43);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if (-1 <= var9) {
            return;
          } else {
            L3: {
              if (var9 > var12) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var39 = stackIn_10_0;
              if (var39 != 0) {
                L5: {
                  if (-1 <= var25) {
                    break L5;
                  } else {
                    L6: while (true) {
                      if (-1 >= (var25 ^ -1)) {
                        break L5;
                      } else {
                        var26 = var26 + var37;
                        var25 = var25 + var33;
                        var37 = var37 + var30;
                        var10++;
                        var33 = var33 + var30;
                        continue L6;
                      }
                    }
                  }
                }
                L7: {
                  if (-1 < (var26 ^ -1)) {
                    var25 = var25 + var33;
                    var26 = var26 + var37;
                    var10++;
                    var37 = var37 + var30;
                    var33 = var33 + var30;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var26 = var26 + -var34;
                var25 = var25 + -var38;
                var38 = var38 - var29;
                var34 = var34 - var29;
                break L4;
              } else {
                break L4;
              }
            }
            L8: {
              if (-1 < (var23 ^ -1)) {
                L9: while (true) {
                  if (0 <= var23) {
                    break L8;
                  } else {
                    var23 = var23 + var31;
                    var24 = var24 + var35;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    var8++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (0 <= var24) {
                break L10;
              } else {
                var24 = var24 + var35;
                var23 = var23 + var31;
                var8++;
                var35 = var35 + var28;
                var31 = var31 + var28;
                break L10;
              }
            }
            var24 = var24 + -var32;
            var23 = var23 + -var36;
            var32 = var32 - var27;
            var9--;
            var36 = var36 - var27;
            var40 = -var9 + param2;
            var41 = param2 + var9;
            if (gca.field_d > var41) {
              continue L2;
            } else {
              if (hc.field_h < var40) {
                continue L2;
              } else {
                var42 = rp.a(ss.field_c, -16226, pka.field_b, var8 + param3);
                var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var8);
                if (var39 != 0) {
                  L11: {
                    var44 = rp.a(ss.field_c, -16226, pka.field_b, param3 - -var10);
                    var45 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var10);
                    if (var40 >= gca.field_d) {
                      var58 = vaa.field_a[var40];
                      nra.a((byte) -55, param0, var45, var58, var43);
                      nra.a((byte) -55, param1, var44, var58, var45);
                      nra.a((byte) -55, param0, var42, var58, var44);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (var41 <= hc.field_h) {
                    var59 = vaa.field_a[var41];
                    nra.a((byte) -55, param0, var45, var59, var43);
                    nra.a((byte) -55, param1, var44, var59, var45);
                    nra.a((byte) -55, param0, var42, var59, var44);
                    continue L2;
                  } else {
                    continue L2;
                  }
                } else {
                  L12: {
                    if (var40 < gca.field_d) {
                      break L12;
                    } else {
                      nra.a((byte) -55, param0, var42, vaa.field_a[var40], var43);
                      break L12;
                    }
                  }
                  if (var41 <= hc.field_h) {
                    nra.a((byte) -55, param0, var42, vaa.field_a[var41], var43);
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_i = null;
        int var1 = -35 / ((param0 - -82) / 44);
        field_c = null;
        field_a = null;
    }

    void a(int param0) {
        if (param0 != 12574) {
            ((hl) this).a(72);
        }
        if (!(0 >= ((hl) this).field_f)) {
            ((hl) this).field_h.a(((hl) this).field_g, ((hl) this).field_f, (byte) 62);
            ((hl) this).field_f = -1;
        }
    }

    void a(int param0, int param1) {
        if (((hl) this).field_d < param1) {
            this.d(1);
            if ((((hl) this).field_f ^ -1) < -1) {
                jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
                jaggl.OpenGL.glBufferDataARBub(((hl) this).field_k, param1, (byte[]) null, 0, !((hl) this).field_j ? 35044 : 35040);
                ((hl) this).field_h.field_X = ((hl) this).field_h.field_X + (-((hl) this).field_d + param1);
            } else {
                ((hl) this).field_b = ((hl) this).field_h.a(false, param1, false);
            }
            ((hl) this).field_d = param1;
        }
        ((hl) this).field_g = param1;
        int var3 = -18 % ((param0 - -30) / 36);
    }

    final boolean a(jaggl.MapBuffer param0, int param1) {
        if (param1 < 91) {
            ((hl) this).field_e = -84;
        }
        int var3 = 1;
        if (-1 == ((hl) this).field_e) {
        } else {
            if (-1 < ((hl) this).field_f) {
                jaggl.OpenGL.glBindBufferARB(((hl) this).field_k, ((hl) this).field_f);
                if ((((hl) this).field_e ^ -1) == -2) {
                    jaggl.OpenGL.glBufferSubDataARBa(((hl) this).field_k, 0, ((hl) this).field_d, ((hl) this).field_h.field_o.getAddress());
                } else {
                    var3 = param0.a() ? 1 : 0;
                }
            }
            ((hl) this).field_e = 0;
        }
        return var3 != 0;
    }

    final long b(boolean param0) {
        if (!param0) {
            return -36L;
        }
        return -1 != (((hl) this).field_f ^ -1) ? 0L : ((hl) this).field_b.getAddress();
    }

    hl(kda param0, int param1, boolean param2) {
        ((hl) this).field_f = -1;
        ((hl) this).field_e = 0;
        ((hl) this).field_k = param1;
        ((hl) this).field_j = param2 ? true : false;
        ((hl) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "RANK";
    }
}
