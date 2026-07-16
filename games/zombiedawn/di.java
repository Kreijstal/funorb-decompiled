/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends hp implements hh {
    private an field_N;
    private an field_F;
    static rh field_L;
    private an field_H;
    static int field_O;
    static int field_M;
    static boolean field_K;
    static boolean field_J;
    static String field_I;

    public static void b(boolean param0) {
        field_I = null;
        field_L = null;
        if (!param0) {
            di.a(45, -46, -29, (byte) 68, 34);
        }
    }

    final static void a(de param0, int param1, int param2, ec param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            n var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = ZombieDawn.field_J;
            var18 = new n();
            var18.field_l = param0.d((byte) -118);
            var18.field_o = param0.c(102);
            var18.field_i = new byte[var18.field_l][][];
            var18.field_q = new int[var18.field_l];
            var18.field_m = new op[var18.field_l];
            var18.field_n = new op[var18.field_l];
            if (param1 == 30) {
              var18.field_j = new int[var18.field_l];
              var18.field_h = new int[var18.field_l];
              var5 = 0;
              L0: while (true) {
                if (var18.field_l <= var5) {
                  dj.field_l.a(0, (le) (Object) var18);
                  return;
                } else {
                  try {
                    L1: {
                      L2: {
                        L3: {
                          var6_int = param0.d((byte) -124);
                          if (var6_int == 0) {
                            break L3;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L3;
                            } else {
                              if (var6_int == 2) {
                                break L3;
                              } else {
                                L4: {
                                  if (-4 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    if ((var6_int ^ -1) == -5) {
                                      break L4;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                var20 = param0.a(true);
                                var21 = param0.a(true);
                                var9 = param0.d((byte) -122);
                                var10 = new String[var9];
                                var11_int = 0;
                                L5: while (true) {
                                  if ((var9 ^ -1) >= (var11_int ^ -1)) {
                                    L6: {
                                      var24 = new byte[var9][];
                                      var23 = var24;
                                      var22 = var23;
                                      var19 = var22;
                                      var11 = var19;
                                      if (3 == var6_int) {
                                        var12_int = 0;
                                        L7: while (true) {
                                          if (var12_int >= var9) {
                                            break L6;
                                          } else {
                                            var13 = param0.c(100);
                                            var11[var12_int] = new byte[var13];
                                            param0.a(var13, 0, var24[var12_int], 11240);
                                            var12_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                    var18.field_h[var5] = var6_int;
                                    var12 = new Class[var9];
                                    var17 = 0;
                                    var13 = var17;
                                    L8: while (true) {
                                      if ((var9 ^ -1) >= (var17 ^ -1)) {
                                        var18.field_m[var5] = param3.a(var12, tm.b((byte) 89, var20), rd.b(param1, 225), var21);
                                        var18.field_i[var5] = var24;
                                        break L2;
                                      } else {
                                        var12[var17] = tm.b((byte) 72, var10[var17]);
                                        var17++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = param0.a(true);
                                    var11_int++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          var16 = param0.a(true);
                          var15 = param0.a(true);
                          var9 = 0;
                          if (-2 == (var6_int ^ -1)) {
                            var9 = param0.c(101);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var18.field_h[var5] = var6_int;
                        var18.field_j[var5] = var9;
                        var18.field_n[var5] = param3.a((byte) -113, var15, tm.b((byte) 70, var16));
                        break L2;
                      }
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L10: {
                      var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                      var18.field_q[var5] = -1;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    L13: {
                      var6_ref3 = (Exception) (Object) decompiledCaughtException;
                      var18.field_q[var5] = -4;
                      break L13;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L14: {
                      var6_ref4 = decompiledCaughtException;
                      var18.field_q[var5] = -5;
                      break L14;
                    }
                  }
                  var5++;
                  continue L0;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        fa.field_p = param0;
        ma.field_k = param4;
        pf.field_g = param1;
        if (param3 != -116) {
            return;
        }
        mh.field_G = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((di) this).field_k + param2;
        int var6 = ((di) this).field_j - -param0;
        int discarded$0 = ia.field_e.a(tg.field_b, 20 + var5, 20 + var6, ((di) this).field_i - 40, ((di) this).field_n + -50, 16777215, -1, 1, 0, ia.field_e.field_I);
        super.a(param0, param1, param2, param3 + param3);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        if (param1 == -6) {
          L0: {
            if (((di) this).field_H == param2) {
              dj.a(109);
              break L0;
            } else {
              if (((di) this).field_F == param2) {
                vj.d(69);
                break L0;
              } else {
                if (((di) this).field_N != param2) {
                  break L0;
                } else {
                  jp.b((byte) -50);
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        if (super.a(127, param1, param2, param3)) {
            return true;
        }
        if (!((param1 ^ -1) != -99)) {
            return ((di) this).b((byte) 123, param2);
        }
        int var5 = -79 % ((-83 - param0) / 32);
        if (99 != param1) {
            return false;
        }
        return ((di) this).a(1, param2);
    }

    public di() {
        super(0, 0, 476, 225, (io) null);
        ((di) this).field_F = new an(hk.field_P, (sk) null);
        ((di) this).field_H = new an(vl.field_f, (sk) null);
        ((di) this).field_N = new an(hl.field_h, (sk) null);
        vm var1 = new vm();
        ((di) this).field_F.field_h = (io) (Object) var1;
        ((di) this).field_H.field_h = (io) (Object) var1;
        ((di) this).field_N.field_h = (io) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -901312671;
        ((di) this).field_H.a(-90, -var2 + ((di) this).field_n + -48, -var3 + ((di) this).field_i >> -1664141983, var4, 30);
        ((di) this).field_N.a(33, ((di) this).field_n - 48 + -var2, var2 + (var4 + (((di) this).field_i + -var3 >> -614422815)), var4, 30);
        ((di) this).field_F.a(-85, -78 + ((di) this).field_n - var2 * 2, -var3 + ((di) this).field_i >> 70518337, var3, 30);
        ((di) this).field_H.field_v = (sk) this;
        ((di) this).field_F.field_v = (sk) this;
        ((di) this).field_F.field_s = nk.field_f;
        ((di) this).field_N.field_v = (sk) this;
        ((di) this).field_N.field_s = fo.field_c;
        ((di) this).a((ga) (Object) ((di) this).field_H, 10);
        ((di) this).a((ga) (Object) ((di) this).field_F, 10);
        ((di) this).a((ga) (Object) ((di) this).field_N, 10);
    }

    final static v[] a(int param0) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        v[] var1 = new v[t.field_h];
        int var2 = 104 / ((4 - param0) / 61);
        for (var3 = 0; t.field_h > var3; var3++) {
            var1[var3] = new v(gl.field_F, kd.field_pb, sl.field_d[var3], bo.field_o[var3], bn.field_c[var3], uf.field_n[var3], vj.field_m[var3], j.field_a);
        }
        no.f((byte) -79);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new rh();
        field_M = 20;
        field_I = "To Customer Support";
    }
}
